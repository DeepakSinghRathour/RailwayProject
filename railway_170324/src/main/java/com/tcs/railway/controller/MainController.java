package com.tcs.railway.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.tcs.railway.controller.model.TrainNameClass;

@Controller
public class MainController {

	@RequestMapping("/")
	public String home() {
		System.out.println("This is homepage");
		return "homepage";
	}
	
	@RequestMapping("/seatAvailability")
	private ModelAndView getHelloClient(@RequestParam("ReservationDetails") List<String> ReservationDetails, @RequestParam("StartingStation") String StartingStation,@RequestParam("EndingStation") String EndingStation, @RequestParam("Date") String Date) {
		System.out.println(StartingStation+" "+EndingStation+ " " + Date);
		ModelAndView modelAndView = new ModelAndView("AvailableSeat");
		String url1_seatAvailability = "https://travel.paytm.com/api/trains/v3/search?source="+StartingStation+"&destination="+EndingStation+"&departureDate="+Date+"&client=web&show_empty=true";
		String trainName = new TrainNameClass(url1_seatAvailability).getTrainName();
		modelAndView.addObject("trainName", trainName);
		return modelAndView;
	}
}
