package org.ass.orderservice.service;

import org.ass.orderservice.dto.OrderDto;

public interface OrderService {

	public String processOrder(OrderDto orderDto);
}
