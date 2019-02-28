package com.components;

import java.io.IOException;

import javax.faces.component.FacesComponent;
import javax.faces.component.UIOutput;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;

import com.model.HelloModel;

@FacesComponent(createTag=true, tagName="hello", namespace="http://trigyn/training/ui")
public class HelloComponent extends UIOutput {
	
	@Override
	public String getFamily() {
		
		return "com.components";
	}
	
	@Override
	public void encodeBegin(FacesContext context) throws IOException {
		
		//String message = (String) getValue();
		//String msg =  (String) getAttributes().get("msg");
		
		HelloModel model = (HelloModel) getValue();
		
		ResponseWriter writer =  context.getResponseWriter();
		writer.startElement("div", this);
		writer.writeAttribute("id", getClientId(context), null);
		
		writer.startElement("p", this);
		writer.write("Message: " + model.getMessage());
		writer.endElement("p");
		
		writer.startElement("p", this);
		writer.write("Author: " + model.getAuthor());
		writer.endElement("p");

		
		writer.endElement("div");
		
		
	}
	
	
	
}


