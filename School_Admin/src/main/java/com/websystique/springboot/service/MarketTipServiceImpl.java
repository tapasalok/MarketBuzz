package com.websystique.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.domain.Specifications;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.websystique.springboot.model.Message;
import com.websystique.springboot.model.Student;
import com.websystique.springboot.repositories.MessageRepository;
import com.websystique.springboot.repositories.StudentRepository;



@Service("marketTipService")
@Transactional
public class MarketTipServiceImpl implements MarketTipService{

	
	@Autowired
	private MessageRepository messageRepository;
	
	@Autowired
	private StudentRepository studentRepository;
	
	

	public Message findMessageById(Long id) {
		return messageRepository.findOne(id);
	}
	
	

	
	public void saveMessage(Message message) {
		messageRepository.save(message);
	}

	public void saveStudent(Student student) {
		studentRepository.save(student);
	}
	
	
	public void updateMessage(Message message){
		saveMessage(message);
	}

	public void deleteMessageById(Long id){
		messageRepository.delete(id);
	}


	public List<Message> getMessages(){
		return messageRepository.findAll();
	}
	
	public List<Student> getStudents(){
		return studentRepository.findAll();
	}
	
	private Sort sortByIdAscDesc() {
        return new Sort(Sort.Direction.DESC, "id");
    }

	public static Specification extendedCarSearch() {
	    return Specifications.not(containsLike("status", "InActive"));
	}
	
	public static Specification containsLike(String attribute, String value) {
        return (root, query, cb) -> cb.like(root.get(attribute), "%" + value + "%");
    }
}
