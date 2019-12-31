package dao;

import java.util.*;

import Comparator.CustomerComparator;
import Entity.Customer;
import exceptions.CustomerNotFoundException;

public class GuestDaoImpl implements IGuestDao {
	private Map<Integer, Customer> store = new HashMap<>();
	 @Override
	    public void addCustomer(Customer c) {
	        store.put(c.getId(), c);
	    }

	    @Override
	    public Customer findById(int id) {
	        Customer c = store.get(id);
	        if (c == null) {
	            throw new CustomerNotFoundException("employee not found for id=" + id);
	        }
	        return c;
	    }

	    @Override
	    public Set<Customer> allCustomers() {
	        Collection<Customer> customers = store.values();
	        Set<Customer> customerSet = new HashSet<>(customers);
	        return customerSet;
	    }
@Override
public Set<Customer>allGuestsInOrderById(boolean a){
	Collection<Customer> customers=store.values();
	Comparator<Customer> comparator=new CustomerComparator();
	Set<Customer> CustomerSet= new TreeSet<>(comparator);
	CustomerSet.addAll(customers);
	return CustomerSet;
	
}
	
}
