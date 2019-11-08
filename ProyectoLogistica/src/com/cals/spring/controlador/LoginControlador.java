package com.cals.spring.controlador;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cals.spring.dao.UsuarioDAO;
import com.cals.spring.modelo.Login;
import com.cals.spring.modelo.Usuario;

@Controller
public class LoginControlador {

	//https://dzone.com/articles/spring-mvc-example-for-user-registration-and-login-1
		
	/*
	@Autowired
	private UsuarioDAO usuarioDAO;
	
	  @RequestMapping(value = "/loginProcess", method = RequestMethod.POST)
	  public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response,
	  @ModelAttribute("login") Login login) {
	    ModelAndView mav = null;
	    Usuario user = usuarioDAO.validateUser(login);
	    if (null != user) {
	    mav = new ModelAndView("welcome");
	    mav.addObject("firstname", user.getNombre());
	    } else {
	    mav = new ModelAndView("login");
	    mav.addObject("message", "Username or Password is wrong!!");
	    }
	    return mav;
	  }
	*/
	
}


