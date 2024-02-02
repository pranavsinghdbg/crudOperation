package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.project.entities.customer;
import com.project.exception.resourceNotFound;
import com.project.repoI.customerRepo;
import com.project.serviceI.customerService;

public class customerServiceImpe implements customerService{

	@Autowired
	private customerRepo customerRepo;
	
	@Override
	public void createCustomer(customer customer) {
		// TODO Auto-generated method stub
		customerRepo.save(customer);
	}

	@Override
	public void updateCustomer(Integer id, customer customer) {
		// TODO Auto-generated method stub
		customer existingCustomer = this.customerRepo.findById(id).orElseThrow(()->new resourceNotFound("customer", "customerId", id));
		
	}

	@Override
	public List<customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public customer getSingleCustomer(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCustomer(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
