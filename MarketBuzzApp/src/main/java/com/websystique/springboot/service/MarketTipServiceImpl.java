package com.websystique.springboot.service;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.http.util.TextUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.domain.Specifications;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.websystique.springboot.model.MarketTip;
import com.websystique.springboot.model.Message;
import com.websystique.springboot.model.PremiumUser;
import com.websystique.springboot.model.User;
import com.websystique.springboot.repositories.MarketTipRepository;
import com.websystique.springboot.repositories.MessageRepository;
import com.websystique.springboot.repositories.PremiumUserRepository;
import com.websystique.springboot.repositories.UserRepository;

@Service("marketTipService")
@Transactional
public class MarketTipServiceImpl implements MarketTipService {

	@Autowired
	private MarketTipRepository marketTipRepository;

	@Autowired
	private MessageRepository messageRepository;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private PremiumUserRepository premiumUserRepository;

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

	@Override
	public void savePremiumUser(PremiumUser premiumUser) {
		if (StringUtils.isEmpty(premiumUser.getPhoneNumber())) {
			User userFromDB = findByEmail(premiumUser.getEmail());
			if (userFromDB != null) {
				premiumUser.setPhoneNumber(userFromDB.getPhoneNumber());
			}
		}

		List<PremiumUser> alreadyPresentPremium = findByPremiumUserEmail(premiumUser.getEmail());
		if (alreadyPresentPremium == null || alreadyPresentPremium.isEmpty()) {
			premiumUserRepository.save(premiumUser);
		}else{
			if (checkIfExistsAndEqual(premiumUser, alreadyPresentPremium)) {
				// Do Nothing
			} else {
				if (alreadyPresentPremium.size()==1 ) {
					if (TextUtils.isEmpty(alreadyPresentPremium.get(0).getImei()) || TextUtils.isEmpty(alreadyPresentPremium.get(0).getImsi())) {
						premiumUser.setId(alreadyPresentPremium.get(0).getId());
					}
				}
				premiumUserRepository.save(premiumUser);
			}
		}
	}

	private boolean checkIfExistsAndEqual(PremiumUser premiumUser, List<PremiumUser> premiumUser2) {
		boolean returnValue = false;
		if (premiumUser2.size()==1 ) {
			if (TextUtils.isEmpty(premiumUser2.get(0).getImei()) || TextUtils.isEmpty(premiumUser2.get(0).getImsi())) {
				// Do Nothing returnValue is false
			}else{
				if (premiumUser2.get(0).getImei().equalsIgnoreCase(premiumUser.getImei()) && premiumUser2.get(0).getImsi().equalsIgnoreCase(premiumUser.getImsi())) {
					returnValue = true;
				}
			}
		}else{
			for (PremiumUser individualPremium : premiumUser2) {
				if (individualPremium.getEmail().equalsIgnoreCase(premiumUser.getEmail())
						&& individualPremium.getDisplayName().equalsIgnoreCase(premiumUser.getDisplayName())
						&& individualPremium.getUid().equalsIgnoreCase(premiumUser.getUid())
						&& individualPremium.getUuid().equalsIgnoreCase(premiumUser.getUuid())) {
					
					if (StringUtils.isEmpty(premiumUser.getImei())) {
						returnValue = true;
						break;
					}
					
					if (StringUtils.isEmpty(premiumUser.getImsi())) {
						returnValue = true;
						break;
					}
					
					if (!StringUtils.isEmpty(premiumUser.getImei()) && premiumUser.getImei().equalsIgnoreCase(individualPremium.getImei()) ) {
						returnValue = true;
						break;
					}
					
					if (!StringUtils.isEmpty(premiumUser.getImsi()) && premiumUser.getImsi().equalsIgnoreCase(individualPremium.getImsi()) ) {
						returnValue = true;
						break;
					}
				}
			}
		}
		
		return returnValue;
	}

	// Update the User if same email id exists
	@Override
	public void saveUser(User user) {
		User userFromDB = findByEmail(user.getEmail());
		if (userFromDB != null) {
			user.setId(userFromDB.getId());
		}
		userRepository.save(user);
	}

	public void updateMarketTip(MarketTip marketTip) {
		saveMarketTip(marketTip);
	}

	public void updateMessage(Message message) {
		saveMessage(message);
	}

	public void updateUser(User user) {
		saveUser(user);
	}

	public void deleteMarketTipById(Long id) {
		marketTipRepository.delete(id);
	}

	public void deleteMessageById(Long id) {
		messageRepository.delete(id);
	}

	public void deleteAllMarketTips() {
		marketTipRepository.deleteAll();
	}

	public List<MarketTip> findAllMarketTips() {
		return marketTipRepository.findAll(sortByIdAscDesc());
	}

	public List<Message> getMessages() {
		return messageRepository.findAll();
	}

	public List<User> getUsers() {
		return userRepository.findAll();
	}

	public List<PremiumUser> getPremiumUsers() {
		return premiumUserRepository.findAll();
	}

	public List<MarketTip> findAllActiveMarketTips() {
		return marketTipRepository.findByStatusNotLike("InActive", sortByIdAscDesc());
	}

	public List<MarketTip> finalAllByCallType(final String string) {
		return marketTipRepository.findByCallType(string, sortByIdAscDesc());
	}

	public List<MarketTip> finalAllByCallTypeIn(final List<String> callTypes) {
		return marketTipRepository.findByCallTypeIn(callTypes, sortByIdAscDesc());
	}

	public boolean isUserExist(User user) {
		return findByEmail(user.getEmail()) != null;
	}

	public User findByEmail(String email) {
		return userRepository.findByEmail(email);
	}

	public List<PremiumUser> findByPremiumUserEmail(String email) {
		return premiumUserRepository.findByEmail(email);
	}

	public boolean isMarketTipExist(MarketTip marketTip) {
		return findByName(marketTip.getName()) != null;
	}

	private Sort sortByIdAscDesc() {
		return new Sort(Sort.Direction.DESC, "id");
	}

	public static Specification extendedCarSearch() {
		return Specifications.not(containsLike("status", "InActive"));
	}

	public static Specification containsLike(String attribute, String value) {
		return (root, query, cb) -> cb.like(root.get(attribute), "%" + value + "%");
	}

	@Override
	public User findUserByEmail(String email) {
		// TODO Auto-generated method stub
		return userRepository.findByEmail(email);
	}

}
