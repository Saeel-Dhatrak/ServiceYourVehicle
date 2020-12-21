/*package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojo.Customer;
import com.example.demo.pojo.ServicingType;
import com.example.demo.pojo.SparePart;
import com.example.demo.pojo.Vehicle;

import com.example.demo.service.ICustomerService;
import com.example.demo.service.IServicingTypeService;
import com.example.demo.service.ISparePartService;
import com.example.demo.service.IVehicleService;


@RestController
@RequestMapping("/customers")
public class CustomerController {

	@Autowired
	private ICustomerService custService;
	
	@Autowired
	private IVehicleService Service;
	
	@Autowired
	private ISparePartService spareService;
	
	@Autowired
	private IServicingTypeService serviceType;
	
	public CustomerController() {
		System.out.println("In the Constructor "+getClass().getName());
	}
	
	/*@GetMapping
	public ResponseEntity<?> listAllCustomers()
	{
		System.out.println("in the "+getClass().getName());
		List<Customer> allCustomers=custService.getAllCustomers();
		if(allCustomers.isEmpty())
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<>(allCustomers, HttpStatus.OK);
	}
	
	@GetMapping("/{userName}")
	public ResponseEntity<?> getCustomerDetails(@PathVariable String userName)
	{
		System.out.println("in the "+getClass().getName());
		Optional<Customer> customerDetails = custService.findUserDetails(userName);
		if(customerDetails.isPresent())
			return new ResponseEntity<>(customerDetails, HttpStatus.OK);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
	@PostMapping
	public ResponseEntity<?> signUpCustomer(@RequestBody Customer newCustomer)
	{
		System.out.println("in the "+getClass().getName());
		try {
			Customer newlyAdded = custService.addNewCustomer(newCustomer);
			return new ResponseEntity<>(newlyAdded, HttpStatus.OK);
		}catch(RuntimeException e)
		{
			e.printStackTrace();
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PutMapping("/{customerId}")
	public ResponseEntity<?> updateCustomer(@PathVariable int customerId,@RequestBody Customer oldDetails)
	{
		System.out.println("in the "+getClass().getName());
		try {
			Customer updatingDetails=custService.updateCustomerDetails(customerId, oldDetails);
			return new ResponseEntity<>(updatingDetails, HttpStatus.OK);
		}catch(RuntimeException e)
		{
			e.printStackTrace();
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	@DeleteMapping("/{custId}")
	public ResponseEntity<?> deRegisterCustomer(@PathVariable int custId)
	{
		System.out.println("in the "+getClass().getName());
		try {
		custService.deleteCustomer(custId);
		return new ResponseEntity<>(HttpStatus.OK);
		}
			catch(RuntimeException e)
		{
		e.printStackTrace();
		return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	
	}
	
	//Get Vehicle
	@GetMapping("/vehicle/{id}")
	public ResponseEntity<?>getVehicle(@PathVariable int id){
		System.out.println("in the "+getClass().getName());
		Optional<Vehicle>vehicle=Service.findById(id);
		
		if(vehicle.isPresent())
			return new ResponseEntity<>(vehicle.get(),HttpStatus.OK);
		
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
	
	//Adding Vehicle
	@PostMapping("/addVehicle")
	public ResponseEntity<?>addVehicle(@RequestBody Vehicle entry)
	{
		System.out.println("in the "+getClass().getName());
		try {
			Vehicle vehicle =Service.addVehicle(entry);
			return new ResponseEntity<>(vehicle,HttpStatus.OK);
		}
		catch(RuntimeException e)
		{
			e.printStackTrace();
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	//updating vehicle
	@PutMapping("/updateVehicle/{id}")
	public ResponseEntity<?>updateVehicle(@PathVariable int id, @RequestBody Vehicle vehicle)
	{
		System.out.println("in the "+getClass().getName());
		try {
			Vehicle  v=Service.updateVehicle(id, vehicle);
			return new ResponseEntity<>(v,HttpStatus.OK);
		}catch(RuntimeException e) {
			e.printStackTrace();
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	//deleting vehicle
	@DeleteMapping("/deleteVehicle/{id}")
	public String deleteVehicle(@PathVariable int id) {
		System.out.println("in the "+getClass().getName());
		return Service.deleteVehicle(id);
	}
	
	
	
	
	//sparepart all
	@GetMapping("/getSparePart")
	public ResponseEntity<?> listAllSpare()
	{
		System.out.println("in the "+getClass().getName());
		List<SparePart> allSpare=spareService.getAllSparePart();
		if(allSpare.isEmpty())
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<>(allSpare, HttpStatus.OK);
	}
	
	//SPAREPART BY NAME
	@GetMapping("/getSparePart/{partName}")
	public ResponseEntity<?> getSparePart(@PathVariable String partName)
	{
		System.out.println("in the "+getClass().getName());
		Optional<SparePart> spareDetails = spareService.findByPartName(partName);
		if(spareDetails.isPresent())
			return new ResponseEntity<>(spareDetails, HttpStatus.OK);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

	
	//Servicing Type
	@GetMapping("/allServicingType")
	public ResponseEntity<?> listAllServicingType()
	{
		System.out.println("in the "+getClass().getName());
		List<ServicingType> allType=serviceType.getAllServicingType();
		if(allType.isEmpty())
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<>(allType, HttpStatus.OK);
	}
	
	@GetMapping("/getServicingType/{typeName}")
	public ResponseEntity<?> getServicingType(@PathVariable String typeName)
	{
		System.out.println("in the "+getClass().getName());
		Optional<ServicingType> type = serviceType.findByType(typeName);
		if(type.isPresent())
			return new ResponseEntity<>(type, HttpStatus.OK);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

	
	
		
}
*/
