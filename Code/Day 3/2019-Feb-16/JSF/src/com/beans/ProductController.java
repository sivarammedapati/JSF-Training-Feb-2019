package com.beans;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.RowEditEvent;

import com.model.Product;

@ManagedBean
@ViewScoped
public class ProductController {

	@ManagedProperty("#{productRepository}")
	private ProductRepository repository;	
	private List<Product> products;
	private Product selectedProduct;
	
	
	public ProductController() {
		
		
	}
	@PostConstruct
	public void init() {
		
		this.products = repository.getProducts();
	}
	
	public List<Product> getProducts() {
		return products;
	}
	public void setRepository(ProductRepository repository) {
		this.repository = repository;
	}
	public Product getSelectedProduct() {
		return selectedProduct;
	}
	public void setSelectedProduct(Product selectedProduct) {
		this.selectedProduct = selectedProduct;
	}
	
	public void onRowEdit(RowEditEvent event) {
		
		Product product = (Product) event.getObject();
		System.out.println("Product Saved");
		System.out.println("Id: " + product.getId());
		System.out.println("Name: " + product.getName());
		System.out.println("Price: " + product.getPrice());
		System.out.println("Category: " + product.getCategory());
		
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Saved", null));
	}
	
	public void onRowEditCancel(RowEditEvent event) {
		
		Product product = (Product) event.getObject();
		System.out.println("Product Save Cancalled");
		System.out.println("Id: " + product.getId());
		System.out.println("Name: " + product.getName());
		System.out.println("Price: " + product.getPrice());
		System.out.println("Category: " + product.getCategory());
		
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Cancelled", null));
	}
	
	
	
	
}







