package com.beans;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.model.DefaultOrganigramNode;
import org.primefaces.model.OrganigramNode;



@ManagedBean
@ViewScoped
public class OrganigramController {

	private OrganigramNode rootNode;
	
	@PostConstruct
	public void init() {
		
		rootNode = new DefaultOrganigramNode("tournament", "IPL Teams", null);
		rootNode.setCollapsible(false);
		
		
		OrganigramNode team1 = new DefaultOrganigramNode("team", "Mumbai Indians", rootNode);
		OrganigramNode team2 = new DefaultOrganigramNode("team", "Chennai SuperKings", rootNode);
		
		team1.setDroppable(true);
		team2.setDroppable(true);
		
		OrganigramNode p1 = new DefaultOrganigramNode("player", "Rohit", team1);
		OrganigramNode p2 = new DefaultOrganigramNode("player", "Yuvraj", team1);
		OrganigramNode p3 = new DefaultOrganigramNode("player", "Hardik", team1);
		OrganigramNode p4 = new DefaultOrganigramNode("player", "Dhoni", team2);
		OrganigramNode p5 = new DefaultOrganigramNode("player", "Raina", team2);
		
		p1.setDraggable(true);
		p2.setDraggable(true);
		p2.setDraggable(true);
		p3.setDraggable(true);
		p4.setDraggable(true);
		p5.setDraggable(true);
		
		
	}
	

	public OrganigramNode getRootNode() {
		return rootNode;
	}

	public void setRootNode(OrganigramNode rootNode) {
		this.rootNode = rootNode;
	}
	
	
	
}
