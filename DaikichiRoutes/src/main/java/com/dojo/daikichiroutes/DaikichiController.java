package com.dojo.daikichiroutes;

//add
import org.springframework.web.bind.annotation.RequestMapping;
//
import org.springframework.web.bind.annotation.RestController;

// import pathVariable
import org.springframework.web.bind.annotation.PathVariable;

//add
@RestController 

@RequestMapping("/daikichi")  
public class DaikichiController {
	@RequestMapping("")
    public String index(){
      return "Welcome !";
    }
    @RequestMapping("/today")
    public String today(){
      return "Today you will find luck in all your endeavors!";
    }
    @RequestMapping("/tomorrow")
    public String tomorrow(){
      return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
    }
    @RequestMapping("/travel/{destination}")
	public String travel(@PathVariable("destination") String destination) {
		return "Congratulations! You will soon travel to " + destination;
	}
    @RequestMapping("/lotto/{number}")
	public String lotto(@PathVariable("number") Integer number){
		if(number %2 == 0) {
			return "You will take a grand journey in the near future but be weary of temting offers";
		} else {
			return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and frineds.";
		}
	}

}

