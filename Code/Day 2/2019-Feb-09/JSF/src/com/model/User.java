package com.model;

public class User {
	
	private int id;
	private String userName;
	private String password;
	private String email;
	private String name;
	private String gender;
	private String location;
	private boolean enableSubscriptions = true;
	private boolean smsSubscriptions;
	
	
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public boolean isEnableSubscriptions() {
		return enableSubscriptions;
	}
	public void setEnableSubscriptions(boolean enableSubscriptions) {
		this.enableSubscriptions = enableSubscriptions;
	}
	public boolean isSmsSubscriptions() {
		return smsSubscriptions;
	}
	public void setSmsSubscriptions(boolean smsSubscriptions) {
		this.smsSubscriptions = smsSubscriptions;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
}


