package com.spring.core.events;

import org.springframework.context.ApplicationEvent;


//@Component
public class OrdersEvent extends ApplicationEvent {

	private String eventType;
	private Orders order;
	// source -> the publisher
	public OrdersEvent(Object source, String eventType, Orders order) {
		super(source);
		this.eventType = eventType;
		this.order = order;
	}
	
	public String getEventType() {
		return eventType;
	}
	public Orders getOrder() {
		return order;
	}
	
	
}
