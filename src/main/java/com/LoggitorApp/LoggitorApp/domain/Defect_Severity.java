package com.LoggitorApp.LoggitorApp.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Defect_Severity {


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	long id;
	String severity;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="defect_sev")
    private List<Event> events;
	
	// empty constructor
	public Defect_Severity() {}
	
	public Defect_Severity(String severity) {
		super();
		this.severity = severity;
	}

	
	
	public Defect_Severity(String severity, List<Event> events) {
		super();
		this.severity = severity;
		this.events = events;
	}

	//setters and getters
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSeverity() {
		return severity;
	}

	public void setSeverity(String severity) {
		this.severity = severity;
	}

	public List<Event> getEvents() {
		return events;
	}

	public void setEvents(List<Event> events) {
		this.events = events;
	}
	
	
	
	
	
}
