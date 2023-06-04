package org.ass.orderservice.serviceImp;

import java.util.Date;

import org.ass.orderservice.dto.OrderDto;
import org.ass.orderservice.entity.OrderEntity;
import org.ass.orderservice.repository.OrderRepository;
import org.ass.orderservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderServiceImp implements OrderService {

	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private OrderServiceImp OrderServiceImp;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Override
	public String processOrder(OrderDto orderDto) {
		OrderEntity entity = new OrderEntity();
		entity.setProductId(orderDto.getProductId());
		entity.setPaymentMethod(orderDto.getPaymentMode());
		entity.setOrderDate(new Date());
		entity.setQuantity(orderDto.getQuantity());
		
		StringBuilder builder = new StringBuilder();
		builder.append("http://localhost:8080/mus/getProductPriceById/");
		builder.append(orderDto.getProductId());
		Double productPrice = restTemplate.getForObject(builder.toString(), Double.class); 

		entity.setPrice(productPrice*orderDto.getProductId());
		orderRepository.saveOrder(entity);
		return "order placed sucessful";
	}

	

}
