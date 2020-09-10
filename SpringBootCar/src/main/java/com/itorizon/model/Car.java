package com.itorizon.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="car")
public class Car {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="company")
	private String company;
	
	@Column(name="model")
	private String model;
	
	@Column(name="color")
	private String color;
	
	@Column(name="dateofpurchase")
	private String dateofpurchase;
	
	@Column(name="price")
	private String price;
	
	@Column(name="enginecapacity")
	private String enginecapacity;
	
	@Column(name="licenceplatenumber")
	private String licenceplatenumber;
	
	@Column(name="seatingcapacity")
	private int seatingcapacity;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getDateofpurchase() {
		return dateofpurchase;
	}

	public void setDateofpurchase(String dateofpurchase) {
		this.dateofpurchase = dateofpurchase;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getEnginecapacity() {
		return enginecapacity;
	}

	public void setEnginecapacity(String enginecapacity) {
		this.enginecapacity = enginecapacity;
	}

	public String getLicenceplatenumber() {
		return licenceplatenumber;
	}

	public void setLicenceplatenumber(String licenceplatenumber) {
		this.licenceplatenumber = licenceplatenumber;
	}

	public int getSeatingcapacity() {
		return seatingcapacity;
	}

	public void setSeatingcapacity(int seatingcapacity) {
		this.seatingcapacity = seatingcapacity;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", company=" + company + ", model=" + model + ", color=" + color + ", dateofpurchase="
				+ dateofpurchase + ", price=" + price + ", enginecapacity=" + enginecapacity + ", licenceplatenumber="
				+ licenceplatenumber + ", seatingcapacity=" + seatingcapacity + "]";
	}
	
	

	
	
	
}
