package service;

import java.util.Set;

import Entity.Customer;
import dao.IGuestDao;
import exceptions.IncorrectIdException;

public class GuestServiceImpl implements IGuestService{
	private IGuestDao dao;
	
	public GuestServiceImpl(IGuestDao dao) {
		this.dao=dao;
	}
	
	  @Override
	    public void addCustomer(Customer c) {
	        dao.addCustomer(c);
	    }

	    @Override
	    public Customer findById(int id) {
	        if (id < 0) {
	            throw new IncorrectIdException("id is incorrect");
	        }
	        Customer c = dao.findById(id);
	        return c;
	    }

	    @Override
	    public Set<Customer> allCustomers() {
	        Set<Customer> employees = dao.allCustomers();
	        return employees;
	    }

	

}
