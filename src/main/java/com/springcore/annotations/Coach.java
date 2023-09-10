package com.springcore.annotations;

public interface Coach {
	public String getDailyWorkout();
	public String getDailyFortune();
	public void willCallHappy(FortuneService fortuneService);
}
