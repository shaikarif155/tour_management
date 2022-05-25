package com.cg.tourmanagement.entites;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

public class TourInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int reserevdPackageId;
	@Column(name="description",length=30)
	private String description;
	@Column(name="startdate",length=10)
	private String startDate;
	@Column(name="enddate",length=10)
	private String endDate;
	@Column(name="no_of_persons",length=10)
	private int noOfPersons;
	@Column(name="no_of_days",length=10)
	private int numberOfDays;
	@Column(name="amount_per_person",length=30)
	private double amountPerPerson;
	@Column(name="transportation",length=10)
	private String modeOfTransportation;
	@Column(name="hotel",length=30)
	private String hotel;
	@ManyToMany
	
	private  TourInformationSystem tour;

}
