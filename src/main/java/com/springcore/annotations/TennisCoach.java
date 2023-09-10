package com.springcore.annotations;

import org.springframework.beans.factory.annotation.Autowired;

public class TennisCoach implements Coach {
	
	private FortuneService fortuneService;
	
	@Autowired
	public TennisCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	public String getDailyWorkout() {
		return "getDailyWorkout: from tennis coach";
	} 

	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
