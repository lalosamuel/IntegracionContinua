package com.cals.spring.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//https://www.youtube.com/watch?v=lnXpzOl19EY&list=PLWkxwEHYPPt1PU5TSvdvhMaGVcytMkjHW&index=5

public class PaginaCrearProducto extends Base {

	By registrarProductoLocator = By.id("btnNuevo");
	By guardarProductoLocator = By.name("btnGrabar");
	
	
	
	
	By txtNombre = By.id("nombre");
	By txtDescripcion = By.id("descripcion");
	By txtCategoria = By.id("categoria");
	By txtEstado = By.id("estado");
	
	//By mensajeGraba = By.id("respuesta");
	
	
	
	//Datos del Producto
	
	public PaginaCrearProducto(WebDriver driver)
	{
		super(driver);
	}
	
	public void registrarProducto() throws InterruptedException
	{
		click(registrarProductoLocator);
		Thread.sleep(2000);
		
		/*if(isDisplayed(registrarProductoLocator))
		{*/
			type("Arroz", txtNombre);
			type("Arroz costeño de 100 kilos", txtDescripcion);
			type("Abarrotes", txtCategoria);
			type("1", txtEstado);
			
			click(guardarProductoLocator);
			//mensajeGraba;
			
		/*}else
		{
			System.out.print("");
			
		}*/
		
	}
	
	public String registrarMensaje()
	{
		//List<WebElement> respuesta = findElements(mensajeGraba);
		//return getText(respuesta.get(1));
		return "1";
		
		
	}
}
