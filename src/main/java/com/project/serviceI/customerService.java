package com.project.serviceI;

import java.util.List;

import com.project.entities.customer;



public interface customerService {
	
	public void createCustomer(customer customer);
	
	public void updateCustomer(Integer id, customer customer);
	
	public List<customer> getAllCustomer();
	
	public customer getSingleCustomer(Integer id);
	
	public void deleteCustomer(Integer id);
}
