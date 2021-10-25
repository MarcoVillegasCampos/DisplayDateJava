package com.codingdojo.MainApp;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@SpringBootApplication

@Controller
public class DisplayDateApplication {

	public static void main(String[] args) {
		SpringApplication.run(DisplayDateApplication.class, args);
	}
	
	@RequestMapping( value = "/", method = RequestMethod.GET )
	public String Dashboard() {

		return "dashboard.jsp";
	}
	
	
	@RequestMapping(value="/date", method = RequestMethod.GET)
	public String Date( Model model) {
		
		Date date= new Date();
		SimpleDateFormat dateformat= new SimpleDateFormat("EEEE,'the' dd 'of' MMMM,YYYY");
		model.addAttribute("date", dateformat.format(date));
		
		return "Date.jsp";
		
		
		
		
		
		
	}
	
	@RequestMapping(value="/time", method = RequestMethod.GET)
	public String Time(Model model) {
		Date date= new Date();
		SimpleDateFormat dateformat= new SimpleDateFormat("HH:mm");
		model.addAttribute("time", dateformat.format(date));
		
		return "Time.jsp";
		
		
		
	}
}
