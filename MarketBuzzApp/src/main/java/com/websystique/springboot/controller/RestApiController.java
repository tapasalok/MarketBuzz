package com.websystique.springboot.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.websystique.springboot.model.MarketTip;
import com.websystique.springboot.service.MarketTipService;
import com.websystique.springboot.util.CustomErrorType;

@RestController
@RequestMapping("/api")
public class RestApiController {

	public static final Logger logger = LoggerFactory.getLogger(RestApiController.class);

	@Autowired
	MarketTipService marketTipService; //Service which will do all data retrieval/manipulation work

	// -------------------Retrieve All Users---------------------------------------------

	@RequestMapping(value = "/marketTip/", method = RequestMethod.GET)
	public ResponseEntity<List<MarketTip>> listAllUsers() {
		List<MarketTip> marketTips = marketTipService.findAllUsers();
		if (marketTips.isEmpty()) {
			return new ResponseEntity(HttpStatus.NO_CONTENT);
			// You many decide to return HttpStatus.NOT_FOUND
		}
		return new ResponseEntity<List<MarketTip>>(marketTips, HttpStatus.OK);
	}

	// -------------------Retrieve Single User------------------------------------------

	@RequestMapping(value = "/marketTip/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> getUser(@PathVariable("id") long id) {
		logger.info("Fetching marketTip with id {}", id);
		MarketTip marketTip = marketTipService.findById(id);
		if (marketTip == null) {
			logger.error("marketTip with id {} not found.", id);
			return new ResponseEntity(new CustomErrorType("User with id " + id 
					+ " not found"), HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<MarketTip>(marketTip, HttpStatus.OK);
	}

	// -------------------Create a User-------------------------------------------

	@RequestMapping(value = "/marketTip/", method = RequestMethod.POST)
	public ResponseEntity<?> createUser(@RequestBody MarketTip marketTip, UriComponentsBuilder ucBuilder) {
		logger.info("Creating marketTip : {}", marketTip);

		if (marketTipService.isUserExist(marketTip)) {
			logger.error("Unable to create. A marketTip with name {} already exist", marketTip.getName());
			return new ResponseEntity(new CustomErrorType("Unable to create. A User with name " + 
			marketTip.getName() + " already exist."),HttpStatus.CONFLICT);
		}
		marketTipService.saveUser(marketTip);

		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(ucBuilder.path("/api/marketTip/{id}").buildAndExpand(marketTip.getId()).toUri());
		return new ResponseEntity<String>(headers, HttpStatus.CREATED);
	}

	// ------------------- Update a User ------------------------------------------------

	@RequestMapping(value = "/marketTip/{id}", method = RequestMethod.PUT)
	public ResponseEntity<?> updateUser(@PathVariable("id") long id, @RequestBody MarketTip marketTip) {
		logger.info("Updating marketTip with id {}", id);

		MarketTip marketTipLocal = marketTipService.findById(id);

		if (marketTipLocal == null) {
			logger.error("Unable to update. marketTip with id {} not found.", id);
			return new ResponseEntity(new CustomErrorType("Unable to upate. marketTip with id " + id + " not found."),
					HttpStatus.NOT_FOUND);
		}

		marketTipLocal.setName(marketTip.getName());
		marketTipLocal.setTriggerPrice(marketTip.getTriggerPrice());
		marketTipLocal.setTargetPrice(marketTip.getTargetPrice());
		marketTipLocal.setCallType(marketTip.getCallType());
		marketTipLocal.setStopLoss(marketTip.getStopLoss());
		marketTipLocal.setDuration(marketTip.getDuration());
		marketTipLocal.setCallDate(marketTip.getCallDate());
		
		marketTipService.updateUser(marketTipLocal);
		return new ResponseEntity<MarketTip>(marketTipLocal, HttpStatus.OK);
	}

	// ------------------- Delete a User-----------------------------------------

	@RequestMapping(value = "/marketTip/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<?> deleteUser(@PathVariable("id") long id) {
		logger.info("Fetching & Deleting User with id {}", id);

		MarketTip marketTip = marketTipService.findById(id);
		if (marketTip == null) {
			logger.error("Unable to delete. marketTip with id {} not found.", id);
			return new ResponseEntity(new CustomErrorType("Unable to delete. User with id " + id + " not found."),
					HttpStatus.NOT_FOUND);
		}
		marketTipService.deleteUserById(id);
		return new ResponseEntity<MarketTip>(HttpStatus.NO_CONTENT);
	}

	// ------------------- Delete All Users-----------------------------

	@RequestMapping(value = "/marketTip/", method = RequestMethod.DELETE)
	public ResponseEntity<MarketTip> deleteAllUsers() {
		logger.info("Deleting All Users");

		marketTipService.deleteAllUsers();
		return new ResponseEntity<MarketTip>(HttpStatus.NO_CONTENT);
	}

}