package com.LoggitorApp.LoggitorApp.domain;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Event_Instance {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	long id;
	String date;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "event")
	Event event;
	
	//empty constructor
	public Event_Instance() {}



	public Event_Instance(String date, Event event) {
		super();
		this.date = date;
		this.event = event;
	}



	//getters and setters
	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getDate() {
		return date;
	}



	public void setDate(String date) {
		this.date = date;
	}



	public Event getEvent() {
		return event;
	}



	public void setEvent(Event event) {
		this.event = event;
	}
	
	
	
	
	
	
}
