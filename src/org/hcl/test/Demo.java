package org.hcl.test;

public class Demo {
	
	public void basicInfo() {
		
		System.out.println("My naame is abc");
		System.out.println("My naame is Ganesh writing logic for login");


	}
	
	public static void main(String[] args) {
		
		Demo d = new Demo();//10 mb
		d.basicInfo();
		
		AdditionalDetails a = new AdditionalDetails();//memory allocation 20 mb
		a.addition();
		
		SomeNew s = new SomeNew(); //30mb
		s.newInfo();
	}
}
