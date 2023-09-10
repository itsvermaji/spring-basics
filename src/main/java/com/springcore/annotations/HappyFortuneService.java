package com.springcore.annotations;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	public String getFortune() {
		return "I am happy Fortune provides service";
	}
}
