package com.ustglobal.springmvc.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ustglobal.springmvc.beans.Employee;

@Controller
public class HelloController {
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
		CustomDateEditor editor = new CustomDateEditor(format,true);
		binder.registerCustomEditor(Date.class, editor);
	}

	// Query String

	@RequestMapping(path="/hello")
	public String hello(@RequestParam("name") String name,
			@RequestParam("id") int id,
			ModelMap map) {
		map.addAttribute("msg", "Hello World");
		map.addAttribute("name", name);
		map.addAttribute("id", id);
		return "index";
	}

	// Path param
	@RequestMapping(path="/hi/{name}/{id}")
	public String hi(@PathVariable("name") String name,
			@PathVariable("id") int id,
			HttpServletRequest request) {
		request.setAttribute("msg", "Hello world java");
		request.setAttribute("name", name);
		request.setAttribute("id", id);
		return "index";
	}

	//Form data
	@RequestMapping(path="/form")
	public String formPage() {
		return "form";
	}

//	@RequestMapping(path="/form" , method=RequestMethod.POST)
//	public String form(int id ,String name,
//			String password,String gender,
//			ModelMap map) {
//		map.addAttribute("id", id);
//		map.addAttribute("name", name);
//		map.addAttribute("password", password);
//		map.addAttribute("gender", gender);
//		
//		return "formoutput";
//	}
	
	
	@RequestMapping(path="/form" , method=RequestMethod.POST)
	public String form(Employee employee,
			ModelMap map) {
		map.addAttribute("id", employee.getId());
		map.addAttribute("name", employee.getName());
		map.addAttribute("password", employee.getPassword());
		map.addAttribute("gender", employee.getGender());
		map.addAttribute("doj", employee.getDoj());
		
		return "formoutput";
	}
	
	@RequestMapping(path="/create-cookie")
	public String createCookie(ModelMap map, HttpServletResponse response) {
		
		Cookie cookie = new Cookie("name", "Zuzu");
		response.addCookie(cookie);
		return "createcookie";
		
	}
	
	@RequestMapping(path="/read-cookie")
	public String readCookie(ModelMap map ,@CookieValue("name") String name) {
		map.addAttribute("name" , name);
		return "readcookie";
	}

	@RequestMapping(path = "/redirect")
	public String redirect() {
		return "redirect:http://www.google.com";
	}
	
	@RequestMapping(path="/forward")
	public String forward() {
		return "forward:hi/rakshitha/1";
	}
}
