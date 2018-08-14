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
@Table(name = "USER")
public class User implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotEmpty
	@Column(name = "EMAIL", nullable = false)
	private String email;
	
	@NotEmpty
	@Column(name = "DISPLAYNAME", nullable = false)
	private String displayName;

	@NotEmpty
	@Column(name = "PHONENUMBER", nullable = false)
	private String phoneNumber;
	
	
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

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		User message = (User) o;

		if (id != null ? !id.equals(message.id) : message.id != null)
			return false;
		if (email != null ? !email.equals(message.email) : message.email != null)
			return false;
		if (displayName != null ? !displayName.equals(message.displayName) : message.displayName != null)
			return false;
		if (phoneNumber != null ? !phoneNumber.equals(message.phoneNumber) : message.phoneNumber != null)
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
		return result;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", email=" + email + ", displayName=" + displayName +", phoneNumber=" + phoneNumber +"]";
	}

}
