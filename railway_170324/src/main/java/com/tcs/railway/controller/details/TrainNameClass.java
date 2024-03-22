package com.tcs.railway.controller.details;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TrainNameClass {

	private String body;
	
	public TrainNameClass() {
		
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}
	
	public TrainNameClass(String body) {
		super();
		this.body = body;
	}

	@Override
	public String toString() {
		return "TrainNameClass [body=" + body + "]";
	}

	// Get 1 Train Name 
	public String getTrainName() {
		String trainName = "\"trainName\":\"([^\"]+)\"";
		Pattern pattern = Pattern.compile(trainName);
		Matcher matcher = pattern.matcher(body);

		if (matcher.find()) {
			String TrainName = matcher.group(1);
			return TrainName;
		} else {
			return "Train Not Found";
		}
	}
	
}
