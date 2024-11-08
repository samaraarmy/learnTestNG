package com.sam.grouping;


import org.testng.annotations.Test;
@Test(groups = {"all"} )

public class Test1 {

	@Test(groups = {"Regression"} )
    public void TC1() {
    	System.out.println("TC1");
    }
	@Test(groups = {"Regression","smoke","windows.Regression"})
    public void TC2() {
		System.out.println("TC2");
    }
	@Test(groups = {"functional","smoke","windows.smoke"})
    public void TC3() {
		System.out.println("TC3");
    }
}
