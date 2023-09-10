package com.springcore.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

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
