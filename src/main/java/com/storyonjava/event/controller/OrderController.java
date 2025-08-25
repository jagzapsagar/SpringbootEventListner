package com.storyonjava.event.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.storyonjava.event.service.OrderService;

@RestController
@RequestMapping("/event")
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@PostMapping("/post/{id}")
	public String createOrder(@PathVariable long id) {
		System.out.println("order id: "+id);
		orderService.CreateOrder(id);
		return "Order placed..";
	}

}
