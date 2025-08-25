package com.storyonjava.event.listener;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.storyonjava.event.events.OrderCreatEvents;

@Component
public class EmailListener {
	
	@EventListener
	public void handleEmail(OrderCreatEvents event) {
		System.out.println("Sending email with order ID: "+event.getOrderId());
	}

}
