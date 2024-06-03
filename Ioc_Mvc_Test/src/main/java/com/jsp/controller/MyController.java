package com.jsp.controller;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.dao.StudentDao;
import com.jsp.dto.Student;

@Controller
public class MyController {

	@Autowired
	private StudentDao dao;

	@RequestMapping("/Adminlogin")
	public ModelAndView adminLogin(@RequestParam String name, @RequestParam String password) {
		if (dao.adminValidation(name, password)) {
			ModelAndView mv = new ModelAndView("HomePage.jsp");
			mv.addObject("msg", "Login Successfull");
			return mv;

		} else {
			ModelAndView mv = new ModelAndView("Admin.jsp");
			mv.addObject("msg2", "Invalid Credentials");
			return mv;
		}

	}

	@RequestMapping("/signUp")
	public ModelAndView createStudent() {

		ModelAndView mv = new ModelAndView("Signup.jsp");
		mv.addObject("student", new Student());
		return mv;

	}

	@RequestMapping("/saveStudent")
	public ModelAndView saveStudentData(@ModelAttribute Student student, @RequestParam String db) {
		student.setDob(Date.valueOf(db));
		dao.saveStudent(student);

		ModelAndView mv = new ModelAndView("dashboard.jsp");
		mv.addObject("msg3", "Signup Successfull");
		mv.addObject("list", dao.findAll());
		return mv;

	}
	
	@RequestMapping("/findAll")
	public ModelAndView findAll() {
		ModelAndView modelAndView = new ModelAndView("dashboard.jsp");
		modelAndView.addObject("list", dao.findAll());
		return modelAndView;
	}
	
	@RequestMapping("/findbyid")
	public ModelAndView findStudentByID(@RequestParam String id) {
		ModelAndView modelAndView = new ModelAndView("dashboard.jsp");
		modelAndView.addObject("list", dao.findStudentById(Integer.parseInt(id)));
		return modelAndView;
		
	}

}
