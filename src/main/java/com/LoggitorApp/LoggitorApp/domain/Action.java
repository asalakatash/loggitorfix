package com.LoggitorApp.LoggitorApp.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Action {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	long id;
	String name;
	String action;
	
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="action")
    private List<Event> events;
	
	
	// empty constructor
	public Action() {}
	
	public Action(String name, String action) {
		super();
		this.name = name;
		this.action = action;
	}

	
	
	
	public Action(String name, String action, List<Event> events) {
		super();
		this.name = name;
		this.action = action;
		this.events = events;
	}

	//setters and getters
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public List<Event> getEvents() {
		return events;
	}

	public void setEvents(List<Event> events) {
		this.events = events;
	}
	
	
	
	
	
	
	
	
	
}
