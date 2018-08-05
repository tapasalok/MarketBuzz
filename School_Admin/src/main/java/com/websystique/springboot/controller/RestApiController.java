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

import com.websystique.springboot.model.Message;
import com.websystique.springboot.model.Student;
import com.websystique.springboot.service.MarketTipService;
import com.websystique.springboot.util.CustomErrorType;

@RestController
@RequestMapping("/api")
public class RestApiController {

	public static final Logger logger = LoggerFactory.getLogger(RestApiController.class);

	@Autowired
	MarketTipService marketTipService; //Service which will do all data retrieval/manipulation work

	@RequestMapping(value = "/messages/", method = RequestMethod.GET)
	public ResponseEntity<List<Message>> getMessages() {
		List<Message> messages = marketTipService.getMessages();
		if (messages.isEmpty()) {
			return new ResponseEntity(HttpStatus.NO_CONTENT);
			// You many decide to return HttpStatus.NOT_FOUND
		}
		return new ResponseEntity<List<Message>>(messages, HttpStatus.OK);
		 
	}
	
	
	// -------------------Create a Message-------------------------------------------
	
	@RequestMapping(value = "/messages/", method = RequestMethod.POST)
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
	
	// -------------------Create a Student-------------------------------------------
	
		@RequestMapping(value = "/students/", method = RequestMethod.POST)
		public ResponseEntity<?> createStudent(@RequestBody Student student, UriComponentsBuilder ucBuilder) {
			logger.info("Creating student : {}", student);

//			Removing to add same stocks for multiple Calls
//			if (marketTipService.isMarketTipExist(marketTip)) {
//				logger.error("Unable to create. A marketTip with name {} already exist", marketTip.getName());
//				return new ResponseEntity(new CustomErrorType("Unable to create. A marketTip with name " + 
//				marketTip.getName() + " already exist."),HttpStatus.CONFLICT);
//			}
			marketTipService.saveStudent(student);

			HttpHeaders headers = new HttpHeaders();
			headers.setLocation(ucBuilder.path("/api/students/{id}").buildAndExpand(student.getId()).toUri());
			return new ResponseEntity<String>(headers, HttpStatus.CREATED);
		}
	
	// -------------------Retrieve Single message------------------------------------------

		@RequestMapping(value = "/messages/{id}", method = RequestMethod.GET)
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
			return new ResponseEntity<Message>(HttpStatus.NO_CONTENT);
		}

}