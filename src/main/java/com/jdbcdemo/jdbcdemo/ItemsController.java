package com.jdbcdemo.jdbcdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ItemsController {
	@Autowired
	ItemsJdbcDao dao;

	@RequestMapping("/")
	public ModelAndView index() {
		// System.out.println(dao.findAllFoods());
		return new ModelAndView("index", "test", dao.findAllItems());
	}

	@RequestMapping("add")
	public ModelAndView addForm() {
		return new ModelAndView("form-page");
	}

	@RequestMapping("add-items")
	public ModelAndView consumeFood(@RequestParam("name") String n, @RequestParam 
				("quantity") int q,@RequestParam("description") String d,@RequestParam("price") double p) {
		dao.addItems(n, q, d, p);
		return new ModelAndView ("redirect:/");
	}
	@RequestMapping("update-form")
	public ModelAndView updateForm(@RequestParam("id")String id ){
		
		return new ModelAndView ("update", "id", id);
	}
	@RequestMapping("update-items")
	public ModelAndView updateItems(Items items){
		dao.updateItems(items);
		return new ModelAndView ("redirect:/");
	}
	@RequestMapping("delete")
	public ModelAndView deleteItem(@RequestParam("id")int id){
		dao.deleteItems(id);
		return new ModelAndView ("redirect:/");
	}
	
}

