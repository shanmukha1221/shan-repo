package com.etrainstatus.model.data;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="q023_response")
public class ReservationInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String id;
	
	private String trainNumber;
	private String classCode;
	private String waitingListType;
	private String bookingStatus;
	private String waitlistNumber;
	private String name;
	private String age;
	private String sex;
	private String pnrNo;
	private String passengerDestation;
	private String newStatus;
	private String newChild;
	private String newAcmno;
	private String newClassCode;
	private String nameHindi;
	private String origin;
	private String bookingStatusDisplay;
	private String CurrentStatus;
	
	@Id
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
	@Column(name="train_no",nullable=false,length=10)
	public String getTrainNumber() {
		return trainNumber;
	}
	public void setTrainNumber(String trainNumber) {
		this.trainNumber = trainNumber;
	}
	
	@Column(name="class_code",nullable=false,length=5)
	public String getClassCode() {
		return classCode;
	}
	public void setClassCode(String classCode) {
		this.classCode = classCode;
	}
	
	@Column(name="waitlist_type",nullable=false,length=5)
	public String getWaitingListType() {
		return waitingListType;
	}
	public void setWaitingListType(String waitingListType) {
		this.waitingListType = waitingListType;
	}
	
	@Column(name="boking_status",nullable=false,length=5)
	public String getBookingStatus() {
		return bookingStatus;
	}
	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}
	
	@Column(name="wait_listno",nullable=false,length=5)
	public String getWaitlistNumber() {
		return waitlistNumber;
	}
	public void setWaitlistNumber(String waitlistNumber) {
		this.waitlistNumber = waitlistNumber;
	}
	
	@Column(name="name",nullable=false,length=50)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name="age",nullable=true,length=5)
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	@Column(name="sex",nullable=true,length=5)
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	@Column(name="pnr_no",nullable=false,length=11)
	public String getPnrNo() {
		return pnrNo;
	}
	public void setPnrNo(String pnrNo) {
		this.pnrNo = pnrNo;
	}
	
	@Column(name="psgn_dstn",nullable=false,length=5)
	public String getPassengerDestation() {
		return passengerDestation;
	}
	public void setPassengerDestation(String passengerDestation) {
		this.passengerDestation = passengerDestation;
	}
	
	@Column(name="new_status",nullable=false,length=5)
	public String getNewStatus() {
		return newStatus;
	}
	public void setNewStatus(String newStatus) {
		this.newStatus = newStatus;
	}
	
	@Column(name="new_child",nullable=true,length=5)
	public String getNewChild() {
		return newChild;
	}
	public void setNewChild(String newChild) {
		this.newChild = newChild;
	}
	
	@Column(name="new_acmno",nullable=true,length=5)
	public String getNewAcmno() {
		return newAcmno;
	}
	public void setNewAcmno(String newAcmno) {
		this.newAcmno = newAcmno;
	}
	
	@Column(name="newclass_code",nullable=true,length=5)
	public String getNewClassCode() {
		return newClassCode;
	}
	public void setNewClassCode(String newClassCode) {
		this.newClassCode = newClassCode;
	}
	
	@Column(name="name_hindi",nullable=true,length=50)
	public String getNameHindi() {
		return nameHindi;
	}
	public void setNameHindi(String nameHindi) {
		this.nameHindi = nameHindi;
	}
	
	@Column(name="origin",nullable=true,length=10)
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	
	@Column(name="booking_status_display",nullable=true,length=20)
	public String getBookingStatusDisplay() {
		return bookingStatusDisplay;
	}
	public void setBookingStatusDisplay(String bookingStatusDisplay) {
		this.bookingStatusDisplay = bookingStatusDisplay;
	}
	
	@Column(name="current_status",nullable=true,length=10)
	public String getCurrentStatus() {
		return CurrentStatus;
	}
	public void setCurrentStatus(String currentStatus) {
		CurrentStatus = currentStatus;
	}
	
}
