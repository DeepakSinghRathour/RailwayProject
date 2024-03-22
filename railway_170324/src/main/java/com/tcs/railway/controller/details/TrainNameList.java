package com.tcs.railway.controller.details;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TrainNameList {

	private String body;

	public TrainNameList() {

	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public TrainNameList(String body) {
		super();
		this.body = body;
	}

	@Override
	public String toString() {
		return "TrainNameClass [body=" + body + "]";
	}

	// Get list of Train Name
	public List<String> getListTrainName() {
		String trainName = "\"trainName\":\"([^\"]+)\"";
		Pattern pattern = Pattern.compile(trainName);
		Matcher matcher = pattern.matcher(body);

		List<String> list = new ArrayList<>();
		while (matcher.find()) {
			list.add(matcher.group(1));
		}
		System.out.println(list);
		return list;
	}

}
