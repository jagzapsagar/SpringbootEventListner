package com.storyonjava.event.listener;

import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import com.storyonjava.event.events.OrderCreatEvents;

@Component
public class EmailListener {
	
	@EventListener(condition="#event.orderId <2")
	@Async
	@Order(1)
	public void handleEmail(OrderCreatEvents event) throws InterruptedException {
		System.out.println("Sending mail!!!");
		Thread.sleep(4000);
		System.out.println("Mail send with order ID: "+event.getOrderId());
	}

}
