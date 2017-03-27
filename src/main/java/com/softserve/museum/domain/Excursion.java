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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;



@Entity
@Table
public class Excursion {
	@Id
	@Column(name = "excursion_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	
	
	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
    @JoinColumn(name = "worker_id")
	private Worker guide;
	
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(cascade=CascadeType.ALL, mappedBy="excursion")
	private List<Schedule> schedule = new ArrayList<>();
	
	private String name;
	
	
	private double price;
	
	private int duration_hours;
	
	
	private Boolean done;
	
	public Excursion() {
		
	}

	public Excursion(Worker guide,String name, double price, int duration_hours,
			Boolean done) {
		super();
		this.guide = guide;
		this.name = name;
		this.price = price;
		this.duration_hours = duration_hours;
		this.done = done;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Worker getGuide() {
		return guide;
	}

	public void setGuide(Worker guide) {
		this.guide = guide;
	}

	public List<Schedule> getSchedule() {
		return schedule;
	}

	public void setSchedule(List<Schedule> schedule) {
		this.schedule = schedule;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getDuration_hours() {
		return duration_hours;
	}

	public void setDuration_hours(int duration_hours) {
		this.duration_hours = duration_hours;
	}

	public Boolean getDone() {
		return done;
	}

	public void setDone(Boolean done) {
		this.done = done;
	}
	
	

}
