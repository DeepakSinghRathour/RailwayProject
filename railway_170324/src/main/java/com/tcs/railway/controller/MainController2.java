package com.tcs.railway.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.tcs.railway.controller.details.SeatWithAllClass;
import com.tcs.railway.controller.details.StationCode;
import com.tcs.railway.controller.details.StationName;
import com.tcs.railway.controller.details.TrainNameClass;
import com.tcs.railway.controller.details.TrainNameList;

@Controller
public class MainController2 {

	@RequestMapping("/")
	public String home() {
		return "homepage";
	}

	// For Single Train Name
	@RequestMapping("/seatAvailability")
	private ModelAndView getHelloClient(@RequestParam("ReservationDetails") List<String> ReservationDetails,
			@RequestParam("StartingStation") String StartingStation,
			@RequestParam("EndingStation") String EndingStation, @RequestParam("Date") String Date) {

		// View Page is Seats_Available.jsp
		ModelAndView modelAndView = new ModelAndView("Seats_Available");

		// Starting Station Code
		String url_startingStationCode = "https://travel.paytm.com/api/trains/v3/station/" + ""
				+ StartingStation.toLowerCase() + "?client=web";
		String StartingStationcode = new StationCode(url_startingStationCode).getStationCode();

		// Ending Station Code
		String url_endingStationCode = "https://travel.paytm.com/api/trains/v3/station/" + ""
				+ EndingStation.toLowerCase() + "?client=web";
		String EndingStationcode = new StationCode(url_endingStationCode).getStationCode();
		String url1 = "https://travel.paytm.com/api/trains/v3/search?source=" + StartingStationcode + "&destination="
				+ EndingStationcode + "&departureDate=" + Date + "&client=web&show_empty=true";

		// GeT body
		RestTemplate resttemplate = new RestTemplate();
		String Body = resttemplate.getForObject(url1, String.class);

		// Search Train Name
		String trainName = new TrainNameClass(Body).getTrainName();

		// Get Station Name
		String StartingStationName = new StationName(Body).StartingStarting();
		String EndingStationName = new StationName(Body).EndingStarting();

		// Seats Status
		String SL = new SeatWithAllClass(Body).getSleeperStatus();
		String ThirdEconomy = new SeatWithAllClass(Body).get3EStatus();
		String ThirdAC = new SeatWithAllClass(Body).get3ACStatus();
		String SecondAC = new SeatWithAllClass(Body).get2ACStatus();
		String FirstAC = new SeatWithAllClass(Body).get1ACStatus();

		// add object in model and view
		modelAndView.addObject("trainName", trainName);
		modelAndView.addObject("StartingStationName", StartingStationName);
		modelAndView.addObject("EndingStationName", EndingStationName);
		modelAndView.addObject("SL", SL);
		modelAndView.addObject("ThirdEconomy", ThirdEconomy);
		modelAndView.addObject("ThirdAC", ThirdAC);
		modelAndView.addObject("SecondAC", SecondAC);
		modelAndView.addObject("FirstAC", FirstAC);

		return modelAndView;

	}

	// For Multiple Train Name
	@RequestMapping("/seatAvailabilities")
	private ModelAndView getHelloClient2(@RequestParam("ReservationDetails") List<String> ReservationDetails,
			@RequestParam("StartingStation") String StartingStation,
			@RequestParam("EndingStation") String EndingStation, @RequestParam("Date") String Date) {

		// View Page is Available.jsp
		ModelAndView modelAndView = new ModelAndView("AvailableSeat");

		// Starting Station Code
		String url_startingStationCode = "https://travel.paytm.com/api/trains/v3/station/" + ""
				+ StartingStation.toLowerCase() + "?client=web";
		String StartingStationcode = new StationCode(url_startingStationCode).getStationCode();

		// Ending Station Code
		String url_endingStationCode = "https://travel.paytm.com/api/trains/v3/station/" + ""
				+ EndingStation.toLowerCase() + "?client=web";
		String EndingStationcode = new StationCode(url_endingStationCode).getStationCode();
		String url1 = "https://travel.paytm.com/api/trains/v3/search?source=" + StartingStationcode + "&destination="
				+ EndingStationcode + "&departureDate=" + Date + "&client=web&show_empty=true";
		// GeT body
		RestTemplate resttemplate = new RestTemplate();
		String Body = resttemplate.getForObject(url1, String.class);

		List<String> trainName = new TrainNameList(Body).getListTrainName();
	
		// Get Station Name
		String StartingStationName = new StationName(Body).StartingStarting();
		String EndingStationName = new StationName(Body).EndingStarting();

		// add object in model and view
		modelAndView.addObject("trainName", trainName);
		modelAndView.addObject("StartingStationName", StartingStationName);
		modelAndView.addObject("EndingStationName", EndingStationName);
		return modelAndView;

	}
}
