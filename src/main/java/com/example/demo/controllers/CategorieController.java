package com.example.demo.controllers;

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

import com.example.demo.models.Categorie;
import com.example.demo.services.GenericService;

@RestController
@RequestMapping("categories")
public class CategorieController {

	@Autowired
	private GenericService<Categorie> categorieService;
	
	@GetMapping()
	public List<Categorie> getAll() {
		return this.categorieService.getAll();
	}
	
	@PostMapping()
	public Categorie create(@RequestBody Categorie categorie) {
		return this.categorieService.create(categorie);
	}
	
	@GetMapping("{id}")
	public Categorie getById(@PathVariable Long id) {
		return this.categorieService.getById(id);
	}
	
	@PutMapping()
	public Categorie update(@RequestBody Categorie categorie) {
		return this.categorieService.update(categorie);
	}

	@DeleteMapping()
	public void delete(@RequestBody Categorie categorie) {
		this.categorieService.delete(categorie);
	}
}
