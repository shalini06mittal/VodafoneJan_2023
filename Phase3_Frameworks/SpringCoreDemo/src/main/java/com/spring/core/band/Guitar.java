package com.spring.core.band;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Guitar implements Instrument {

	@Override
	public void play() {
		System.out.println("Playing guitar");	
	}
}
