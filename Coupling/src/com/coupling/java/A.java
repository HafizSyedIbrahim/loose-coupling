package com.coupling.java;

public class A {
	Show s; // reference of interface Show.
	
	public A(Show s) {
		this.s = s;
	}
	public void display() {
		System.out.println("Display A");
		s.display();
	}
}
