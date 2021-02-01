package com.project.controller;

import java.util.List; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody; 
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController; 
import com.project.entities.Dependencia;
import com.project.services.IDependenciaServices; 

@RestController 
@RequestMapping("/api/dependencia") 
public class DependenciaRestController { 
	
	@Autowired 
	private IDependenciaServices dependenciaService; 
	
	@GetMapping("") 
	public List<Dependencia> index(){ 
		return dependenciaService.findAll(); 
	} 
	@PostMapping("") 
	public Dependencia create(@RequestBody Dependencia dependencia){ 
		return dependenciaService.create(dependencia); 
	} 
	@PutMapping("") 
	public Dependencia update(@RequestBody Dependencia dependencia){ 
		return dependenciaService.update(dependencia); 
	} 
	@DeleteMapping("/dependencia/{id}") 
	public void delete(@PathVariable("id") Integer id){ 
		dependenciaService.delete(id); 
	} 
} 
