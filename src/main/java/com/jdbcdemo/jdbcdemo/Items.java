package com.jdbcdemo.jdbcdemo;

public class Items {//these are the categories in our database
	private String name;
	private int quantity;
	private String description;
	private int id;
	private double price;
	
	public Items(String name, int quantity, String description, int id, double price) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.description = description;
		this.id = id;
		this.price = price;
	}

	public Items() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Food [name=" + name + ", quantity=" + quantity + ", description=" + description + ", id=" + id
				+ ", price=" + price + "]";
	}
	
}
	
	
