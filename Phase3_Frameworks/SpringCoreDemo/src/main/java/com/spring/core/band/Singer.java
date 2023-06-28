package com.spring.core.band;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Singer {

	@Value("Shreya Ghosal")
	private String name;
	
	@Autowired
	@Qualifier("violin")
	private Instrument instrument;
	
	public Singer() {
		System.out.println("Singer default");
	}
	
	public void singing()
	{
		System.out.println(name+" is singing");
		instrument.play();
	}
}
