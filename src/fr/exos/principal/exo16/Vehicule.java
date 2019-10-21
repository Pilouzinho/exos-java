package fr.exos.principal.exo16;

import java.util.Scanner;

public abstract class Vehicule {
	private static int qtite;
	private int id;
	protected String modele;
	protected int annee;
	protected double prix;
	protected String couleur;
	
	//constructeur(s)
	public Vehicule(String modele, int annee, double prix, String couleur) {
		super();
		qtite++;
		this.id = qtite;
		this.modele = modele;
		this.annee = annee;
		this.prix = prix;
		this.couleur = couleur;
	}
	
	public Vehicule() {
		qtite++;
		this.id = qtite;
		Scanner scStr = new Scanner(System.in);
		Scanner scInt = new Scanner(System.in);
		System.out.println("CRÉATION DE :  " + this.getClass().getSimpleName().toUpperCase());
		System.out.println("Entrer le modele :");
		this.modele = scStr.nextLine();
		System.out.println("Entrer l'année :");
		this.annee = scInt.nextInt();
		System.out.println("Entrer le prix :");
		this.prix = scInt.nextInt();
		System.out.println("Entrer la couleur :");
		this.couleur = scStr.nextLine();	
}
	
	//accesseurs
	public static int getQtite() {
		return qtite;
	}
	public int getIdVehicule() {
		return id;
	}

	public String getModele() {
		return modele;
	}
	public void setModele(String modele) {
		this.modele = modele;
	}
	public int getAnnee() {
		return annee;
	}
	public void setAnnee(int annee) {
		this.annee = annee;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	
	
	//méthodes
	public void afficherCouleur() {
		System.out.println(this.couleur);
	}
	
	public void demmarerVehicule() {
		System.out.println("La voiture id " + this.id + " a démmarré");
	}
	
	public void arreterVehicule() {
		System.out.println("La voiture id " + this.id + " s'est arrêté");
	}
	
	public void afficher() {
		System.out.println("La voiture id " + this.id + ", modèle : " + this.modele + ", de " + this.annee + ", de couleur "+ this.couleur + " vaut " + this.prix +"€");
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Vehicule type " + this.getClass().getSimpleName() + " [idVehicule=");
		builder.append(id);
		builder.append(", modele=");
		builder.append(modele);
		builder.append(", annee=");
		builder.append(annee);
		builder.append(", prix=");
		builder.append(prix);
		builder.append(", couleur=");
		builder.append(couleur);
		builder.append("]");
		return builder.toString();
	}
	
	

}
