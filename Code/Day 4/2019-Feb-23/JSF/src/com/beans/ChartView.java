package com.beans;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.BarChartModel;
import org.primefaces.model.chart.ChartSeries;
import org.primefaces.model.chart.LineChartModel;
import org.primefaces.model.chart.PieChartModel;

@ManagedBean
@ViewScoped
public class ChartView {

	private BarChartModel barChartModel;
	private PieChartModel pieChartModel;
	private LineChartModel lineChartModel;
	
	@PostConstruct
	public void init() {
		
		barChartModel = new BarChartModel();
		ChartSeries suv = new ChartSeries("SUV");
		suv.set("2016", 2300);
		suv.set("2017", 4600);
		suv.set("2018", 6700);
		barChartModel.addSeries(suv);
		
		ChartSeries sedan = new ChartSeries("Sedan");
		sedan.set("2016", 5400);
		sedan.set("2017", 8900);
		sedan.set("2018", 9100);
		barChartModel.addSeries(sedan);
		
		ChartSeries hb = new ChartSeries("HatchBack");
		hb.set("2016", 8200);
		hb.set("2017", 9900);
		hb.set("2018", 11300);
		barChartModel.addSeries(hb);
		barChartModel.setTitle("Car Sales / Year");
		barChartModel.setLegendPosition("nw");
		barChartModel.getAxis(AxisType.X).setLabel("Years");
		barChartModel.getAxis(AxisType.Y).setLabel("Cars");
		barChartModel.setAnimate(true);
		
		Map<String, Number> pieData = new HashMap<>();
		pieData.put("Sedan", 800);
		pieData.put("SUV", 1700);
		pieData.put("HatchBack", 3400);
		pieChartModel = new PieChartModel(pieData);
		pieChartModel.setLegendPosition("ne");
		pieChartModel.setTitle("Car Sales for 2019");
		pieChartModel.setFill(true);
		
		lineChartModel = new LineChartModel();
		lineChartModel.addSeries(suv);
		lineChartModel.addSeries(sedan);
		lineChartModel.addSeries(hb);
		
		Axis xAxis =  lineChartModel.getAxis(AxisType.X);
		xAxis.setMin(2000);
		xAxis.setMax(2019);
		
		Axis yAxis =  lineChartModel.getAxis(AxisType.Y);
		yAxis.setMin(1000);
		yAxis.setMax(20000);
		
	}
	

	public BarChartModel getBarChartModel() {
		return barChartModel;
	}

	public void setBarChartModel(BarChartModel barChartModel) {
		this.barChartModel = barChartModel;
	}


	public PieChartModel getPieChartModel() {
		return pieChartModel;
	}


	public void setPieChartModel(PieChartModel pieChartModel) {
		this.pieChartModel = pieChartModel;
	}


	public LineChartModel getLineChartModel() {
		return lineChartModel;
	}


	public void setLineChartModel(LineChartModel lineChartModel) {
		this.lineChartModel = lineChartModel;
	}
	
	
}
