package com.softserve.museum.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
@Table
public class Worker {
	
	@Id
	@Column(name = "worker_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)  
	private int id;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy= "worker",fetch=FetchType.EAGER)
	private List<Exhibit> exhibit = new ArrayList<>();
	
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(cascade=CascadeType.ALL, mappedBy= "guide")
	private List<Excursion> excursion = new ArrayList<>();
	
	private String first_name;
	
	
	private String last_name;
	
	
	private String role;
	
	public Worker() {
		
	}
	
	public Worker(String first_name, String last_name, String role) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.role = role;
	}

	public List<Exhibit> getExhibit() {
		return exhibit;
	}

	public void setExhibit(List<Exhibit> exhibit) {
		this.exhibit = exhibit;
	}

	public List<Excursion> getExcursion() {
		return excursion;
	}

	public void setExcursion(List<Excursion> excursion) {
		this.excursion = excursion;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	
}
