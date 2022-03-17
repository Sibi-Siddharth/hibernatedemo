package com.lti.test;

import java.time.LocalDate;
import java.util.List;

import org.junit.Test;

import com.sibi.dao.GenericDao;
import com.sibi.user.Order;
import com.sibi.user.Product;
import com.sibi.user.User;

public class UserProdOrdTest {
	/*@Test
	public void addProd() {
		GenericDao dao=new GenericDao();
		Product p=new Product();
		p.setName("Iphone 13");
		p.setPrice(70000);
		Product p2=new Product();
		p2.setName("Nokia 6");
		p2.setPrice(15000);
		Product p3=new Product();
		p3.setName("Samsung s22");
		p3.setPrice(60000);
		Product p4=new Product();
		p4.setName("Oneplus 9R");
		p4.setPrice(50000);
		dao.oper(p);
		dao.oper(p2);
		dao.oper(p3);
		dao.oper(p4);
	}
	@Test
	public void addUser() {
		GenericDao dao=new GenericDao();
		User u=new User();
		u.setName("Sibi");
		u.setEmail("sibi7859");
		User u2=new User();
		u2.setName("Siva");
		u2.setEmail("siva7859");
		User u3=new User();
		u3.setName("Santhosh");
		u3.setEmail("santhosh7859");
		User u4=new User();
		u4.setName("Sakthi");
		u4.setEmail("sakthi7859");
		dao.oper(u);
		dao.oper(u2);
		dao.oper(u3);
		dao.oper(u4);
	}
	@Test
 public void placingorder() {
	 GenericDao dao= new GenericDao();
	 User u=(User) dao.fetchById(User.class, 56);
	 Product p=(Product) dao.fetchById(Product.class, 49);
	 Order o=new Order();
	 o.setAmount(p.getPrice()-p.getPrice() * 0.5);
	 o.setOrderDate(LocalDate.now());
	 o.setProduct(p);
	 o.setUser(u);
	 dao.oper(o);
 }*/
	/*@Test
	public void fetchorder() {
		GenericDao dao= new GenericDao();
		List<Order> o=dao.fetchorder();
		for(Order order : o)
			System.out.println(order.getId()+" , "+order.getAmount()+" , "+order.getOrderDate());
	}
	@Test
	public void fetchprod() {
		GenericDao dao= new GenericDao();
		List<Product> p=dao.fetchprod();
		for(Product prod : p)
			System.out.println(prod.getName()+" , "+prod.getPrice());
	}
	@Test
	public void fetchuser() {
		GenericDao dao= new GenericDao();
		List<User> u=dao.fetchuser();
		for(User user : u)
			System.out.println(user.getName()+" , "+user.getEmail());
	}*/
	@Test
	public void fetchUser() {
		GenericDao dao= new GenericDao();
		List<User> u=dao.fetchUsername("Sibi");
		for(User user : u)
			System.out.println(user.getName()+" , "+user.getEmail());
	}
	@Test
	public void fetchprod() {
		GenericDao dao= new GenericDao();
		List<Product> p=dao.fetchprice(20000,80000);
		for(Product prod : p)
			System.out.println(prod.getName()+" , "+prod.getPrice());
	}
}
