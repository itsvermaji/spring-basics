package com.springcore.annotations;

import org.springframework.stereotype.Component;

@Component
public class BadFortuneService implements FortuneService {

	public String getFortune() {
		return "I am a badFortuneService, I do bad";
	}
}
