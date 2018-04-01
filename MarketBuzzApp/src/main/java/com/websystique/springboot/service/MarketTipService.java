package com.websystique.springboot.service;


import com.websystique.springboot.model.MarketTip;
import com.websystique.springboot.model.Message;

import java.util.List;

public interface MarketTipService {
	
	MarketTip findById(Long id);

	Message findMessageById(Long id);
	
	MarketTip findByName(String name);

	void saveMarketTip(MarketTip marketTip);

	void saveMessage(Message message);
	
	void updateMarketTip(MarketTip marketTip);

	void updateMessage(Message message);
	
	void deleteMarketTipById(Long id);

	void deleteMessageById(Long id);
	
	void deleteAllMarketTips();

	List<MarketTip> findAllMarketTips();

	List<Message> getMessages();
	
	List<MarketTip> findAllActiveMarketTips();
	
	List<MarketTip> finalAllByCallType(final String string);
	
	boolean isMarketTipExist(MarketTip marketTip);
}