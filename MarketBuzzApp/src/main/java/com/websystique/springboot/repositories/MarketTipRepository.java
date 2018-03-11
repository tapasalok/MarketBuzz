package com.websystique.springboot.repositories;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.websystique.springboot.model.MarketTip;

@Repository
public interface MarketTipRepository extends JpaRepository<MarketTip, Long> {

    MarketTip findByName(String name);
    
    List<MarketTip> findByStatusNotLike(String status , Sort sort);

}
