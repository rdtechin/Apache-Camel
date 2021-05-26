package com.rdtech.in.bean;

public class restcontrollerbean1 {

	private String name;
	private String email ;
	private String city ;
	
	public restcontrollerbean1() {
		
	}
	
	public restcontrollerbean1(String name, String email, String city) {
		super();
		this.name = name;
		this.email = email;
		this.city = city;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getemail() {
		return email;
	}
	public void setemail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	@Override
	public String toString() {
		return "restcontrollerbean1 [name=" + name + ", email=" + email + ", city=" + city + "]";
	}
}
