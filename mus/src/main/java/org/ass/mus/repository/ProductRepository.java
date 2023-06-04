package org.ass.mus.repository;


import java.util.List;
import java.util.stream.Collectors;

import org.ass.mus.entity.ProductEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.engine.internal.Collections;
import org.hibernate.mapping.Collection;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public ProductEntity saveProduct(ProductEntity productEntity) {
		try {
			
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			Object object = session.merge(productEntity);
			transaction.commit();
			return (ProductEntity)object;
		} catch (Exception e) {

		}
		return null;
		
		
	}
	public ProductEntity findById(long id) {
		
//			StringBuilder builder = new StringBuilder();
//			builder.append(" from ProductEntity where id=:i ");
//			Session session = sessionFactory.openSession();
//			Query query = session.createQuery(builder.toString());
//			query.setParameter("i", id);
//			List<ProductEntity> list = query.getResultList();
//			return list.get(0);
		
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			ProductEntity productEntity = session.get(ProductEntity.class, id);
			transaction.commit();
			return productEntity;

	}
	public List<ProductEntity> findAllProduct() {

			StringBuilder builder = new StringBuilder();
			builder.append("from ProductEntity ");
			Session session = sessionFactory.openSession();
			Query query = session.createQuery(builder.toString());
			return query.getResultList();

		
	}
	public ProductEntity deleteProductById(long id) {
			
		Session session = sessionFactory.openSession();
		Transaction beginTransaction = session.beginTransaction();
		ProductEntity productEntity = session.get(ProductEntity.class, id);
		session.delete(productEntity);
		beginTransaction.commit();
		return productEntity;
					
	}
	public void Product(ProductEntity entity) {
		// TODO Auto-generated method stub
		
	}
	public Integer findProductQuantityById(long id) {
		
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		transaction.commit();
		return (session.get(ProductEntity.class, id)).getQuantity();
		

		
	}
	public List<ProductEntity> findAllProductSortedByName() {

			StringBuilder builder = new StringBuilder();
			builder.append(" from ProductEntity ");
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			Query query = session.createQuery(builder.toString());
			List<ProductEntity> list = query.getResultList();
			List<ProductEntity> list2 = list.stream().sorted((e1,e2)->e1.getName().compareToIgnoreCase(e2.getName())).collect(Collectors.toList());
			return list2;
	}
	public List<ProductEntity> productByName(String name){
		StringBuilder builder = new StringBuilder();
		builder.append(" from ProductEntity where name=:n ");
		Session session = sessionFactory.openSession();
		Query query = session.createQuery(builder.toString());
		query.setParameter("n",name );
		return query.getResultList();
		
	}
	public List<ProductEntity> getProductInRange(double higherPrice, double lowerPrice){
		StringBuilder builder = new StringBuilder();
		builder.append(" from ProductEntity where price<=:h And price>=:l");
		Session session = sessionFactory.openSession();
		Query query = session.createQuery(builder.toString());
		query.setParameter("h", higherPrice);
		query.setParameter("l",lowerPrice );
		return query.getResultList();
		
	}
	public double getProductPriceById(long id){
	
		Session session = sessionFactory.openSession();
		return (session.get(ProductEntity.class,id)).getPrice();
		
	}
	
	
	

}
