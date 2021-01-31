package com.project.services;

import java.util.List;

import com.project.entities.Usuario;

public interface IUsuarioServices {
	
	public List<Usuario> findAll();
	public Usuario create(Usuario usuario);
	
}
