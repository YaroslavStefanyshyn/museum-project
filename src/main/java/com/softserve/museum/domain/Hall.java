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

@Entity
@Table
public class Hall {
	
	@Id
	@Column(name = "hall_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="hall",fetch=FetchType.EAGER)
	private List<Exhibit> exhibit = new ArrayList<>();
	
	private String name;
	
	public Hall() {
		
	}
	
	public Hall(String name) {
		super();
		this.name = name;
	}
	
	
	public Hall(List<Exhibit> exhibit, String name) {
		super();
		this.exhibit = exhibit;
		this.name = name;
	}

	public void setId(int id) {
	    this.id = id;
	}
	

	public int getId() {
	    return id;
	}
	
	public void setName(String name) {
	    this.name = name;
	}
	
	
	
	public String getName() {
	    return name;
	}

	public List<Exhibit> getExhibit() {
		return exhibit;
	}

	public void setExhibit(List<Exhibit> exhibit) {
		this.exhibit = exhibit;
	}
	
}
