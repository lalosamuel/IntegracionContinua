package com.cals.spring.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.cals.spring.dao.ProductoDAO;
import com.cals.spring.dao.ProductoDAOImpl;


@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.cals.spring")
public class SpringMvcConfig implements WebMvcConfigurer {

	
	@Bean
	public ViewResolver getViewResolver(){
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		//resolver.setPrefix("/WEB-INF/vistas/");//no se usa
		
		
		//resolver.setPrefix("/admin/dashboard/");
		resolver.setPrefix("/admin/dashboard/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	}
	
	@Bean
	public DataSource getDataSource()
	{
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/integracion?useSSL=false");
		dataSource.setUsername("root");
		dataSource.setPassword("123456");

		return dataSource;
		
	}
	
	@Bean
	public ProductoDAO getContactDAO() {
		return new ProductoDAOImpl(getDataSource());
	}
	
}
