package com.websystique.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.websystique.springboot.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);
	
	User findByDisplayName(String displayName);
	
	User findByPhoneNumber(String phoneNumber);

}
