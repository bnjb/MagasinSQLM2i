package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class Produit {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="nom")
	private String nom;
	
	@Column(name="prix")
	private int prix;
	
	@ManyToOne
	@JoinColumn(name="categorie_id", referencedColumnName = "id")
	private Categorie categorie;
	
}
