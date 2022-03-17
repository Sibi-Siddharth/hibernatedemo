package com.sibi.app;

import java.util.List;

import com.sibi.dao.CustomerDao;
import com.sibi.entity1.Customer;

public class app2 {

	public static void main(String[] args) {
		 //Customer c=new Customer();
	        /*c.setName("Sivakumar");
	        c.setEmail("siva7859");		
	        c.setlocation("Tamilnadu");
	        CustomerDao dao= new CustomerDao();
	        dao.add(c);*/ //adding values
		 CustomerDao dao= new CustomerDao();
	       //c = dao.fetch(5);
	       //System.out.println(c.getName() +" , "+c.getEmail() +" , "+c.getlocation() +" , ");
		   //to get entire table or specific entity
            //List<Customer> list=dao.fetchbycond("Karnataka");
		    //List<Customer> list=dao.fetchAll(c);
            //for(Customer c:list) 
            	//System.out.println(c.getName() +" , "+c.getEmail() +" , "+c.getlocation() +" , ");
		 //update query
		 Customer c = dao.fetch(1);
		 c.setlocation("Karur");
		 dao.updateData(c);
		 System.out.println(c.getName() +" , "+c.getEmail() +" , "+c.getlocation() +" , ");
	       // TODO Auto-generated method stub

	}

}
