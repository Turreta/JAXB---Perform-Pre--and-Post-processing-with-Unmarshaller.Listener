package com.turreta.jaxb.unmarshaller.listener;

import javax.xml.bind.Unmarshaller.Listener;
public class PersonUnmarshallListener extends Listener {
	
	/**
	 * Access the created object after its fields have been set to 
	 * some values 
	 * 
	 * @param target
	 * @param parent
	 */
	@Override
	public void afterUnmarshal(Object target, Object parent) {
		super.afterUnmarshal(target, parent);
		System.out.println("AFTER UNMARSHAL");
		if(target instanceof Person) {
			Person p = (Person) target;
			p.getSomeList().add(p.getName());
		}
	}
	
	/**
	 * Access the created initial object 
	 *  
	 * @param target
	 * @param parent
	 */
	@Override
	public void beforeUnmarshal(Object target, Object parent) {
		super.beforeUnmarshal(target, parent);
		System.out.println("BEFORE UNMARSHAL");
		if(target instanceof Person) {
			Person p = (Person) target;
			System.out.println(p);
		}
	}
}
