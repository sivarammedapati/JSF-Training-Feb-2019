package com.beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import com.model.User;

@ManagedBean
@ApplicationScoped
public class UserRepository {
	
	private List<User> users = new ArrayList<>();
	
	public void save(User user) {
		
		System.out.println("UserRepository.save()");
		System.out.println("UserName: " + user.getUserName());
		System.out.println("Password: " + user.getPassword());
		System.out.println("Location: " + user.getLocation());
		System.out.println("Name: " + user.getName());
		System.out.println("Subscriptions: " + user.isEnableSubscriptions());
		System.out.println("SMS: " + user.isSmsSubscriptions());
		
		users.add(user);
	}

}
