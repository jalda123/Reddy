package com.JavaProgrames;

public class ProtectedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ProtectedDemo obj = new ProtectedDemo();
		obj.m1();
	}

	protected void m1() {
		System.out.println("same pakage");
	}
}
class C extends ProtectedDemo{
	public static void main(String[] args) {
		
		
	}
	
	protected void m2() {
		System.out.println("same pakage");
	}
}