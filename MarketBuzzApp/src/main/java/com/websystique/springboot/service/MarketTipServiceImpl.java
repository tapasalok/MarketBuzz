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

	public void saveMarketTip(MarketTip marketTip) {
		marketTipRepository.save(marketTip);
	}

	public void updateMarketTip(MarketTip marketTip){
		saveMarketTip(marketTip);
	}

	public void deleteMarketTipById(Long id){
		marketTipRepository.delete(id);
	}

	public void deleteAllMarketTips(){
		marketTipRepository.deleteAll();
	}

	public List<MarketTip> findAllMarketTips(){
		return marketTipRepository.findAll();
	}

	public boolean isMarketTipExist(MarketTip marketTip) {
		return findByName(marketTip.getName()) != null;
	}

}
