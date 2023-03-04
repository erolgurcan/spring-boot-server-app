package com.example.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="PatientUser")
public class PatientUserModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long patientId;
	
	@Column(name="fullName")
	private String fullName;
	
	 @Column(name = "birthDate")
	 private String birthDate;
		
	 @Column(name = "gender")
	 private String gender;
	
	@Column(name="email")
	private String email;
	
	@Column(name="phone")
	private String phone;
	
	@Column(name="healthCard")
	private String healthCard;

	 @Column(name = "address")
	 private String address;
	 
	 @Column(name = "city")
	 private String city;
	 
	 @Column(name = "province")
	 private String province;
	 
	 @Column(name = "zipCode")
	 private String zipCode;

	 
	public PatientUserModel() {
		
	} 
	public PatientUserModel(String fullName, String birthDate, String gender, String email, String phone,
			String healthCard, String address, String city, String province, String zipCode) {

		this.fullName = fullName;
		this.birthDate = birthDate;
		this.gender = gender;
		this.email = email;
		this.phone = phone;
		this.healthCard = healthCard;
		this.address = address;
		this.city = city;
		this.province = province;
		this.zipCode = zipCode;
	}
	
	

	public long getPatientId() {
		return patientId;
	}



	public void setPatientId(long patientId) {
		this.patientId = patientId;
	}



	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getHealthCard() {
		return healthCard;
	}

	public void setHealthCard(String healthCard) {
		this.healthCard = healthCard;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	 
	
	 
	 
	 

	

	
}
