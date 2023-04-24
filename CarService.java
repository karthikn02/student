package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.CarDesign;
import com.example.demo.Repository.CarRepo;

@Service
public class CarService {
	@Autowired
	CarRepo repository;
	
	public String addCustomer(CarDesign customer)
	{
		repository.save(customer);
		return "Added";
	}
	public List<CarDesign> getCustomer()
	{
		return repository.findAll();
	}
	public Optional<CarDesign> getCustomerById(int no)
	{
		return repository.findById(no);
	}
	public String updateCustomer(CarDesign customer)
	{
		repository.save(customer);
		return "Updated";
	}
	public void deleteByRequestParam(int no)
	{
		repository.deleteById(no);
	}
}


