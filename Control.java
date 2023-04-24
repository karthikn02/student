package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.CarDesign;
import com.example.demo.Service.CarService;



@RestController
@RequestMapping("/cus")
public class Control {
	@Autowired
	CarService service ;
	
	@PostMapping("")
	public String create(@RequestBody CarDesign customer)
	{
		return service.addCustomer(customer);
	}
	@GetMapping("")

		public List<CarDesign> read()
		{
			return service.getCustomer();
		}
	@GetMapping("/{id}")
	public  Optional<CarDesign>readById(@PathVariable int no)
	{
		return service.getCustomerById(no);
	}
	@PutMapping("/put")
	public String update(@RequestBody CarDesign customer)
	{
		return service.updateCustomer(customer);
	}
	@DeleteMapping("/delete")
	public String delete(@RequestParam("cid") int no)
	{

		service.deleteByRequestParam(no);
		return "deleted";
	}
	}

