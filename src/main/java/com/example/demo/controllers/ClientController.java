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

import com.example.demo.models.Client;
import com.example.demo.services.GenericService;

@RestController
@RequestMapping("clients")
public class ClientController {

	@Autowired
	private GenericService<Client> clientService;
	
	@GetMapping()
	public List<Client> getAll() {
		return this.clientService.getAll();
	}
	
	@PostMapping()
	public Client create(@RequestBody Client client) {
		return this.clientService.create(client);
	}
	
	@GetMapping("{id}")
	public Client getById(@PathVariable Long id) {
		return this.clientService.getById(id);
	}
	
	@PutMapping()
	public Client update(@RequestBody Client client) {
		return this.clientService.update(client);
	}

	@DeleteMapping()
	public void delete(@RequestBody Client client) {
		this.clientService.delete(client);
	}
}
