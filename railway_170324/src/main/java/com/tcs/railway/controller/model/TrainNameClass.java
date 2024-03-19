package com.tcs.railway.controller.model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.web.client.RestTemplate;

public class TrainNameClass {
	
	private String URL;
	
	public TrainNameClass() {
		
	}

	public String getURL() {
		return URL;
	}

	public void setURL(String uRL) {
		URL = uRL;
	}

	public TrainNameClass(String uRL) {
		super();
		URL = uRL;
	}

	@Override
	public String toString() {
		return "TrainNameClass [URL=" + URL + "]";
	}

	public String getTrainName() {
		RestTemplate resttemplate = new RestTemplate();
		String result_seatAvailablility = resttemplate.getForObject(URL, String.class);
		System.out.println(result_seatAvailablility);
		String trainName = "\"trainName\":\"([^\"]+)\"";
		Pattern pattern = Pattern.compile(trainName);
		Matcher matcher = pattern.matcher(result_seatAvailablility);
		if (matcher.find()) {
            String TrainName = matcher.group(1);
            System.out.println("Train Name: " + TrainName);
            return TrainName;
        } else {
            System.out.println("Train name not found.");
            return "Train Not Found";
        }
	}
}
