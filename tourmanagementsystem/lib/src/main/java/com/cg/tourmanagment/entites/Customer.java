package com.cg.tourmanagment.entites;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String customerId;
	@Column(name="firstname",length=30)
	private String firstName;
	@Column(name="lastname",length=30)
	private String lastName;
	@Column(name="mobileno")
	private long mobileNo;
	@Column(name="age")
	private int age;
	@Column(name="gender",length=10)	
	private String gender;
	@Column(name="modeofpayment",length=30)
	private String modeOfPayment;
	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
	private  TourInformationSystem Tour;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getModeOfPayment() {
		return modeOfPayment;
	}
	public void setModeOfPayment(String modeOfPayment) {
		this.modeOfPayment = modeOfPayment;
	}
	public TourInformationSystem getTour() {
		return Tour;
	}
	public void setTour(TourInformationSystem tour) {
		Tour = tour;
	}
	
	
	

}
