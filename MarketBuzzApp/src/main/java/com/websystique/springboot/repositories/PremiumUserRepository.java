package com.websystique.springboot.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.websystique.springboot.model.PremiumUser;

@Repository
public interface PremiumUserRepository extends JpaRepository<PremiumUser, Long> {

	List<PremiumUser> findByEmail(String email);
	
	PremiumUser findByDisplayName(String displayName);
	
	PremiumUser findByPhoneNumber(String phoneNumber);
	
	PremiumUser findByUid(String uid);
	
	PremiumUser findByUuid(String uuid);
	
	PremiumUser findByImei(String imei);
	
	PremiumUser findByImsi(String imsi);
	
	PremiumUser findByLastLoginDate(String lastLoginDate);

}
