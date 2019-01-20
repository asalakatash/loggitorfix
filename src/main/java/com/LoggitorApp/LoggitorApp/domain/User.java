package com.LoggitorApp.LoggitorApp.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.util.Set;

import javax.persistence.*;
@Entity
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long UserId;
	@Column(unique=true)
	private String UserName_gmail;
	private String Phone;
	private String Name;
	private String Password;
	
    
    @ManyToMany(cascade = CascadeType.MERGE)
    @JoinTable(name = "User_Role", joinColumns = @JoinColumn(name = "User_id", referencedColumnName = "UserId"),
    inverseJoinColumns = @JoinColumn(name = "Role_id", referencedColumnName = "RoleId"))
    private Set<Role> roles;
    public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	public User() {
		super();
	}

	public User(String userName_gmail, String phone, String name, String password, Set<Role> roles) {
		super();
		UserName_gmail = userName_gmail;
		Phone = phone;
		Name = name;
		Password = password;
		this.roles = roles;
	}

	
	public User(String userName_gmail, String phone, String name, String password) {
		super();
		UserName_gmail = userName_gmail;
		Phone = phone;
		Name = name;
		Password = password;
	}

	public String getUserName_gmail() {
		return UserName_gmail;
	}

	public void setUserName_gmail(String userName_gmail) {
		UserName_gmail = userName_gmail;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}
	
}
