package com.sam.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Firsttest {
	WebDriver driver;
	SoftAssert Assert=new SoftAssert();
	@Parameters("browsername")
	@BeforeTest()
	public void browser(@Optional("edge") String browsername) {
		switch (browsername.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
		    driver=new ChromeDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
		    driver=new EdgeDriver();
			break;
		default:
			System.err.println("Browser is invalid");
			break;
		}
	
	driver.manage().window().maximize();
	}


	@Test()
	public void launchapp()  {
		
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		
	}
	@Parameters({"username","password"})
	@Test()
		public void Enterlogindetails(String username,String password) throws InterruptedException {
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys(password);
		driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
	}

	/*
	 * @Test(priority=3) public void Navigatetofriends() throws InterruptedException
	 * { Thread.sleep(5000); driver.findElement(By.xpath(
	 * "/html/body/div[1]/div/div[1]/div/div[2]/div[4]/div/div[1]/div[1]/ul/li[2]/span/div/div"
	 * )).click();
	 * 
	 * }
	 */
	@Test()
	public void Verifyname() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),'Samara Simha')]")).isDisplayed();
		
		//driver.findElement(By.xpath("//*[@id=\"mount_0_0_Ev\"]/div/div[1]/div/div[3]/div/div/div[1]/div[1]/div[2]/div/div/div[1]/div[1]/div/div/div/div/div/span/div/div[1]/h2/span/span"));
	}
	@AfterTest()
	public void closebrowser() {
		driver.quit();
	}
}
