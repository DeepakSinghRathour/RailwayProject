package com.tcs.railway.processInput;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class InputController {

//	RedirectAttributes is a class used in Spring MVC framework to carry data from one request to another when redirecting.
	// For Single Train
	@PostMapping("/submitForm")
    public String submitForm(@RequestParam("ReservationDetails") List<String> ReservationDetails,
                             RedirectAttributes redirectAttributes) {
        redirectAttributes.addAttribute("ReservationDetails", ReservationDetails);
        redirectAttributes.addAttribute("StartingStation", ReservationDetails.get(0));
        redirectAttributes.addAttribute("EndingStation", ReservationDetails.get(1));
        String BeforeDate = ReservationDetails.get(2);
        String Date = BeforeDate.charAt(0)+""+BeforeDate.charAt(1)+BeforeDate.charAt(2)+BeforeDate.charAt(3)+BeforeDate.charAt(5)+BeforeDate.charAt(6)+BeforeDate.charAt(8)+BeforeDate.charAt(9);
        redirectAttributes.addAttribute("Date", Date);
        // Redirect to seatAvailability URL
        return "redirect:/seatAvailability";
    }
	
	// For All Train
	/*@PostMapping("/submitForm")
    public String submitForm(@RequestParam("ReservationDetails") List<String> ReservationDetails,
                             RedirectAttributes redirectAttributes) {
        redirectAttributes.addAttribute("ReservationDetails", ReservationDetails);
        redirectAttributes.addAttribute("StartingStation", ReservationDetails.get(0));
        redirectAttributes.addAttribute("EndingStation", ReservationDetails.get(1));
        String BeforeDate = ReservationDetails.get(2);
        String Date = BeforeDate.charAt(0)+""+BeforeDate.charAt(1)+BeforeDate.charAt(2)+BeforeDate.charAt(3)+BeforeDate.charAt(5)+BeforeDate.charAt(6)+BeforeDate.charAt(8)+BeforeDate.charAt(9);
        redirectAttributes.addAttribute("Date", Date);
        // Redirect to seatAvailability URL
        return "redirect:/seatAvailabilities";
    }*/
	
}
