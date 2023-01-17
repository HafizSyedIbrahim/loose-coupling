package com.coupling.java;

public class Coupling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			
			Show s = new B();
			s.display();
			
			Show s1 = new C();
			s1.display();
			
			A a = new A(s1);
			a.display();		
	}

}
