package com.tcs.railway.controller.details;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StationName {
	
	private String body;

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}
	
	public StationName() {
		
	}
	
	public StationName(String body) {
		super();
		this.body = body;
	}

	@Override
	public String toString() {
		return "StationName [body=" + body + "]";
	}
	
	public String StartingStarting() {
		String StartingStationName = "\"source_name\":\"([^\"]+)\"";
		Pattern pattern = Pattern.compile(StartingStationName);
		Matcher matcher = pattern.matcher(body);

		if (matcher.find()) {
			String Station = matcher.group(1);
			return Station;
		} else {
			return "Station Not Found";
		}
	}
	
	public String EndingStarting() {
		String EndingStationName = "\"destination_name\":\"([^\"]+)\"";
		Pattern pattern = Pattern.compile(EndingStationName);
		Matcher matcher = pattern.matcher(body);

		if (matcher.find()) {
			String Station = matcher.group(1);
			return Station;
		} else {
			return "Station Not Found";
		}
	}
}
