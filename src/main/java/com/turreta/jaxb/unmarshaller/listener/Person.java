package com.turreta.jaxb.unmarshaller.listener;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
public class Person {

	private String name;
	
	@XmlTransient
	private List<String> someList = new ArrayList<>();

	public List<String> getSomeList() {
		return someList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", someList=" + someList + "]";
	}
}
