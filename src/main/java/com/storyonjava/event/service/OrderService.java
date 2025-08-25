package com.storyonjava.event.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import com.storyonjava.event.events.OrderCreatEvents;

@Service
public class OrderService {
	
	@Autowired
	private ApplicationEventPublisher abc;
	
	public void CreateOrder(long orderId) {
		System.out.println("Order placed with id: "+orderId);
		abc.publishEvent(new OrderCreatEvents(orderId));
	}

}
