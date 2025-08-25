package com.storyonjava.event.listener;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import com.storyonjava.event.events.OrderCreatEvents;

@Component
public class EmailListener {
	
	@EventListener
	@Async
	public void handleEmail(OrderCreatEvents event) throws InterruptedException {
		Thread.sleep(4000);
		System.out.println("Sending email with order ID: "+event.getOrderId());
	}

}
