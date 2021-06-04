package com.example.demo.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.models.Commande;
import com.example.demo.repositories.CommandeRepository;
import com.example.demo.services.GenericService;

public class CommandeServiceImpl implements GenericService<Commande>{

	@Autowired
	private CommandeRepository commandeRepository;
	
	@Override
	public List<Commande> getAll() {
		return this.commandeRepository.findAll();
	}

	@Override
	public Commande getById(Long id) {
		return this.commandeRepository.findById(id).get();
	}

	@Override
	public Commande create(Commande entity) {
		return this.commandeRepository.save(entity);
	}

	@Override
	public Commande update(Commande entity) {
		return this.commandeRepository.save(entity);
	}

	@Override
	public void delete(Commande entity) {
		this.commandeRepository.delete(entity);
	}
}
