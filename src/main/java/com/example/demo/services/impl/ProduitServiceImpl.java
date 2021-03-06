package com.example.demo.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.models.Produit;
import com.example.demo.repositories.ProduitRepository;
import com.example.demo.services.GenericService;

public class ProduitServiceImpl implements GenericService<Produit>{
	
	@Autowired
	private ProduitRepository produitRepository;
	
	@Override
	public List<Produit> getAll() {
		return this.produitRepository.findAll();
	}

	@Override
	public Produit getById(Long id) {
		return this.produitRepository.findById(id).get();
	}

	@Override
	public Produit create(Produit entity) {
		return this.produitRepository.save(entity);
	}

	@Override
	public Produit update(Produit entity) {
		return this.produitRepository.save(entity);
	}

	@Override
	public void delete(Produit entity) {
		this.produitRepository.delete(entity);
	}

}
