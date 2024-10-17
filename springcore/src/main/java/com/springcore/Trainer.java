package com.springcore;

import org.springframework.stereotype.Component;

@Component("t1")
public class Trainer implements TrainerInterface{
	@Override
	public void teach() {
		System.out.println("trainer is teaching");
	}
}
