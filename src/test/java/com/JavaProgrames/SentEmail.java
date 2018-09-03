package com.JavaProgrames;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import org.testng.annotations.Test;

public class SentEmail {
	
	@Test
	
	public void sentmail() throws EmailException { 
		
		Email email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("sateesh.jalda12@gmail.com", "jalda12345"));
		email.setSSLOnConnect(true);
		email.setFrom("jalda@gmail.com");
		email.setSubject("Selenium Test Report");
		email.setMsg("This is a test mail ... :-)");
		email.addTo("sateesh.jalda12@gmail.com");
		email.send();
	}

}
