package com.storyonjava.event.listener;

import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import com.storyonjava.event.events.OrderCreatEvents;

@Component
public class SmsListener {
	
	@EventListener
	@Async
	@Order(2)
	public void SmsSent(OrderCreatEvents e) {
		System.out.println("Sending sms "+e.getOrderId());
	}

}
