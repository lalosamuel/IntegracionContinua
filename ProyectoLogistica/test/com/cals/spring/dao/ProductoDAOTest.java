package com.cals.spring.dao;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.cals.spring.modelo.Producto;



class ProductoDAOTest {

	private DriverManagerDataSource dataSource;
	private ProductoDAO dao;
	
	@BeforeEach
	void setupBeforeEach()
	{
		dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/integracion");
		dataSource.setUsername("root");
		dataSource.setPassword("123456");
		dao=new ProductoDAOImpl(dataSource);
	}
		
	
	
	
	
	@Test
	void testGuardar() {
	
		Producto producto=new Producto("Producto Unitario","Descripcion Unitaria","Categoria","1");
		int resultado = dao.guardar(producto);
		assertTrue(resultado>0);
	}
	
	

	
	@Test
	void testEditar() {
		
		Producto producto=new Producto(74,"Producto Modificado","Descripcion Modificado","Categoria Modificado","2");
		int resultado = dao.editar(producto);
		assertTrue(resultado>0);
		
	}
	
	

	@Test
	void testObtener() {
		
		Integer id=28;
		Producto producto =dao.obtener(id);
		if(producto!=null)
		{
			System.out.print(producto);
		}
		assertNotNull(producto);
	}
	
	

	@Test
	void testBorrar() {
		
		Integer id=73;
		int result=dao.borrar(id);
		
		assertTrue(result>0);
	}

	
	
	
	@Test
	void testLista() {
		
		List<Producto> listProductos=dao.listado();
		
		for(Producto aProducto:listProductos)
		{
			
			System.out.print(aProducto);
		}
		
		assertTrue(!listProductos.isEmpty());
	
	}
	

}
