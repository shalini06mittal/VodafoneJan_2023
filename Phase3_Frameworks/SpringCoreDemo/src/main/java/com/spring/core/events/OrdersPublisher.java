package com.spring.core.events;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class OrdersPublisher {

	@Autowired
	private ApplicationEventPublisher publisher;
	@Autowired
	private OrdersDB db;
	
	public void publishevent()
	{
		Orders orders = db.createOrder();
		publisher.publishEvent(new OrdersEvent(this, "ORDER_CREATED", orders));
	}
}
