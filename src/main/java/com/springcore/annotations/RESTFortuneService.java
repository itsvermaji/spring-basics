package com.springcore.annotations;

import org.springframework.stereotype.Component;

@Component("rest")
public class RESTFortuneService implements FortuneService {

	public String getFortune() {
		return "rest fortuneService";
	}

}
