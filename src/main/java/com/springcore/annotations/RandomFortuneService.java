package com.springcore.annotations;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	private String[] data = {
			"Beware of wolf in sheep's clothing",
			"string 2",
			"string 3",
			"string 4",
			"string 5"
	};
	
	private Random myRandom = new Random();
	
	public String getFortune() {
		int index = myRandom.nextInt(data.length);
		return data[index];
//		return "random service";
	}

}
