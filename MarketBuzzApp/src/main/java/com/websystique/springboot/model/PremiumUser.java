package com.websystique.springboot.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "PREMIUMUSER")
public class PremiumUser implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotEmpty
	@Column(name = "EMAIL", nullable = false)
	private String email;
	
	@NotEmpty
	@Column(name = "DISPLAYNAME", nullable = false)
	private String displayName;
	
	@Column(name = "PHONENUMBER", nullable = true)
	private String phoneNumber;

	@NotEmpty
	@Column(name = "UID", nullable = false)
	private String uid;
	
	@NotEmpty
	@Column(name = "UUID", nullable = false)
	private String uuid;
	
	@NotEmpty
	@Column(name = "LASTLOGINDATE", nullable = false)
	private String lastLoginDate;
	
	@Column(name = "IMEI", nullable = true)
	private String imei;
	
	@Column(name = "IMSI", nullable = true)
	private String imsi;
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	
	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	public String getImsi() {
		return imsi;
	}

	public void setImsi(String imsi) {
		this.imsi = imsi;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	
	
	public String getLastLoginDate() {
		return lastLoginDate;
	}

	public void setLastLoginDate(String lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		PremiumUser message = (PremiumUser) o;

		if (id != null ? !id.equals(message.id) : message.id != null)
			return false;
		if (email != null ? !email.equals(message.email) : message.email != null)
			return false;
		if (displayName != null ? !displayName.equals(message.displayName) : message.displayName != null)
			return false;
		if (phoneNumber != null ? !phoneNumber.equals(message.phoneNumber) : message.phoneNumber != null)
			return false;
		if (uid != null ? !uid.equals(message.uid) : message.uid != null)
			return false;
		if (uuid != null ? !uuid.equals(message.uuid) : message.uuid != null)
			return false;
		if (imei != null ? !imei.equals(message.imei) : message.imei != null)
			return false;
		if (imsi != null ? !imsi.equals(message.imsi) : message.imsi != null)
			return false;
		if (lastLoginDate != null ? !lastLoginDate.equals(message.lastLoginDate) : message.lastLoginDate != null)
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		int result;
		result = id != null ? id.hashCode() : 0;
		result = 31 * result + (email != null ? email.hashCode() : 0);
		result = 31 * result + (displayName != null ? displayName.hashCode() : 0);
		result = 31 * result + (phoneNumber != null ? phoneNumber.hashCode() : 0);
		result = 31 * result + (uid != null ? uid.hashCode() : 0);
		result = 31 * result + (uuid != null ? uuid.hashCode() : 0);
		result = 31 * result + (imei != null ? imei.hashCode() : 0);
		result = 31 * result + (imsi != null ? imsi.hashCode() : 0);
		result = 31 * result + (lastLoginDate != null ? lastLoginDate.hashCode() : 0);
		
		return result;
	}

	@Override
	public String toString() {
		return "PrimeUser [id=" + id + ", email=" + email + ", displayName=" + displayName +", phoneNumber=" + phoneNumber +", uid=" + uid +", uuid=" + uuid +", imei=" + imei +", imsi=" + imsi +", lastLoginDate=" + lastLoginDate+"]";
	}

}
