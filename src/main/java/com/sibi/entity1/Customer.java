package com.sibi.entity1;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_cust")
public class Customer {
	@Id //pk
	@GeneratedValue //autogenerate pk
	@Column (name = "cust_id")
	private int id;
	@Column (name = "cust_name")
	private String Name;
	@Column (name = "cust_email")
	private String email;
	@Column (name = "cust_location")
	private String location;

	public int getid() {
		return id;
	}

	public void setid(int id) {
		id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getlocation() {
		return location;
	}

	public void setlocation(String location) {
		this.location = location;
	}	

}
