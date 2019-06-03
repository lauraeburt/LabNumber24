package com.jdbcdemo.jdbcdemo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="items_table")
public class Items {//these are the categories in our database
	private String name;
	private Integer quantity;
	private String description;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private Double price;
	
	public Items() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Items(String name, Integer quantity, String description, Integer id, Double price) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.description = description;
		this.id = id;
		this.price = price;
	}

	public Items(String name, Integer quantity, String description, Double price) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.description = description;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Items [name=" + name + ", quantity=" + quantity + ", description=" + description + ", id=" + id
				+ ", price=" + price + "]";
	}
	
	
	
}
	
	
