package com.Automation.Facebook.JavaProgrames;

public class RepetedStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

String str ="This is saikumar i am from bangalore and sai from mumbai";
		
		String[] arr = str.split(" ");
		
		for(int i=0;i<arr.length;i++){
			
			int count= 0;
			
			for(int j=1;j<arr.length;j++){
				
				if(arr[i].equalsIgnoreCase(arr[j])){
					count = count + 1;
				}
			}
			
			System.out.println(arr[i]+" : "+count);
		}
		
	}

}
