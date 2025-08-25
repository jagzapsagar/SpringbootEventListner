package com.storyonjava.event.events;

public class OrderCreatEvents {
	
	private long orderId;

	public OrderCreatEvents() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderCreatEvents(long orderId) {
		super();
		this.orderId = orderId;
	}

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	
	

}
