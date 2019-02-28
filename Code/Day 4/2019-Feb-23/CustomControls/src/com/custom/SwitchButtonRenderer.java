package com.custom;

import java.io.IOException;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import javax.faces.render.FacesRenderer;

import org.primefaces.renderkit.CoreRenderer;
import org.primefaces.util.WidgetBuilder;

@FacesRenderer(componentFamily=SwitchButton.COMPONENT_FAMILY, rendererType=SwitchButtonRenderer.RENDERER_TYPE)
public class SwitchButtonRenderer extends CoreRenderer{

	public static final String RENDERER_TYPE = "triygn.components.SwitchButtonRenderer";

	
	@Override
	public void decode(FacesContext context, UIComponent component) {
		
		SwitchButton switchButton = (SwitchButton) component;
		
		decodeBehaviors(context, switchButton);
		
		String result 
			= context.getExternalContext().getRequestParameterMap().get(switchButton.getClientId() + "_hidden");
		Boolean value = Boolean.parseBoolean(result);
		switchButton.setSubmittedValue(value);
		
	}
	
	
	
	@Override
	public void encodeEnd(FacesContext context, UIComponent component) throws IOException {
		
		SwitchButton switchButton = (SwitchButton) component;
		
		encodeMarkup(context, switchButton);
		encodeScript(context, switchButton);
		
	}


	private void encodeScript(FacesContext context, SwitchButton switchButton) throws IOException {
		
		WidgetBuilder builder = getWidgetBuilder(context);
		
		builder.init("SwitchButton", switchButton.resolveWidgetVar(), switchButton.getClientId(context));
		if(switchButton.getValue() != null)
			builder.attr("value", switchButton.getValue().toString());
		else
			builder.attr("value", "false");
		
		encodeClientBehaviors(context, switchButton);
		
		builder.finish();
	}


	private void encodeMarkup(FacesContext context, SwitchButton switchButton) throws IOException {
		
		ResponseWriter writer = context.getResponseWriter();
		writer.startElement("div", switchButton);
		writer.writeAttribute("id", switchButton.getClientId(context), null);
		writer.writeAttribute("class", "ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only", null);
		
		
		writer.startElement("span", switchButton);
		writer.writeAttribute("id", switchButton.getClientId() + "_span", null);
		writer.writeAttribute("class", "ui-button-text", null);
		
		//Boolean value =  (Boolean) switchButton.getValue();
		if(switchButton.getValue() != null && switchButton.getValue().equals("true")) {
			writer.write("On");
		}
		else {
			writer.write("Off");
		}
		writer.endElement("span");
		
		
		writer.startElement("input", switchButton);
		writer.writeAttribute("type", "hidden", null);
		writer.writeAttribute("id", switchButton.getClientId() + "_hidden", null);
		writer.writeAttribute("name", switchButton.getClientId() + "_hidden", null);
		if(switchButton.getValue() != null) {
			writer.writeAttribute("value", switchButton.getValue(), null);
		}
		else {
			writer.writeAttribute("value", "false", null);
		}
		writer.endElement("input");
		
		writer.endElement("div");
	}
	
}












