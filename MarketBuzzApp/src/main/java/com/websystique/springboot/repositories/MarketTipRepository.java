package com.websystique.springboot.repositories;

import com.websystique.springboot.model.MarketTip;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarketTipRepository extends JpaRepository<MarketTip, Long> {

    MarketTip findByName(String name);
    
    List<MarketTip> findByStatusNotLike(String status);

}
