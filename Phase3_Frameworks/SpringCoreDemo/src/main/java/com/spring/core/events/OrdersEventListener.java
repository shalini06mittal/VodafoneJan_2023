package com.spring.core.events;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class OrdersEventListener {

	@EventListener
	public void onApplicationEvent(OrdersEvent event)
	{
		System.out.println("Listener called");
		System.out.println(event.getEventType());
		System.out.println(event.getSource());
		System.out.println(event.getOrder());
	}
}
