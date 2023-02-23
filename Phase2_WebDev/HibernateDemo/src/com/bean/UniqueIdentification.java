package com.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="identification")
public class UniqueIdentification {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int uid;
	private String datecreated;
	private String country;
	@OneToOne(mappedBy ="uIdentification" )
	private Employee employee;
	
	public UniqueIdentification() {
		// TODO Auto-generated constructor stub
	}

	public UniqueIdentification(int uid, String datecreated, String country) {
		super();
		this.uid = uid;
		this.datecreated = datecreated;
		this.country = country;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getDatecreated() {
		return datecreated;
	}

	public void setDatecreated(String datecreated) {
		this.datecreated = datecreated;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

//	@Override
//	public String toString() {
//		return "UniqueIdentification [uid=" + uid + ", datecreated=" + datecreated + ", country=" + country
//				+ ", employee=" + employee + "]";
//	}


//	
}
