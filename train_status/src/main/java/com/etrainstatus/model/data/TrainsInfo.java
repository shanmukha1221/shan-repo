package com.etrainstatus.model.data;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="trains")
public class TrainsInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String trainNumber;
	private String  trainName;
	private String trainNameRl;
	private String origin;
	private String originName;
	private String originNmaeRl;
	private String destitation;
	private String destitationName;
	private String destitationRl;
	
	@Id
	@Column(name="train_no", unique=true,nullable=false,length=10)
	public String getTrainNumber() {
		return trainNumber;
	}
	public void setTrainNumber(String trainNumber) {
		this.trainNumber = trainNumber;
	}
	
	@Column(name="train_name", unique=true,nullable=false,length=50)
	public String getTrainName() {
		return trainName;
	}
	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}
	
	@Column(name="train_namerl",nullable=true,length=50)
	public String getTrainNameRl() {
		return trainNameRl;
	}
	public void setTrainNameRl(String trainNameRl) {
		this.trainNameRl = trainNameRl;
	}
	
	@Column(name="origin", nullable=true,length=5)
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	
	@Column(name="origin_name", length=50)
	public String getOriginName() {
		return originName;
	}
	public void setOriginName(String originName) {
		this.originName = originName;
	}
	
	@Column(name="origin_namerl",length=50)
	public String getOriginNmaeRl() {
		return originNmaeRl;
	}
	public void setOriginNmaeRl(String originNmaeRl) {
		this.originNmaeRl = originNmaeRl;
	}
	
	@Column(name="destitation", length=5)
	public String getDestitation() {
		return destitation;
	}
	public void setDestitation(String destitation) {
		this.destitation = destitation;
	}
	
	@Column(name="destitation_name",length=50)
	public String getDestitationName() {
		return destitationName;
	}
	public void setDestitationName(String destitationName) {
		this.destitationName = destitationName;
	}
	
	@Column(name="destitationrl", length=50)
	public String getDestitationRl() {
		return destitationRl;
	}
	public void setDestitationRl(String destitationRl) {
		this.destitationRl = destitationRl;
	}
	
}
