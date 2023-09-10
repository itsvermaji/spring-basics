package com.springcore.start;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.annotations.BadFortuneService;
import com.springcore.annotations.Coach;
import com.springcore.annotations.FortuneService;
import com.springcore.annotations.HappyFortuneService;
import com.springcore.annotations.TennisCoach;

public class MyApp {
	public static void main(String[] args) {
//		System.out.println("Hello world!");
//		BaseballCoach theCoach = new BaseballCoach();
//		System.out.println(theCoach.getDailyWorkout());
//		FortuneService fortuneService = new HappyFortuneService();
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotationDemo.xml");
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		System.out.println(theCoach.getDailyFortune());
	}

}
