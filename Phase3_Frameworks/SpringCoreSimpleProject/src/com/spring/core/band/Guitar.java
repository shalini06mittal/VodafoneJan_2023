package com.spring.core.band;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary // tells spring Guitar will be the default dependency for Singer classs
@Component
public class Guitar implements Instrument {

	@Override
	public void play() {
		System.out.println("Playing guitar");	
	}
}
