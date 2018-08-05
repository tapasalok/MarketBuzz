package com.websystique.springboot.service;

import java.util.List;

import com.websystique.springboot.model.Message;
import com.websystique.springboot.model.Student;

public interface MarketTipService {

	Message findMessageById(Long id);

	void saveMessage(Message message);

	void saveStudent(Student student);

	void updateMessage(Message message);

	void deleteMessageById(Long id);

	List<Message> getMessages();

}