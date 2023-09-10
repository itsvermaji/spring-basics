package com.springcore.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TennisCoach() {
		System.out.println("Tennis Coach: Default constructor!!");
	}
	
	@Autowired
	public TennisCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
		System.out.println("Tennis Coach: Parameterized constructor Injection!");
	}

	public String getDailyWorkout() {
		return "getDailyWorkout: from tennis coach";
	} 

	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
//	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
		System.out.println("Setter Injection!");
	}

}
