package com.beans;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean
public class UserBean {

	private String userName;
	private String password;
	private String message;
	
	
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
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	public void validate() {
		
		if(userName.equalsIgnoreCase("admin") && password.equalsIgnoreCase("admin")) {
			
			this.message = "Login Success";
			FacesContext facesContext = FacesContext.getCurrentInstance();
			FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Login Complete", null);
			facesContext.addMessage(null, message);
			
			
		}else {
			
			this.message = "Login Failed";
			
			FacesContext facesContext = FacesContext.getCurrentInstance();
			FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Login Failed", "Invalid Credintials");
			facesContext.addMessage(null, message);
		}
	}
}





