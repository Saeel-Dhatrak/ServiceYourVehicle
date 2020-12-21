package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.pojo.Customer;
import com.example.demo.pojo.ServicingType;
import com.example.demo.pojo.SparePart;
import com.example.demo.pojo.Vehicle;
import com.example.demo.service.ICustomerService;
import com.example.demo.service.IServicingTypeService;
import com.example.demo.service.ISparePartService;
import com.example.demo.service.IVehicleService;


@Controller
//@RequestMapping("/customers")
public class CopyCustomer {

	@Autowired
	private ICustomerService custService;
	
	@Autowired
	private IVehicleService Service;
	
	@Autowired
	private ISparePartService spareService;
	
	@Autowired
	private IServicingTypeService serviceType;
	
	public CopyCustomer() {
		System.out.println("In the Constructor "+getClass().getName());
	}
	
	
	
	
	@RequestMapping("/")
    public String index() {
        return "Spring Boot Example";
    }

	@RequestMapping(value = "loadCustomerForm", method = RequestMethod.GET)
	ModelAndView loadCustomerForm() {
		System.out.println("In mvc of customer");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("CreateCustomer");
		modelAndView.addObject("customerObj", new Customer());
		return modelAndView;
	}

	
	

	
	
		
}
