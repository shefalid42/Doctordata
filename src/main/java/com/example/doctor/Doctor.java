package com.example.doctor;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="doctor_details")
public class Doctor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String salary;
	private String specialist;
	 Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Doctor(int id, String name, String salary,String specialist) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.specialist=specialist;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getsalary() {
		return salary;
	}
	public void setsalary(String salary) {
		this.salary = salary;
	}
	
	public String getspecialist() {
		return specialist;
	}
	public void setspecialist(String specialist) {
		this.specialist= specialist;
	}
	@Override
	public String toString() {
		return "Doctor [id=" + id + ", name=" + name + ", salary=" + salary + " , specialist=" + specialist+"]";
	}
	

}

