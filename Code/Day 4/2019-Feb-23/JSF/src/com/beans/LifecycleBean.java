package com.beans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.component.html.HtmlOutputText;
import javax.faces.component.html.HtmlPanelGrid;
import javax.faces.event.ValueChangeEvent;

@ManagedBean
public class LifecycleBean {

	private int noOfControls;
	private String message = "Hello";
	private HtmlPanelGrid panelGrid;
	
	
	public int getNoOfControls() {
		return noOfControls;
	}
	public void setNoOfControls(int noOfControls) {
		this.noOfControls = noOfControls;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public HtmlPanelGrid getPanelGrid() {
		return panelGrid;
	}
	public void setPanelGrid(HtmlPanelGrid panelGrid) {
		this.panelGrid = panelGrid;
	}
	
	public void redisplay() {
		
		List<UIComponent> children =  panelGrid.getChildren();
		children.clear();
		
		for (int i = 0; i < noOfControls; i++) {
			
			HtmlOutputText component = new HtmlOutputText();
			component.setValue(this.message);
			children.add(component);
		}
		System.out.println("LifecycleBean.redisplay()");
		
	}
	
	public void onValueChange(ValueChangeEvent evt) {
		
		System.out.println("LifecycleBean.onValueChange(): oldValue: " + evt.getOldValue());
		System.out.println("LifecycleBean.onValueChange(): newValue: " + evt.getNewValue());
		System.out.println("LifecycleBean.onValueChange(): noofControls: " + this.noOfControls);
		
	}
}









