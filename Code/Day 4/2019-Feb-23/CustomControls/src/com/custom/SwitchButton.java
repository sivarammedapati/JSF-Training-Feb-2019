package com.custom;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import javax.faces.application.ResourceDependencies;
import javax.faces.application.ResourceDependency;
import javax.faces.component.FacesComponent;
import javax.faces.component.UIInput;
import javax.faces.component.UIOutput;
import javax.faces.component.behavior.ClientBehaviorHolder;
import javax.faces.context.FacesContext;

import org.primefaces.component.api.Widget;



@FacesComponent(value=SwitchButton.COMPONENT_TYPE)
@ResourceDependencies({
	@ResourceDependency(library="switch", name="switch.js")
})
public class SwitchButton extends UIInput implements Widget, ClientBehaviorHolder  {

	public static final String COMPONENT_FAMILY = "triygn.components";
	public static final String COMPONENT_TYPE = "triygn.components.SwitchButton";
	
	private Collection<String> eventNames = Collections.unmodifiableCollection(Arrays.asList("click"));
	
	@Override
	public Collection<String> getEventNames() {
		return eventNames;
	}
	
	@Override
	public String getDefaultEventName() {
		
		return "click";
	}
	
	
	protected static enum PropertyKeys{
		widgetVar
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






