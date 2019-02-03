package com.beans;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class MessageBean {
	
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	// read-only property (welcomeMessage)
	public String getWelcomeMessage() {
		return "Welcome " + message;
	}
	
	public String onClick() {
		
		System.out.println("MessageBean.onClick()");
		return "Welcome";
		
	}

}






