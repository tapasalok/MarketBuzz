package com.websystique.springboot.service;


import com.websystique.springboot.model.MarketTip;

import java.util.List;

public interface MarketTipService {
	
	MarketTip findById(Long id);

	MarketTip findByName(String name);

	void saveUser(MarketTip marketTip);

	void updateUser(MarketTip marketTip);

	void deleteUserById(Long id);

	void deleteAllUsers();

	List<MarketTip> findAllUsers();

	boolean isUserExist(MarketTip marketTip);
}