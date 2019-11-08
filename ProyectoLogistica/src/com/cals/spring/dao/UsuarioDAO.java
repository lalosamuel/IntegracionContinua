package com.cals.spring.dao;

import com.cals.spring.modelo.Login;
import com.cals.spring.modelo.Usuario;


public interface UsuarioDAO {

	Usuario validateUser(Login login);
		
}
