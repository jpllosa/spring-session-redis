package com.blogspot.jpllosa.model;

import java.io.Serializable;

public class UserData implements Serializable {

	private static final long serialVersionUID = 6185512936169998034L;
	private String name;
	private Integer age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	

}
