package com.beans;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.PrimeFaces;

import com.model.Product;

@ManagedBean
@ViewScoped
public class ContextView {

	private Product product = new Product();
	
	@PostConstruct
	public void init() {
		
		if(!FacesContext.getCurrentInstance().isPostback()) {
			PrimeFaces.current().executeScript("alert('Hello From Conetxt')");
		}
		
	}
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	public void save() {
		
		System.out.println("ContextView.save() Saving Product");
		PrimeFaces.current().executeScript("updateStatus(" + "30" + ")");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		PrimeFaces.current().executeScript("updateStatus(" + "60" + ")");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		PrimeFaces.current().executeScript("updateStatus(" + "100" + ")");
		
		System.out.println("ContextView.save() Product Saved");
	}
}





