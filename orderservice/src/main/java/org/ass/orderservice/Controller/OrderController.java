package org.ass.orderservice.Controller;

import org.ass.orderservice.dto.OrderDto;
import org.ass.orderservice.serviceImp.OrderServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
	
	@Autowired
	private OrderServiceImp orderServiceImpl;
	
	@PostMapping(value="/processOrder")
	public String processOrder(@RequestBody OrderDto orderDto) {
		
		
		return orderServiceImpl.processOrder(orderDto);
	}
}
