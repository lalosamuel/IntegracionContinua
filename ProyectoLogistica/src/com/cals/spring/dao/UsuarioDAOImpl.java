package com.cals.spring.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.cals.spring.modelo.Login;
import com.cals.spring.modelo.Usuario;

public class UsuarioDAOImpl {

private JdbcTemplate jdbcTemplate;
	



	public UsuarioDAOImpl(DataSource dataSource) {

		
		this.jdbcTemplate =new JdbcTemplate(dataSource);
	}
	
	public Usuario validateUser(Login login) {
	    String sql = "select * from usuario where usuario='" + login.getUsuario() + "' and password='" + login.getPassword()
	    + "'";
	    List<Usuario> users = jdbcTemplate.query(sql, new UserMapper());
	    return users.size() > 0 ? users.get(0) : null;
	    }
		
}

class UserMapper implements RowMapper<Usuario> {
	
	public Usuario mapRow(ResultSet rs, int arg1) throws SQLException {
		Usuario user = new Usuario();
	    user.setUsuario(rs.getString("username"));
	    user.setPassword(rs.getString("password"));
	    return user;
	  }
}
