package com.cals.spring.dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Pruebas {

	private WebDriver driver;
	
	public void setUp()
	{
		
		DesiredCapabilities caps=new DesiredCapabilities();
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://localhost:8080/ProyectoLogistica/");
		try
		{
			Thread.sleep(5000);
			
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
	}
	
	public void pruebaUno()
	{
		driver.findElement(By.name("")).sendKeys("");
		driver.findElement(By.name("")).sendKeys("");
		driver.findElement(By.name("nuevo")).click();
		try
		{
			Thread.sleep(5000);
			
		}catch (InterruptedException e) {

			e.printStackTrace();
			
		}
		
		Assert.assertTrue(driver.findElement(By.xpath("")).getText().contains(""));
		
	}
	
	
	@Test
	void test() {
		fail("Not yet implemented");
	}

	
	//@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
	
	
}
