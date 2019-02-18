package com.beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import com.model.Product;

@ManagedBean
@ApplicationScoped
public class ProductRepository {

	private List<Product> products = new ArrayList<>();
	
	public ProductRepository() {
		
		products.add(new Product(1, "IPhone", 74000, "Mobiles", "product"));
		products.add(new Product(2, "One Plus", 39000, "Mobiles", "product"));
		products.add(new Product(3, "Dell Inspiron", 66000, "Laptops", "product"));
		products.add(new Product(4, "HP Mouse", 2000, "Devices", "product"));
		products.add(new Product(5, "Galaxy s6", 56000, "Mobiles", "product"));
		products.add(new Product(6, "MacBook", 109000, "Laptops", "product"));
		products.add(new Product(7, "Sandisk Drive", 800, "Devices", "product"));
		
	}
	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
}




