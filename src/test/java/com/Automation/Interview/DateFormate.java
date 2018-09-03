package com.Automation.Interview;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.Test;

public class DateFormate {
	
	@Test
	
	public void datedemo() {
		
		String datename = new SimpleDateFormat("yyyymmddhhmmss").format(new Date());
		
		System.out.println(datename);
	}

}
