package com.websystique.springboot.service;


import com.websystique.springboot.model.MarketTip;
import com.websystique.springboot.model.Message;

import java.util.List;

public interface MarketTipService {
	
	MarketTip findById(Long id);

	MarketTip findByName(String name);

	void saveMarketTip(MarketTip marketTip);

	void updateMarketTip(MarketTip marketTip);

	void deleteMarketTipById(Long id);

	void deleteAllMarketTips();

	List<MarketTip> findAllMarketTips();

	List<Message> getMessages();
	
	List<MarketTip> findAllActiveMarketTips();
	
	boolean isMarketTipExist(MarketTip marketTip);
}