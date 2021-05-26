package com.rdtech.in.bean;

public class responsebean1 {
	

	private String name;
	private String email ;
	private String city ;
	private int generatedKey;
	
public responsebean1() {
		
	}

	public responsebean1(String name, String email, String city, int generatedKey) {
		super();
		this.name = name;
		this.email = email;
		this.city = city;
		this.generatedKey = generatedKey;
	}
	
public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getGeneratedKey() {
		return generatedKey;
	}



@Override
	public String toString() {
	this.generatedKey = (int)(Math.random()*100000);
		return "responsebean1 [name=" + name + ", email=" + email + ", city=" + city + ", generatedKey=" + generatedKey
				+ "]";
	}

}
