package com.tcs.railway.controller.details;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SeatNameList {

	private String body;

	public SeatNameList() {

	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public SeatNameList(String body) {
		super();
		this.body = body;
	}

	@Override
	public String toString() {
		return "SeatWithAllClass [body=" + body + "]";
	}

	// Sleeper Available Status
	public String getSleeperStatus() {
		String sleeperSeat = "\"code\":\"SL\",\"name\":\"Sleeper Class\",\"non_formatted_status\":\"([^\"]+)\"";
		Pattern pattern = Pattern.compile(sleeperSeat);
		Matcher matcher = pattern.matcher(body);

		if (matcher.find()) {
			String Code = matcher.group(1);
			return Code;
		} else {
			return "Seats Not Available";
		}
	}
}
