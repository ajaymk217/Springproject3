package org.ass.orderservice.repository;

import org.ass.orderservice.entity.OrderEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class OrderRepository {
	
	@Autowired
	SessionFactory sessionFactory;
	
	public void saveOrder(OrderEntity orderEntity) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Object object = session.merge(orderEntity);
		transaction.commit();
		
	}


}
