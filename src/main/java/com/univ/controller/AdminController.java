package com.univ.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.univ.bean.Admin;
import com.univ.bean.Customer;

import com.univ.services.AdminServices;
import com.univ.services.CustomerServices;


import org.springframework.ui.Model;
@Controller
@RequestMapping("/admin")
public class AdminController {
	

	@Autowired
	AdminServices serv;
	@Autowired
	CustomerServices custService;

	@RequestMapping("/admin_index")
	public String admin_index() {
		return "/admin/index";
	}
	
	@RequestMapping("/admin_form")
	public String admin_form() {
		return "/admin/form";
	}
	
	@RequestMapping("/admin_table")
	public String admin_table(){
		return "/admin/table";
	}
	
	@RequestMapping("/admin_tab")
	public String admin_tab(){
		return "/admin/tab";
	}
	
	@RequestMapping("/admin_blank")
	public String admin_blank(){
		return "/admin/blank";
	}
	
	@RequestMapping("/admin_ui")
	public String admin_ui(){
		return "/admin/ui";
	}
	@RequestMapping("/admin_login")
	public String admin_login(){
		return "/admin/login";
	}
	@PostMapping("/admin_login")
	public String login1(@ModelAttribute("adm") Admin adm) {
		if(adm.getUnm().isEmpty()) {
			return "/admin/login";
		}else {
			Admin a=serv.checkLogin(adm.getUnm(),adm.getPw());
			if(a!=null) {
				return "/admin/index";
			}else {
				return "/admin/login";
			}
		}
	}
	@RequestMapping("/admin_reg")
	public String admin_reg(){
		return "/admin/reg";
	}
	@PostMapping("/admin_reg")
	public String reg1(@ModelAttribute("adm") Admin adm) {
		if(adm.getAname().isEmpty()) {
			return "/admin/reg";
		}else {
			Admin a= serv.insert(adm);
			if(a!=null) {
				return "/admin/login";
			}else {
				return "/admin/reg";
			}
		}
		
	}
	@RequestMapping("/admin_customers")
	public String viewCustomers(Model m) {
	    List<Customer> list = custService.getAllCustomers();
	    m.addAttribute("clist", list);
	    return "/admin/customers"; 
	}
	/*
	 * @Autowired UploadCode upcode;
	 * 
	 * @Autowired uploadServices imgServ;
	 * 
	 * 
	 * 
	 * @RequestMapping("/admin_file") public String file1() { return "/admin/file";
	 * }
	 * 
	 * @PostMapping("/admin_file") public ModelAndView
	 * uploadFile1(@ModelAttribute("up") upload up, @RequestParam MultipartFile
	 * file) { ModelAndView mv= new ModelAndView(); if (up.getImgname().isBlank()) {
	 * mv.setViewName("redirect:/admin/admin_file"); }
	 * up.setImgname(file.getOriginalFilename()); upload data =
	 * this.imgServ.insert(up); try { if(file.isEmpty()) {
	 * mv.addObject(ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
	 * .body("file not found")); } if(!file.getContentType().equals("image/jpeg")) {
	 * mv.addObject(ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
	 * .body("upload only jpeg image")); } boolean bt=upcode.uploadFile(file);
	 * if(bt) { mv.addObject(ResponseEntity.ok("File stored")); }
	 * 
	 * } catch (Exception ee) { ee.getStackTrace(); } mv.setViewName("admin/file");
	 * return mv;
	 * 
	 * 
	 * }
	 */
	
	/*
	 * @RequestMapping("/admin_uploaded_images") public String
	 * viewUploadedImages(Model model) { // Retrieve the list of uploaded images
	 * List<upload> uploadedImages = imgServ.getAllImages();
	 * model.addAttribute("imglist", uploadedImages); // Add the list to the model
	 * return "/admin/admin_uploaded_images"; // Return the JSP view name }
	 * 
	 * @PostMapping("/admin_delete_image") public String
	 * deleteImage(@RequestParam("id") int id) { upload img = imgServ.getById(id);
	 * if(img != null) { upcode.deleteFile(img.getImgname()); // Delete from folder
	 * imgServ.delete(id); // Delete from database } return
	 * "redirect:/admin/admin_uploaded_images"; // refresh page }
	 * 
	 * @PostMapping("/admin_show_image") public String
	 * showImageToCustomer(@RequestParam("id") int id) { imgServ.updateVisible(id,
	 * true); // Make visible to customers return
	 * "redirect:/admin/admin_uploaded_images"; // refresh page }
	 */

}
