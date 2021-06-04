package com.example.demo.models;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class Commande {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="client_id", referencedColumnName = "id")
	private Client client;
	
	@ManyToMany
	@JoinTable(
			name= "commande_has_produit",
			joinColumns = @JoinColumn(name="commande_id", referencedColumnName = "id"), 
			inverseJoinColumns = @JoinColumn(name="produit_id", referencedColumnName = "id")
			)
	private Collection<Produit> produits;
	
}
