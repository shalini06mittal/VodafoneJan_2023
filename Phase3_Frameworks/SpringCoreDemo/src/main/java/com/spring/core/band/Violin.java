package com.spring.core.band;

import org.springframework.stereotype.Component;

@Component
public class Violin implements Instrument {

	@Override
	public void play() {
		System.out.println("Playing violin");
		
	}

}
