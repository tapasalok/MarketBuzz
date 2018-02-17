package com.websystique.springboot.service;

import java.util.List;

import com.websystique.springboot.model.MarketTip;
import com.websystique.springboot.repositories.MarketTipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Service("marketTipService")
@Transactional
public class MarketTipServiceImpl implements MarketTipService{

	@Autowired
	private MarketTipRepository marketTipRepository;

	public MarketTip findById(Long id) {
		return marketTipRepository.findOne(id);
	}

	public MarketTip findByName(String name) {
		return marketTipRepository.findByName(name);
	}

	public void saveUser(MarketTip marketTip) {
		marketTipRepository.save(marketTip);
	}

	public void updateUser(MarketTip marketTip){
		saveUser(marketTip);
	}

	public void deleteUserById(Long id){
		marketTipRepository.delete(id);
	}

	public void deleteAllUsers(){
		marketTipRepository.deleteAll();
	}

	public List<MarketTip> findAllUsers(){
		return marketTipRepository.findAll();
	}

	public boolean isUserExist(MarketTip marketTip) {
		return findByName(marketTip.getName()) != null;
	}

}
