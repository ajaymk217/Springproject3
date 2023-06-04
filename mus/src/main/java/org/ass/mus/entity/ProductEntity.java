package org.ass.mus.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "productdetails")
public class ProductEntity implements Serializable{
	
	@Id
	@GenericGenerator(name = "auto",strategy = "increment")
	@GeneratedValue(generator = "auto")
	@Column(name = "alt_key")
	private long altKey;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "price")
	private double price;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "quantity")
	private int quantity;

	public long getAltKey() {
		return altKey;
	}

	public void setAltKey(long altKey) {
		this.altKey = altKey;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "ProductEntity [altKey=" + altKey + ", name=" + name + ", price=" + price + ", description="
				+ description + ", quantity=" + quantity + "]";
	}

}
