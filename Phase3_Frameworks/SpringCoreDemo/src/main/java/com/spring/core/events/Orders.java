package com.spring.core.events;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * 1. Create an event OrdersEvent => extends ApplicationEvent
 * 2. OrdersEventListener => @EventListener or implements ApplicationListener
 * 3. OrdersPublisher => reference of type ApplicationEventPublisher using which
 * you can publish an event [ OrdersEvent ]
 * 
 * @author Shalini
 *
 */
@NoArgsConstructor
@Data
@AllArgsConstructor
public class Orders {

	private String orderid;
	private String cname;
	private LocalDate orderdate;
	
}
