package com.custom;

import java.io.IOException;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import javax.faces.render.FacesRenderer;

import org.primefaces.renderkit.CoreRenderer;
import org.primefaces.util.WidgetBuilder;

@FacesRenderer(componentFamily=DigitalClock.COMPONENT_FAMILY, rendererType=DigitalClockRenderer.RENDERER_TYPE)
public class DigitalClockRenderer extends CoreRenderer{

	public static final String RENDERER_TYPE = "triygn.components.DigitalClockRenderer";

	
	@Override
	public void encodeEnd(FacesContext context, UIComponent component) throws IOException {
		
		DigitalClock digitalClock = (DigitalClock) component;
		
		encodeMarkup(context, digitalClock);
		encodeScript(context, digitalClock);
		
	}


	private void encodeScript(FacesContext context, DigitalClock digitalClock) throws IOException {
		
		WidgetBuilder builder = getWidgetBuilder(context);
		
		builder.init("DigitalClock", digitalClock.resolveWidgetVar(), digitalClock.getClientId(context));
		builder.attr("color", digitalClock.getColor());
		builder.attr("fontSize", digitalClock.getFontSize());
		
		builder.finish();
	}


	private void encodeMarkup(FacesContext context, DigitalClock digitalClock) throws IOException {
		
		ResponseWriter writer = context.getResponseWriter();
		writer.startElement("div", digitalClock);
		writer.writeAttribute("id", digitalClock.getClientId(context), null);
		writer.endElement("div");
	}
	
}












