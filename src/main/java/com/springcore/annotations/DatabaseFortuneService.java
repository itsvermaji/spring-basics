package com.springcore.annotations;

import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class DatabaseFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Database Fortune Service";
	}

}
