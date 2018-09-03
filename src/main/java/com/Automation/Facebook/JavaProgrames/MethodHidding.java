package com.Automation.Facebook.JavaProgrames;

public class MethodHidding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Parent");

	}

}

class B extends MethodHidding{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("child");

}
}