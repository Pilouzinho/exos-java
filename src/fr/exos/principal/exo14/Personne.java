package fr.exos.principal.exo14;

import java.util.Scanner;

public abstract class Personne {
	private String nom;
	private String prenom;
	private String adresse;
	
	public Personne(String nom, String prenom, String adresse) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}
	
	public Personne() {
			Scanner scStr = new Scanner(System.in);
			System.out.println("CRÉATION DE :  " + this.getClass().getSimpleName().toUpperCase());
			System.out.println("Entre le nom :");
			this.nom = scStr.nextLine();
			System.out.println("Entre le prenom :");
			this.prenom = scStr.nextLine();
			System.out.println("Entre l'adresse :");
			this.adresse = scStr.nextLine();
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Personne [nom=");
		builder.append(nom);
		builder.append(", prenom=");
		builder.append(prenom);
		builder.append(", adresse=");
		builder.append(adresse);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
