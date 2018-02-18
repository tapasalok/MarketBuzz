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

	// -------------------Retrieve All MarketTips---------------------------------------------

	@RequestMapping(value = "/marketTip/", method = RequestMethod.GET)
	public ResponseEntity<List<MarketTip>> listAllMarketTips() {
		List<MarketTip> marketTips = marketTipService.findAllMarketTips();
		if (marketTips.isEmpty()) {
			return new ResponseEntity(HttpStatus.NO_CONTENT);
			// You many decide to return HttpStatus.NOT_FOUND
		}
		return new ResponseEntity<List<MarketTip>>(marketTips, HttpStatus.OK);
	}

	// -------------------Retrieve Single marketTip------------------------------------------

	@RequestMapping(value = "/marketTip/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> getMarketTip(@PathVariable("id") long id) {
		logger.info("Fetching marketTip with id {}", id);
		MarketTip marketTip = marketTipService.findById(id);
		if (marketTip == null) {
			logger.error("marketTip with id {} not found.", id);
			return new ResponseEntity(new CustomErrorType("marketTip with id " + id 
					+ " not found"), HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<MarketTip>(marketTip, HttpStatus.OK);
	}

	// -------------------Create a marketTip-------------------------------------------

	@RequestMapping(value = "/marketTip/", method = RequestMethod.POST)
	public ResponseEntity<?> createMarketTip(@RequestBody MarketTip marketTip, UriComponentsBuilder ucBuilder) {
		logger.info("Creating marketTip : {}", marketTip);

		if (marketTipService.isMarketTipExist(marketTip)) {
			logger.error("Unable to create. A marketTip with name {} already exist", marketTip.getName());
			return new ResponseEntity(new CustomErrorType("Unable to create. A marketTip with name " + 
			marketTip.getName() + " already exist."),HttpStatus.CONFLICT);
		}
		marketTipService.saveMarketTip(marketTip);

		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(ucBuilder.path("/api/marketTip/{id}").buildAndExpand(marketTip.getId()).toUri());
		return new ResponseEntity<String>(headers, HttpStatus.CREATED);
	}

	// ------------------- Update a marketTip ------------------------------------------------

	@RequestMapping(value = "/marketTip/{id}", method = RequestMethod.PUT)
	public ResponseEntity<?> updateMarketTip(@PathVariable("id") long id, @RequestBody MarketTip marketTip) {
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
		
		marketTipService.updateMarketTip(marketTipLocal);
		return new ResponseEntity<MarketTip>(marketTipLocal, HttpStatus.OK);
	}

	// ------------------- Delete a marketTip-----------------------------------------

	@RequestMapping(value = "/marketTip/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<?> deleteMarketTip(@PathVariable("id") long id) {
		logger.info("Fetching & Deleting marketTip with id {}", id);

		MarketTip marketTip = marketTipService.findById(id);
		if (marketTip == null) {
			logger.error("Unable to delete. marketTip with id {} not found.", id);
			return new ResponseEntity(new CustomErrorType("Unable to delete. marketTip with id " + id + " not found."),
					HttpStatus.NOT_FOUND);
		}
		marketTipService.deleteMarketTipById(id);
		return new ResponseEntity<MarketTip>(HttpStatus.NO_CONTENT);
	}

	// ------------------- Delete All marketTips-----------------------------

	@RequestMapping(value = "/marketTip/", method = RequestMethod.DELETE)
	public ResponseEntity<MarketTip> deleteAllMarketTips() {
		logger.info("Deleting All marketTips");

		marketTipService.deleteAllMarketTips();
		return new ResponseEntity<MarketTip>(HttpStatus.NO_CONTENT);
	}

}