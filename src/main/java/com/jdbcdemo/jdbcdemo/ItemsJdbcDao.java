package com.jdbcdemo.jdbcdemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ItemsJdbcDao {

	@Autowired
	JdbcTemplate jdbcTemplate; 
	
	public List<Items> findAllItems(){
		return jdbcTemplate.query("select * from items",new BeanPropertyRowMapper<Items>(Items.class)); 
	}
	
	public int addItems(String name, int quantity, String description, double price) {
		String addQuery = "insert into food(name, quantity, description, price) values(?,?,?,?,?)";
			return jdbcTemplate.update(addQuery, name, quantity, description, price);	
	}
	
	public int updateItems(Items items) {
		String updateQuery = "update food set name =?, quantity=?, description =?, price =?   where id = ?";
		return jdbcTemplate.update(updateQuery, items.getName(), items.getQuantity(), items.getDescription(), items.getId(), items.getPrice());
	}
	public int deleteItems (int id) {
		String deleteQuery ="delete from items where id = ?";
		return jdbcTemplate.update(deleteQuery,id);
	}
	
}
