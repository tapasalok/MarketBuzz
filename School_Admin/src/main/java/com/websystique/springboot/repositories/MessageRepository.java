package com.websystique.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.websystique.springboot.model.Message;

@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {

	Message findByContent(String content);
	
	Message findByUrl(String url);

}
