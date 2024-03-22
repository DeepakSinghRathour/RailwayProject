package com.tcs.railway.controller.details;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.web.client.RestTemplate;

public class StationCode {
	
	private String URL;
	
	public StationCode(){
		
	}

	public String getURL() {
		return URL;
	}

	public void setURL(String uRL) {
		URL = uRL;
	}
	
	public StationCode(String uRL) {
		super();
		URL = uRL;
	}
	
	@Override
	public String toString() {
		return "StationCode [URL=" + URL + "]";
	}

	public String getStationCode() {
		RestTemplate resttemplate = new RestTemplate();
		String result = resttemplate.getForObject(URL, String.class);
		String stationCode = "\"code\":\"([^\"]+)\"";
		Pattern pattern = Pattern.compile(stationCode);
		Matcher matcher = pattern.matcher(result);
		
		if (matcher.find()) {
            String Code = matcher.group(1);
            return Code;
        } else {
            return "Train Not Found";
        }
	}

}
