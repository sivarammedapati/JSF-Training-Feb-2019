package com.beans;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.model.HelloModel;

@ManagedBean
@ViewScoped
public class CustomControlView {

	private HelloModel helloModel;
	private boolean isAvailable;
	
	
	@PostConstruct
	public void init() {
		helloModel = new HelloModel();
		helloModel.setMessage("Hello Controls");
		helloModel.setAuthor("Anil Joseph");
	}

	public HelloModel getHelloModel() {
		return helloModel;
	}

	public void setHelloModel(HelloModel helloModel) {
		this.helloModel = helloModel;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	
}
