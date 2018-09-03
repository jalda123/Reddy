package com.Automation.Facebook.FrequentlyAskedqutions;

public class DuplicatesElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] strArray = {"java","Lahari","Sateesh","Lahari","jsp","java"};
		
		for(int i=0;i<strArray.length-1;i++) {
			
			for(int j=i+1;j<strArray.length;j++) {
				
				if(strArray[i].equals(strArray[j])&&(i!=j)) {
					
					System.out.println("Duplicate Element is "+strArray[j]);
				}
			}
		}

	}

}
