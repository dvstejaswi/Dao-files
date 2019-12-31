package dao;

import java.util.Set;

import Entity.Customer;

public interface IGuestDao {
	Customer findById(int id);
	Set<Customer> allCustomers();
	void addCustomer(Entity.Customer c);
	Set<Customer> allGuestsInOrderById(boolean a);


}
