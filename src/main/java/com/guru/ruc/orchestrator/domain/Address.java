package com.guru.ruc.orchestrator.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "direccion")
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;

	@OneToOne(mappedBy = "address")
	@JoinColumn(name = "company_id")
	private Company company;

	@Column(name = "province")
	private Integer province;

	@Column(name = "locality")
	private Integer locality;

	@Column(name = "street")
	private String street;

	@Column(name = "number")
	private Integer number;

	@Column(name = "floor")
	private Integer floor;

	@Column(name = "dept")
	private String dept;

	@Column(name = "zip_code")
	private String zipCode;

	@Column(name = "lat")
	private Double lat;

	@Column(name = "lng")
	private Double lng;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public Integer getProvince() {
		return province;
	}

	public void setProvince(Integer province) {
		this.province = province;
	}

	public Integer getLocality() {
		return locality;
	}

	public void setLocality(Integer locality) {
		this.locality = locality;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Integer getFloor() {
		return floor;
	}

	public void setFloor(Integer floor) {
		this.floor = floor;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public Double getLat() {
		return lat;
	}

	public void setLat(Double lat) {
		this.lat = lat;
	}

	public Double getLng() {
		return lng;
	}

	public void setLng(Double lng) {
		this.lng = lng;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\"province\": ");
		sb.append(province);
		sb.append(", \"locality\": ");
		sb.append(locality);
		sb.append(", \"street\": \"");
		sb.append(street);
		sb.append("\", \"number\": ");
		sb.append(number);
		sb.append(", \"floor\": ");
		sb.append(floor);
		sb.append(", \"dept\": \"");
		sb.append(dept);
		sb.append("\", \"zipCode\": \"");
		sb.append(zipCode);
		sb.append("\", \"lat\": \"");
		sb.append(lat);
		sb.append("\", \"lng\": \"");
		sb.append(lng);
		sb.append("\"");
		return sb.toString();
	}

}
