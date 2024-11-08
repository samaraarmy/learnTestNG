package com.sam.test;

import static org.testng.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Secondtest {
	SoftAssert Assert=new SoftAssert();
	@Test
	public void test1() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		String expectedtitle="Facebook ? log in or sign up";
		String actualtitle=driver.getTitle();
		Assert.assertEquals(actualtitle, expectedtitle,"Title is mismatch");
		
		driver.quit();
	}

	@Test
	public void test2() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mvnrepository.com/");
		System.out.println(driver.getTitle());
		String expectedtitle="Maven Repository: Search/Browse/Explore";
		String actualtitle=driver.getTitle();
		assertEquals(actualtitle, expectedtitle,"Title is mismatch");
		
		Thread.sleep(5000);
		driver.quit();
}
}

//parallel="tests" thread-count="2"
