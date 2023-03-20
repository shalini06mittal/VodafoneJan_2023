package com.spring.core.events;

import java.time.LocalDate;

import org.springframework.stereotype.Repository;

@Repository
public class OrdersDB {

	public Orders createOrder()
	{
		Orders order = new Orders("O001", "Shalini", LocalDate.now()) ;
		return order;
	}
}
