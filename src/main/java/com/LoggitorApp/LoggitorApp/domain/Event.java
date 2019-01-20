package com.LoggitorApp.LoggitorApp.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Event {


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	long id;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "app")
	App app;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "defect_sev")
	Defect_Severity defect_sev;
	
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "action")
	Action action;
    
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "event_sev")
	Event_Severity event_sev;
	String comperator;
	String name;
	int percent;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="event")
    private List<Event_Instance> event_instances;
	
	
	//empty constructor
	public Event() {}


	public Event(App app, Defect_Severity defect_sev, Action action, Event_Severity event_sev, String comperator,
			String name, int percent) {
		super();
		this.app = app;
		this.defect_sev = defect_sev;
		this.action = action;
		this.event_sev = event_sev;
		this.comperator = comperator;
		this.name = name;
		this.percent = percent;
	}


	public Event(App app, Defect_Severity defect_sev, Action action, Event_Severity event_sev, String comperator,
			String name, int percent, List<Event_Instance> event_instances) {
		super();
		this.app = app;
		this.defect_sev = defect_sev;
		this.action = action;
		this.event_sev = event_sev;
		this.comperator = comperator;
		this.name = name;
		this.percent = percent;
		this.event_instances = event_instances;
	}


	//getters and setters
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public App getApp() {
		return app;
	}


	public void setApp(App app) {
		this.app = app;
	}


	public Defect_Severity getDefect_sev() {
		return defect_sev;
	}


	public void setDefect_sev(Defect_Severity defect_sev) {
		this.defect_sev = defect_sev;
	}


	public Action getAction() {
		return action;
	}


	public void setAction(Action action) {
		this.action = action;
	}


	public Event_Severity getEvent_sev() {
		return event_sev;
	}


	public void setEvent_sev(Event_Severity event_sev) {
		this.event_sev = event_sev;
	}


	public String getComperator() {
		return comperator;
	}


	public void setComperator(String comperator) {
		this.comperator = comperator;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPercent() {
		return percent;
	}


	public void setPercent(int percent) {
		this.percent = percent;
	}


	public List<Event_Instance> getEvent_instances() {
		return event_instances;
	}


	public void setEvent_instances(List<Event_Instance> event_instances) {
		this.event_instances = event_instances;
	}
	
	
	
	
	
}
