package com.jdc.mkt.encapsulation;

import com.jdc.mkt.encapsulation.pkgOne.Cat;
import com.jdc.mkt.encapsulation.pkgOne.Feline;

public class Main {

	public static void main(String[] args) {
		Animal a = new Animal();
		a.setName("Ryan");
		System.out.println(a.getName());
		
		Cat c = new Cat();
		c.setAge(23);
		c.setName("Snowei");
		
		Feline f = new Cat();
		f.useNails();
		
	}
	
}
