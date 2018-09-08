package com.websystique.springboot.controller;

import java.util.ArrayList;
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
import com.websystique.springboot.model.Message;
import com.websystique.springboot.model.PremiumUser;
import com.websystique.springboot.model.User;
import com.websystique.springboot.service.MarketTipService;
import com.websystique.springboot.util.CustomErrorType;
import org.springframework.web.bind.annotation.CrossOrigin;

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
	
	// -------------------Retrieve All PremiumUsers---------------------------------------------
	@RequestMapping(value = "/premiumusers/", method = RequestMethod.GET)
	public ResponseEntity<List<PremiumUser>> getPremiumUsers() {
		List<PremiumUser> users = marketTipService.getPremiumUsers();
		if (users.isEmpty()) {
			return new ResponseEntity(HttpStatus.NO_CONTENT);
			// You many decide to return HttpStatus.NOT_FOUND
		}
		return new ResponseEntity<List<PremiumUser>>(users, HttpStatus.OK);
	}
	
	// -------------------Retrieve All Users---------------------------------------------
		@RequestMapping(value = "/users/", method = RequestMethod.GET)
		public ResponseEntity<List<User>> getUsers() {
			List<User> users = marketTipService.getUsers();
			if (users.isEmpty()) {
				return new ResponseEntity(HttpStatus.NO_CONTENT);
				// You many decide to return HttpStatus.NOT_FOUND
			}
			return new ResponseEntity<List<User>>(users, HttpStatus.OK);
			 
		}
	
	// -------------------Retrieve All Messages---------------------------------------------
	@RequestMapping(value = "/messages/", method = RequestMethod.GET)
	@CrossOrigin(origins = {"http://localhost:4200", "http://www.gotostock.club","http://localhost:8080"})
	public ResponseEntity<List<Message>> getMessages() {
		List<Message> messages = marketTipService.getMessages();
		if (messages.isEmpty()) {
			return new ResponseEntity(HttpStatus.NO_CONTENT);
			// You many decide to return HttpStatus.NOT_FOUND
		}
		return new ResponseEntity<List<Message>>(messages, HttpStatus.OK);
		 
	}
	
	// -------------------Retrieve All Active MarketTips---------------------------------------------
	@RequestMapping(value = "/activeMarketTip/", method = RequestMethod.GET)
	public ResponseEntity<List<MarketTip>> listAllActiveMarketTips() {
		List<MarketTip> marketTips = marketTipService.findAllActiveMarketTips();
		if (marketTips.isEmpty()) {
			return new ResponseEntity(HttpStatus.NO_CONTENT);
			// You many decide to return HttpStatus.NOT_FOUND
		}
		return new ResponseEntity<List<MarketTip>>(marketTips, HttpStatus.OK);
	}
	
	// -------------------Retrieve All Short Term MarketTips---------------------------------------------
		@RequestMapping(value = "/shortMarketTip/", method = RequestMethod.GET)
		public ResponseEntity<List<MarketTip>> listAllShortMarketTips() {
			List<String> callTypes = new ArrayList<>();
			callTypes.add("Short Term Buy");
			callTypes.add("Short Term Sell");
			List<MarketTip> marketTips = marketTipService.finalAllByCallTypeIn(callTypes);
//			List<MarketTip> marketTips = marketTipService.finalAllByCallType("Short Term Buy");
			if (marketTips.isEmpty()) {
				return new ResponseEntity(HttpStatus.NO_CONTENT);
				// You many decide to return HttpStatus.NOT_FOUND
			}
			return new ResponseEntity<List<MarketTip>>(marketTips, HttpStatus.OK);
		}
		
	// -------------------Retrieve All Long Term MarketTips---------------------------------------------
		@RequestMapping(value = "/longMarketTip/", method = RequestMethod.GET)
		public ResponseEntity<List<MarketTip>> listAllLongMarketTips() {
			List<MarketTip> marketTips = marketTipService.finalAllByCallType("Long Term Buy");
			if (marketTips.isEmpty()) {
				return new ResponseEntity(HttpStatus.NO_CONTENT);
				// You many decide to return HttpStatus.NOT_FOUND
			}
			return new ResponseEntity<List<MarketTip>>(marketTips, HttpStatus.OK);
		}
		
		// -------------------Retrieve All Multibagger MarketTips---------------------------------------------
		@RequestMapping(value = "/multibaggerMarketTip/", method = RequestMethod.GET)
		public ResponseEntity<List<MarketTip>> listAllMultiBaggerMarketTips() {
			List<MarketTip> marketTips = marketTipService.finalAllByCallType("Multibagger Buy");
			if (marketTips.isEmpty()) {
				return new ResponseEntity(HttpStatus.NO_CONTENT);
				// You many decide to return HttpStatus.NOT_FOUND
			}
			return new ResponseEntity<List<MarketTip>>(marketTips, HttpStatus.OK);
		}
	
	// -------------------Retrieve All intradayBuyMarketTip MarketTips---------------------------------------------
		@RequestMapping(value = "/intradayBuyMarketTip/", method = RequestMethod.GET)
		public ResponseEntity<List<MarketTip>> listAllIntradayBuyMarketTips() {
			List<MarketTip> marketTips = marketTipService.finalAllByCallType("Intraday Buy");
			if (marketTips.isEmpty()) {
				return new ResponseEntity(HttpStatus.NO_CONTENT);
				// You many decide to return HttpStatus.NOT_FOUND
			}
			return new ResponseEntity<List<MarketTip>>(marketTips, HttpStatus.OK);
		}
		
	// -------------------Retrieve All intradaySellMarketTip MarketTips---------------------------------------------
		@RequestMapping(value = "/intradaySellMarketTip/", method = RequestMethod.GET)
		public ResponseEntity<List<MarketTip>> listAllIntradaySellMarketTips() {
			List<MarketTip> marketTips = marketTipService.finalAllByCallType("Intraday Sell");
			if (marketTips.isEmpty()) {
				return new ResponseEntity(HttpStatus.NO_CONTENT);
				// You many decide to return HttpStatus.NOT_FOUND
			}
			return new ResponseEntity<List<MarketTip>>(marketTips, HttpStatus.OK);
		}
	
		// -------------------Retrieve All intradayMarketTip MarketTips---------------------------------------------
		@RequestMapping(value = "/intradayMarketTip/", method = RequestMethod.GET)
		public ResponseEntity<List<MarketTip>> listAllIntradayMarketTips() {
			List<String> callTypes = new ArrayList<>();
			callTypes.add("Intraday Buy");
			callTypes.add("Intraday Sell");
			List<MarketTip> marketTips = marketTipService.finalAllByCallTypeIn(callTypes);
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

	// -------------------Create a Message-------------------------------------------
	
	@RequestMapping(value = "/messages/", method = RequestMethod.POST)
	@CrossOrigin(origins = {"http://localhost:4200", "http://www.gotostock.club"})
	public ResponseEntity<?> createMessage(@RequestBody Message message, UriComponentsBuilder ucBuilder) {
		logger.info("Creating message : {}", message);

//		Removing to add same stocks for multiple Calls
//		if (marketTipService.isMarketTipExist(marketTip)) {
//			logger.error("Unable to create. A marketTip with name {} already exist", marketTip.getName());
//			return new ResponseEntity(new CustomErrorType("Unable to create. A marketTip with name " + 
//			marketTip.getName() + " already exist."),HttpStatus.CONFLICT);
//		}
		marketTipService.saveMessage(message);

		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(ucBuilder.path("/api/messages/{id}").buildAndExpand(message.getId()).toUri());
		return new ResponseEntity<String>(headers, HttpStatus.CREATED);
	}
	
	// -------------------Create a Prime User-------------------------------------------
	
		@RequestMapping(value = "/premiumuser/", method = RequestMethod.POST)
		public ResponseEntity<?> createPremiumUser(@RequestBody PremiumUser premiumUser, UriComponentsBuilder ucBuilder) {
			logger.info("Creating PremiumUser : {}", premiumUser);
				
//			Removing to add same stocks for multiple Calls
//			if (marketTipService.isMarketTipExist(marketTip)) {
//				logger.error("Unable to create. A marketTip with name {} already exist", marketTip.getName());
//				return new ResponseEntity(new CustomErrorType("Unable to create. A marketTip with name " + 
//				marketTip.getName() + " already exist."),HttpStatus.CONFLICT);
//			}
			marketTipService.savePremiumUser(premiumUser);

			HttpHeaders headers = new HttpHeaders();
			headers.setLocation(ucBuilder.path("/api/premiumuser/{id}").buildAndExpand(premiumUser.getId()).toUri());
			return new ResponseEntity<String>(headers, HttpStatus.CREATED);
		}
		
		// -------------------Create a User-------------------------------------------
		
			@RequestMapping(value = "/user/", method = RequestMethod.POST)
			public ResponseEntity<?> createUser(@RequestBody User user, UriComponentsBuilder ucBuilder) {
				logger.info("Creating user : {}", user);
					
//				Removing to add same stocks for multiple Calls
//				if (marketTipService.isMarketTipExist(marketTip)) {
//					logger.error("Unable to create. A marketTip with name {} already exist", marketTip.getName());
//					return new ResponseEntity(new CustomErrorType("Unable to create. A marketTip with name " + 
//					marketTip.getName() + " already exist."),HttpStatus.CONFLICT);
//				}
				marketTipService.saveUser(user);

				HttpHeaders headers = new HttpHeaders();
				headers.setLocation(ucBuilder.path("/api/user/{id}").buildAndExpand(user.getId()).toUri());
				return new ResponseEntity<String>(headers, HttpStatus.CREATED);
			}
	
	// -------------------Retrieve Single message------------------------------------------

		@RequestMapping(value = "/messages/{id}", method = RequestMethod.GET)
		@CrossOrigin(origins = {"http://localhost:4200", "http://www.gotostock.club"})
		public ResponseEntity<?> getMessage(@PathVariable("id") long id) {
			logger.info("Fetching Message with id {}", id);
			Message message = marketTipService.findMessageById(id);
			if (message == null) {
				logger.error("message with id {} not found.", id);
				return new ResponseEntity(new CustomErrorType("message with id " + id 
						+ " not found"), HttpStatus.NOT_FOUND);
			}
			return new ResponseEntity<Message>(message, HttpStatus.OK);
		}
	
		
		// ------------------- Update a message ------------------------------------------------

		@RequestMapping(value = "/messages/{id}", method = RequestMethod.PUT)
		@CrossOrigin(origins = {"http://localhost:4200", "http://www.gotostock.club"})
		public ResponseEntity<?> updateMessage(@PathVariable("id") long id, @RequestBody Message message) {
			logger.info("Updating message with id {}", id);

			Message messageLocal = marketTipService.findMessageById(id);

			if (messageLocal == null) {
				logger.error("Unable to update. Message with id {} not found.", id);
				return new ResponseEntity(new CustomErrorType("Unable to upate. Message with id " + id + " not found."),
						HttpStatus.NOT_FOUND);
			}

			messageLocal.setContent(message.getContent());
			messageLocal.setUrl(message.getUrl());
			
			marketTipService.updateMessage(messageLocal);
			return new ResponseEntity<Message>(messageLocal, HttpStatus.OK);
		}
	

	// ------------------- Delete a message-----------------------------------------
		@CrossOrigin(origins = {"http://localhost:4200", "http://www.gotostock.club"})
		@RequestMapping(value = "/messages/{id}", method = RequestMethod.DELETE)
		public ResponseEntity<?> deleteMessage(@PathVariable("id") long id) {
			logger.info("Fetching & Deleting Message with id {}", id);

			Message message = marketTipService.findMessageById(id);
			if (message == null) {
				logger.error("Unable to delete. message with id {} not found.", id);
				return new ResponseEntity(new CustomErrorType("Unable to delete. marketTip with id " + id + " not found."),
						HttpStatus.NOT_FOUND);
			}
			marketTipService.deleteMessageById(id);
			return new ResponseEntity<MarketTip>(HttpStatus.NO_CONTENT);
		}
	
	// -------------------Create a marketTip-------------------------------------------

	@RequestMapping(value = "/marketTip/", method = RequestMethod.POST)
	public ResponseEntity<?> createMarketTip(@RequestBody MarketTip marketTip, UriComponentsBuilder ucBuilder) {
		logger.info("Creating marketTip : {}", marketTip);

//		Removing to add same stocks for multiple Calls
//		if (marketTipService.isMarketTipExist(marketTip)) {
//			logger.error("Unable to create. A marketTip with name {} already exist", marketTip.getName());
//			return new ResponseEntity(new CustomErrorType("Unable to create. A marketTip with name " + 
//			marketTip.getName() + " already exist."),HttpStatus.CONFLICT);
//		}
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
		marketTipLocal.setRealTime(marketTip.getRealTime());
		marketTipLocal.setTriggerPrice(marketTip.getTriggerPrice());
		marketTipLocal.setCurrentPrice(marketTip.getCurrentPrice());
		marketTipLocal.setDayHigh(marketTip.getDayHigh());
		marketTipLocal.setProfit(marketTip.getProfit());
		marketTipLocal.setTargetPrice(marketTip.getTargetPrice());
		marketTipLocal.setCallType(marketTip.getCallType());
		marketTipLocal.setStopLoss(marketTip.getStopLoss());
		marketTipLocal.setDuration(marketTip.getDuration());
		marketTipLocal.setCallDate(marketTip.getCallDate());
		marketTipLocal.setStatus(marketTip.getStatus());
		
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