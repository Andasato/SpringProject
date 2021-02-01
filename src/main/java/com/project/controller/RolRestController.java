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
import com.project.entities.Rol;
import com.project.services.IRolServices; 

@RestController 
@RequestMapping("/api/rol") 
public class RolRestController { 
	@Autowired 
	private IRolServices rolService; 
	
	@GetMapping("") 
	public List<Rol> index(){ 
		return rolService.findAll(); 
	} 
	@PostMapping("") 
	public Rol create(@RequestBody Rol rol){ 
		return rolService.create(rol); 
	} 
	@PutMapping("") 
	public Rol update(@RequestBody Rol rol){ 
		return rolService.update(rol); 
	} 
	@DeleteMapping("/rol/{id}") 
	public void delete(@PathVariable("id") Integer id){ 
		rolService.delete(id); 
	} 
} 
