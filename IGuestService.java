package service;

import java.util.Set;

import Entity.Customer;

public interface IGuestService {
	Customer findById(int id);
	Set<Customer> allCustomers();
	void addCustomer(Entity.Customer c);

}

