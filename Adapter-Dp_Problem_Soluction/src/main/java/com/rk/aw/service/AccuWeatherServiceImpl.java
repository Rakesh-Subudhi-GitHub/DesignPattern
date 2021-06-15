package com.rk.aw.service;

import java.text.DecimalFormat;

import com.rk.aw.adapter.WeatherReportCompAdapter;

public class AccuWeatherServiceImpl implements AccuWeatherService {

	public String showTemperature(String cityName) {
		
		// use Adapter
		WeatherReportCompAdapter adapter=new WeatherReportCompAdapter();
		
		double temp=adapter.fetchTemperature(cityName);
		 DecimalFormat df=new DecimalFormat("0.00");
		
		 return "temperature of "+cityName +" is  "+df.format(temp)+" celsius degrees";
	}

}
