package com.cals.spring.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class PaginaModificarProducto extends Base {


	By modificarProductoLocator = By.xpath("//*[@id=\"tablaProducto\"]/tbody/tr/td[6]/a[1]");
	
	
	By guardarProductoLocator = By.name("btnGrabar");
	
	
	
	By txtNombre = By.id("nombre");
	By txtDescripcion = By.id("descripcion");
	By txtCategoria = By.id("categoria");
	By txtEstado = By.id("estado");
	
		
	public PaginaModificarProducto(WebDriver driver)
	{
		super(driver);
	}
	
	public void modificarProducto() throws InterruptedException
	{
		click(modificarProductoLocator);
		Thread.sleep(2000);
	
			type("Arroz MODIFICADO", txtNombre);
			type("Arroz costeño de 100 kilos MODIFICADO", txtDescripcion);
			type("Abarrotes MODIFICADO", txtCategoria);
			type("1", txtEstado);
			
			click(guardarProductoLocator);
	
		
	}
	
	public String modificarMensaje()
	{

		return "1";
		
		
	}
}
