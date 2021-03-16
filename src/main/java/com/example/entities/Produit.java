package com.example.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Produit implements Serializable {

@Id 
private long reference;
private String designation;
private double prix;
private int quantite;

public long getReference() {
	return reference;
}
public void setReference(long reference) {
	this.reference = reference;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public double getPrix() {
	return prix;
}
public void setPrix(double prix) {
	this.prix = prix;
}
public int getQuantite() {
	return quantite;
}
public void setQuantite(int quantite) {
	this.quantite = quantite;
}
public Produit() {
	super();
	// TODO Auto-generated constructor stub
}
public Produit(long reference, String designation, double prix, int quantite) {
	super();
	this.reference = reference;
	this.designation = designation;
	this.prix = prix;
	this.quantite = quantite;
}

}
