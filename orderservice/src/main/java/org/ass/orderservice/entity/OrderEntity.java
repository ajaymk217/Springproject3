package org.ass.orderservice.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="ordersrevice_info")
public class OrderEntity implements Serializable{
	
	@Id
	@GenericGenerator(name = "auto",strategy = "increment")
	@GeneratedValue(generator = "auto")
	private long altKey;
	
	@Column(name = "productId")
	private long productId;
	
	@Column(name = "quantity")
	private long quantity;
	
	@Column(name = "price")
	private Double price;
	
	@Column(name = "paymentMethod")
	private String paymentMethod;
	
	@Column(name = "orderDate")
	private Date orderDate;

	
	public long getAltKey() {
		return altKey;
	}

	public void setAltKey(long altKey) {
		this.altKey = altKey;
	}

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public long getQuantity() {
		return quantity;
	}

	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

}
