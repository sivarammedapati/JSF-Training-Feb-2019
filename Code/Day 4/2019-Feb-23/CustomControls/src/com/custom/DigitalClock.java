package com.custom;

import javax.faces.application.ResourceDependencies;
import javax.faces.application.ResourceDependency;
import javax.faces.component.FacesComponent;
import javax.faces.component.UIOutput;
import javax.faces.context.FacesContext;

import org.primefaces.component.api.Widget;

@FacesComponent(value=DigitalClock.COMPONENT_TYPE)
@ResourceDependencies({
	@ResourceDependency(library="digital", name="digital-clock.js"),
	@ResourceDependency(library="moment", name="moment.js")
})
public class DigitalClock extends UIOutput implements Widget  {

	public static final String COMPONENT_FAMILY = "triygn.components";
	public static final String COMPONENT_TYPE = "triygn.components.DigitalClock";
	
	
	protected static enum PropertyKeys{
		color, fontSize, widgetVar
	}
	
	public void setColor(String color) {
		getStateHelper().put(PropertyKeys.color, color);
	}
	
	public String getColor() {
		return (String) getStateHelper().eval(PropertyKeys.color, "black");
	}
	
	public void setFontSize(Integer fontSize) {
		getStateHelper().put(PropertyKeys.fontSize, fontSize);
	}
	
	public Integer getFontSize() {
		return (Integer) getStateHelper().eval(PropertyKeys.fontSize, null);
	}
	
	public void setWidgetVar(String var) {
		getStateHelper().put(PropertyKeys.widgetVar, var);
	}
	
	public String getWidgetVar() {
		return (String) getStateHelper().eval(PropertyKeys.widgetVar, null);
	}
	
	
	
	
	@Override
	public String getFamily() {
		
		return COMPONENT_FAMILY;
	}

	@Override
	public String resolveWidgetVar() {
		
		String widgetVar = (String) getAttributes().get("widgetVar");
		
		if(widgetVar != null) {
			return widgetVar;
		}
		else {
			
			return "widget_" + this.getClientId(FacesContext.getCurrentInstance());
		}
	
	}
	
}






