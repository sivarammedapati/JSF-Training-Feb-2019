package com.beans;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.model.CardPayDetails;

@ManagedBean
@ViewScoped
public class CompositeController {
	
	private List<String> images= new ArrayList<String>();
	private CardPayDetails payDetails = new CardPayDetails();
	
	@PostConstruct
	public void init() {
		images.add("images/visa.png");
		images.add("images/mc.png");
		images.add("images/amex.png");
		images.add("images/dc.jfif");
		
		payDetails.setAmount(10000);
		
	}
	
	public List<String> getImages() {
		return images;
	}

	public void setImages(List<String> images) {
		this.images = images;
	}
	
	public CardPayDetails getPayDetails() {
		return payDetails;
	}

	public void setPayDetails(CardPayDetails payDetails) {
		this.payDetails = payDetails;
	}

	public void pay() {
		System.out.println("CardNo: " + payDetails.getCardNo());
		System.out.println("Name: " + payDetails.getName());
		System.out.println("Year: " + payDetails.getExpiryMonth());
		System.out.println("Month: " + payDetails.getExpiryYear());
		System.out.println("CVV: " + payDetails.getCvvCode());
		
	}
	
}






