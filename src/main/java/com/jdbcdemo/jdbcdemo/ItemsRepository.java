package com.jdbcdemo.jdbcdemo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemsRepository extends JpaRepository<Items, Integer>{

	Items findByName(String name);
	

}

