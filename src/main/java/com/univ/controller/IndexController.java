package com.univ.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.univ.bean.Customer;

import com.univ.services.CustomerServices;


@Controller
public class IndexController {

	@Autowired
	CustomerServices serv;
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	@RequestMapping("/index")
	public String index1() {
		return "index";
	}
	@RequestMapping("/shop")	
	public String shop()
	{
	  return "shop";	
	}
	@RequestMapping("/detail")	
	public String detail()
	{
	  return "detail";
	}
	@RequestMapping("/contact")	
	public String contact()
	{
	  return "contact";
	}
	@RequestMapping("/cart")	
	public String cart()
	{
	  return "cart";
	}
	@RequestMapping("/checkout")	
	public String checkout()
	{
	  return "checkout";
	}
	@RequestMapping("/login")	
	public String login()
	{
	  return "login";	
	}
	@RequestMapping("/reg")	
	public String reg()
	{
	  return "reg";	
	}
	
	@PostMapping("/reg")
	public String reg1(@ModelAttribute("cust") Customer cust) {
		if(cust.getCname().isEmpty()) {
			return "reg";
		}else {
			Customer c= serv.insert(cust);
			if(c!=null) {
				return "login";
			}else {
				return "reg";
			}
		}
		
	}
	
	@PostMapping("/login")
	public String login1(@ModelAttribute("cust") Customer cust) {
		if(cust.getUnm().isEmpty()) {
			return "login";
		}else {
			Customer c=serv.checkLogin(cust.getUnm(),cust.getPw());
			if(c!=null) {
				return "index";
			}else {
				return "login";
			}
		}
	}
	/*
	 * @Autowired uploadServices imgServ;
	 * 
	 * @RequestMapping("/view_images") public String viewImages(Model model) {
	 * List<upload> images = imgServ.getVisibleImages();
	 * model.addAttribute("images", images); return "/customer/view_images"; }
	 */
	
	  
}
