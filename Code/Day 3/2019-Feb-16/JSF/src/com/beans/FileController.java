package com.beans;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;

@ManagedBean
@ViewScoped
public class FileController {

	private UploadedFile uploadedFile;
	
	
	public void fileUpload(FileUploadEvent event) {
		
		String message = "Uploaded: " + event.getFile().getFileName() + " Size: " + event.getFile().getSize()
															+ " Type: " + event.getFile().getContentType();
		System.out.println("FileController.fileUpload(): " + message);
		
		
		
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(message));
		
		
	}
	
	public void upload() {
		
		String message = "Uploaded: " + uploadedFile.getFileName() + " Size: " + uploadedFile.getSize()
				+ " Type: " + uploadedFile.getContentType();
		System.out.println("FileController.fileUpload(): " + message);



FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(message));
	}


	public UploadedFile getUploadedFile() {
		return uploadedFile;
	}


	public void setUploadedFile(UploadedFile uploadedFile) {
		this.uploadedFile = uploadedFile;
	}
	
}



