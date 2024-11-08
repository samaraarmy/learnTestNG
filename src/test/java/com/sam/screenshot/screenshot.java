package com.sam.screenshot;


import org.testng.annotations.Test;



import static org.testng.Assert.*;

public class screenshot extends baseclass{
	@Test(priority=1)
	public void openbrowser() {
		
		
			driver.get("https://www.cebook.com/");
			System.out.println(driver.getTitle());
			
			  String expectedtitle="Facebook ? log in or sign up";
			  String actualtitle=driver.getTitle(); assertEquals(actualtitle,
			  expectedtitle,"Title is mismatch");
			 
			
			
	}
	
}

