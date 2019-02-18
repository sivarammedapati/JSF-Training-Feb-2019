package com.beans;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import com.model.User;

@ManagedBean
//@RequestScoped
@ViewScoped
public class RegisterController {
	
	@ManagedProperty(value="#{userRepository}")
	private UserRepository repository;
	
	

	private User user = new User();

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	public void setRepository(UserRepository repository) {
		this.repository = repository;
	}
	
	public void validateUserName() {
		
		if(this.user.getUserName().startsWith("x")) {
			
			FacesContext facesContext = FacesContext.getCurrentInstance();
			FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Name in use", "Name in use");
			facesContext.addMessage("registerForm:username", facesMessage);
		}
		else {
			
			FacesContext facesContext = FacesContext.getCurrentInstance();
			FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_INFO, "Name in available", "Name in available");
			facesContext.addMessage("registerForm:username", facesMessage);
		}	
	}
	
	public void saveUser() {
		
		repository.save(this.user);
		System.out.println("RegisterController.saveUser()");
	}
	
}












