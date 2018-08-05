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
@Table(name = "STUDENT")
public class Student implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotEmpty
	@Column(name = "STUDENTNAME", nullable = false)
	private String studentName;

	@NotEmpty
	@Column(name = "ROLLNUMBER", nullable = false)
	private String rollNumber;

	@NotEmpty
	@Column(name = "STUDENTCLASS", nullable = false)
	private String studentClass;
	
	@NotEmpty
	@Column(name = "PARENTNAME", nullable = false)
	private String parentName;

	@NotEmpty
	@Column(name = "MOBILE", nullable = false)
	private String mobile;

	@NotEmpty
	@Column(name = "ADDRESS", nullable = false)
	private String address;

	@NotEmpty
	@Column(name = "ADMISSIONDATE", nullable = false)
	private String addmissionDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(String rollNumber) {
		this.rollNumber = rollNumber;
	}

	
	
	
	public String getStudentClass() {
		return studentClass;
	}

	public void setStudentClass(String studentClass) {
		this.studentClass = studentClass;
	}

	public String getParentName() {
		return parentName;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddmissionDate() {
		return addmissionDate;
	}

	public void setAddmissionDate(String addmissionDate) {
		this.addmissionDate = addmissionDate;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		Student student = (Student) o;

		if (id != null ? !id.equals(student.id) : student.id != null)
			return false;
		if (studentName != null ? !studentName.equals(student.studentName) : student.studentName != null)
			return false;
		if (studentClass != null ? !studentClass.equals(student.studentClass) : student.studentClass != null)
			return false;
		if (rollNumber != null ? !rollNumber.equals(student.rollNumber) : student.rollNumber != null)
			return false;
		if (parentName != null ? !parentName.equals(student.parentName) : student.parentName != null)
			return false;
		if (mobile != null ? !mobile.equals(student.mobile) : student.mobile != null)
			return false;
		if (address != null ? !address.equals(student.address) : student.address != null)
			return false;
		if (addmissionDate != null ? !addmissionDate.equals(student.addmissionDate) : student.addmissionDate != null)
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		int result;
		result = id != null ? id.hashCode() : 0;
		result = 31 * result + (studentName != null ? studentName.hashCode() : 0);
		result = 31 * result + (rollNumber != null ? rollNumber.hashCode() : 0);
		result = 31 * result + (parentName != null ? parentName.hashCode() : 0);
		result = 31 * result + (studentClass != null ? studentClass.hashCode() : 0);
		result = 31 * result + (mobile != null ? mobile.hashCode() : 0);
		result = 31 * result + (address != null ? address.hashCode() : 0);
		result = 31 * result + (addmissionDate != null ? addmissionDate.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		return "Message [id=" + id + ", studentName=" + studentName + ", rollNumber=" + rollNumber + ", studentClass=" + studentClass + ", parentName="
				+ parentName + ", mobile=" + mobile + ", address=" + address + ", addmissionDate=" + addmissionDate
				+ "]";
	}

}
