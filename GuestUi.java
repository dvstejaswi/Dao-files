package Ui;
import java.util.*;
import Comparator.CustomerComparator;
import Entity.Customer;
import dao.GuestDaoImpl;
import service.GuestServiceImpl;
import service.IGuestService;
public class GuestUi {
	private IGuestService service = new GuestServiceImpl(new GuestDaoImpl()); 

	public static void main(String[] args) {
		GuestUi ui=new GuestUi();
		ui.runUi();
		}
	
	
	public void runUi() {
		try { Customer c1= new Customer(3, "anil");
		 Customer c2= new Customer(1, "vinu");
		 Customer c3= new Customer(2, "minu");
	/*	 Comparator<Customer>comparator=new CustomerComparator();
			Set <Customer>set=new TreeSet<Customer>(comparator);
			
           set.add(c1);
           set.add(c2);
           set.add(c3);
          // setGuestUi ex1=new setGuestUi();
       print(set);
      // 	System.out.println(set);*/

		 
		 service.addCustomer(c1);
		 service.addCustomer(c2);
		 Customer fetched1 = service.findById(1);
		 Customer fetched2 = service.findById(2);
		  System.out.println(fetched1.getName());
           System.out.println(fetched2.getName());
           System.out.println("********printing all customers****");
           Set<Customer> customers = service.allCustomers();
           print(customers);
       }catch (Throwable e){
           e.printStackTrace();
           System.out.println("something went wrong");
       }
   }

   private void print(Set<Customer> customers) {
		// TODO Auto-generated method stub
	   for(Customer c: customers) {
		   System.out.println(c.getName() );		   
	   }
		
	}


/*void print(Collections<Customer>collection){
       for (Customer c:customers){
           System.out.println(c.getName() );
       }
   }*/

	 


			
		
	}
