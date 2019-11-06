package com.cals.spring.dao;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


public class ProductoUITest {

	private WebDriver driver;
	
	@Before
	public void setUp()
	{
		

		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		
		/*DesiredCapabilities caps=new DesiredCapabilities();
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
		*/
		
	}
	
	@Test
	public void testVentana()
	{
		//driver.findElement(By.name("")).sendKeys("");
		//driver.findElement(By.name("")).sendKeys("");
		
		/*driver.findElement(By.name("btnNuevo")).click();
		
		try
		{
			Thread.sleep(5000);
			
		}catch (InterruptedException e) {

			e.printStackTrace();
			
		}
		
		Assert.assertTrue(driver.findElement(By.xpath("/html/body/div/div[1]/section[1]/h1")).getText().contains("Dashboard"));
		*/
		
		WebElement buscar=driver.findElement(By.name("btnNuevo"));
		//buscar.clear();
		//buscar.sendKeys("quality-stream Introduccion a la Automatización de Pruebas de Software");
		buscar.submit();
		
		try
		{
			Thread.sleep(5000);
			
		}catch (InterruptedException e) {

			e.printStackTrace();
			
		}
		
		Assert.assertTrue(driver.findElement(By.xpath("/html/body/div/div[1]/section[1]/h1")).getText().contains("Dashboard"));
		
		
	}
	
	
	
	@After
	public void tearDown()
	{
		driver.close();
	}

}
