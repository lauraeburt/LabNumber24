package com.jdbcdemo.jdbcdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PersonController {
	@Autowired
	PersonRepository p;

	@RequestMapping("/home")
	public ModelAndView home() {
		System.out.println(p.findById(1));
		return new ModelAndView("index", "listOfPeeps", p.findAll());
	}

	@RequestMapping("/see-form")
	public ModelAndView seeForm() {
		return new ModelAndView("user-registration");

	}

	@RequestMapping("/user-registration")
	public ModelAndView updatePerson(Person person) {
		System.out.println(person);
		p.save(person);
		return new ModelAndView("successful-registration");
	}

	@RequestMapping("delete-person")
	public ModelAndView deletePerson(@RequestParam("id") Integer id) {
		p.deleteById(id);
		return new ModelAndView("successful-registration");

	}

}
