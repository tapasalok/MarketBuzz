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
@Table(name = "MESSAGE")
public class Message implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotEmpty
	@Column(name = "CONTENT", nullable = false)
	private String content;
	
	@NotEmpty
	@Column(name = "URL", nullable = false)
	private String url;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		Message message = (Message) o;

		if (id != null ? !id.equals(message.id) : message.id != null)
			return false;
		if (content != null ? !content.equals(message.content) : message.content != null)
			return false;
		if (url != null ? !url.equals(message.url) : message.url != null)
			return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result;
		result = id != null ? id.hashCode() : 0;
		result = 31 * result + (content != null ? content.hashCode() : 0);
		result = 31 * result + (url != null ? url.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		return "Message [id=" + id + ", content=" + content + ", url=" + url +"]";
	}

}
