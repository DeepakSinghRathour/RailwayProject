package com.tcs.railway.controller.details;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SeatWithAllClass {

	private String body;

	public SeatWithAllClass() {
		
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public SeatWithAllClass(String body) {
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

	// 3E Available Status
	public String get3EStatus() {
		String sleeperSeat = "\"code\":\"3E\",\"name\":\"AC 3 Tier Economy\",\"non_formatted_status\":\"([^\"]+)\"";
		Pattern pattern = Pattern.compile(sleeperSeat);
		Matcher matcher = pattern.matcher(body);

		if (matcher.find()) {
			String Code = matcher.group(1);
			return Code;
		} else {
			return "Seats Not Available";
		}
	}

	// 3 AC Available Status
	public String get3ACStatus() {
		String sleeperSeat = "\"code\":\"3A\",\"name\":\"AC 3 Tier\",\"non_formatted_status\":\"([^\"]+)\"";
		Pattern pattern = Pattern.compile(sleeperSeat);
		Matcher matcher = pattern.matcher(body);

		if (matcher.find()) {
			String Code = matcher.group(1);
			return Code;
		} else {
			return "Seats Not Available";
		}
	}

	// 2 AC Available Status
	public String get2ACStatus() {
		String sleeperSeat = "\"code\":\"2A\",\"name\":\"AC 2 Tier\",\"non_formatted_status\":\"([^\"]+)\"";
		Pattern pattern = Pattern.compile(sleeperSeat);
		Matcher matcher = pattern.matcher(body);

		if (matcher.find()) {
			String Code = matcher.group(1);
			return Code;
		} else {
			return "Seats Not Available";
		}
	}

	// 1 AC Available Status
	public String get1ACStatus() {
		String sleeperSeat = "\"code\":\"1A\",\"name\":\"First Class AC\",\"non_formatted_status\":\"([^\"]+)\"";
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
