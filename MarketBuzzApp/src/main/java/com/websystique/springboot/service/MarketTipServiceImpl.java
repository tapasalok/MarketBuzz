package com.websystique.springboot.service;

import java.util.List;

import com.websystique.springboot.model.MarketTip;
import com.websystique.springboot.model.Message;
import com.websystique.springboot.repositories.MarketTipRepository;
import com.websystique.springboot.repositories.MessageRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.domain.Specifications;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Service("marketTipService")
@Transactional
public class MarketTipServiceImpl implements MarketTipService{

	@Autowired
	private MarketTipRepository marketTipRepository;
	
	@Autowired
	private MessageRepository messageRepository;
	
	public MarketTip findById(Long id) {
		return marketTipRepository.findOne(id);
	}

	public Message findMessageById(Long id) {
		return messageRepository.findOne(id);
	}
	
	public MarketTip findByName(String name) {
		return marketTipRepository.findByName(name);
	}

	public void saveMarketTip(MarketTip marketTip) {
		marketTipRepository.save(marketTip);
	}
	
	public void saveMessage(Message message) {
		messageRepository.save(message);
	}

	public void updateMarketTip(MarketTip marketTip){
		saveMarketTip(marketTip);
	}
	
	public void updateMessage(Message message){
		saveMessage(message);
	}

	public void deleteMarketTipById(Long id){
		marketTipRepository.delete(id);
	}
	
	public void deleteMessageById(Long id){
		messageRepository.delete(id);
	}

	public void deleteAllMarketTips(){
		marketTipRepository.deleteAll();
	}

	public List<MarketTip> findAllMarketTips(){
		return marketTipRepository.findAll(sortByIdAscDesc());
	}

	public List<Message> getMessages(){
		return messageRepository.findAll();
	}

	
	public List<MarketTip> findAllActiveMarketTips(){
		return marketTipRepository.findByStatusNotLike("InActive", sortByIdAscDesc());
	}
	
	public List<MarketTip> finalAllByCallType(final String string){
		return marketTipRepository.findByCallType(string, sortByIdAscDesc());
	}
	
	
	public boolean isMarketTipExist(MarketTip marketTip) {
		return findByName(marketTip.getName()) != null;
	}
	
	private Sort sortByIdAscDesc() {
        return new Sort(Sort.Direction.DESC, "callDate");
    }

	public static Specification extendedCarSearch() {
	    return Specifications.not(containsLike("status", "InActive"));
	}
	
	public static Specification containsLike(String attribute, String value) {
        return (root, query, cb) -> cb.like(root.get(attribute), "%" + value + "%");
    }
}
