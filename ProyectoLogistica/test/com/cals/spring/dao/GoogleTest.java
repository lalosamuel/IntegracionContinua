package com.cals.spring.dao;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {


	private WebDriver driver;
	
	@Before
	public void setUp()
	{
		

		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
	}
	
	@Test
	public void testGooglePage()
	{
		WebElement buscar=driver.findElement(By.name("q"));
		buscar.clear();
		buscar.sendKeys("quality-stream Introduccion a la Automatización de Pruebas de Software");
		buscar.submit();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		assertEquals("quality-stream Introduccion a la Automatización de Pruebas de Software", driver.getTitle());
		
		
	}
	
	@After
	public void tearDown()
	{
		driver.close();
	}

	
}
