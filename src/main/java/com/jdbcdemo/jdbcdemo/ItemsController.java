package com.jdbcdemo.jdbcdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

// This is using hibernate and JPA not JDBC!!!
@Controller
public class ItemsController {
	@Autowired
	ItemsRepository i;

	@RequestMapping("/")
	public ModelAndView index() {

		return new ModelAndView("index", "test", i.findAll());
	}

	@RequestMapping("add")
	public ModelAndView addForm() {
		return new ModelAndView("form-page");
	}
	@RequestMapping("edit")
	public ModelAndView showUpdateForm(@RequestParam("id") int id) {
		return new ModelAndView("update-items", "id", id);
	}

	@RequestMapping("update-items")
	public ModelAndView consumeFood(@RequestParam("name") String n, @RequestParam("quantity") Integer q,
			@RequestParam("description") String d, @RequestParam("price") Double p) {
		i.save(new Items(n, q, d, p));
		return new ModelAndView("redirect:/");
	}

	@RequestMapping("/update-form")
	public ModelAndView updateForm(@RequestParam("id") String id) {

		return new ModelAndView("update-items", "id", id);
	}
	@RequestMapping("/addpage")
	public ModelAndView updateItemsPage() {
		return new ModelAndView("add-item");
	}

	@RequestMapping("/add-items")
	public ModelAndView updateItems(Items items) {
		
			
		Items checkExists = i.findByName(items.getName());
		if (checkExists != null) {
			return new ModelAndView("add-item", "exists", "That item already exists!");
		}
		i.save(items);
		return new ModelAndView("redirect:/");
	}

	@RequestMapping("/delete-items")
	public ModelAndView deleteItem(@RequestParam("id") Integer id) {
		i.deleteById(id);
		return new ModelAndView("delete-item");
	}
	@RequestMapping("/delete")
	public ModelAndView delete(@RequestParam("id") Integer id) {
		i.deleteById(id);
		return new ModelAndView("redirect:/");
	}
	

}
