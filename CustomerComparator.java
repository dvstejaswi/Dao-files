package Comparator;
import java.util.*;

import Entity.Customer;
public class CustomerComparator implements Comparator<Customer> {
	public int compare(Customer c1 , Customer c2) {
		//	boolean equals=s1.getId().equals(s2.getId());
			if(c1.getId()> c2.getId())
			return 1;
			if(c2.getId()<c1.getId())
			return -1;
			else 
			return 0;
}
}
