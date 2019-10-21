package fr.exos.principal.exo9;

public class Voiture {
	private static int matricule;
	private int matriculeVoiture;
	private String modele;
	private int annee;
	private double prix;
	private String couleur;
	
	//constructeur(s)
	public Voiture(String modele, int annee, double prix, String couleur) {
		super();
		matricule++;
		this.matriculeVoiture = matricule;
		this.modele = modele;
		this.annee = annee;
		this.prix = prix;
		this.couleur = couleur;
	}
	
	//accesseurs
	public int getMatricule() {
		return matricule;
	}

	public int getMatriculeVoiture() {
		return matriculeVoiture;
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

	
	
	//m�thodes
	public void afficherCouleur() {
		System.out.println(this.couleur);
	}
	
	public void demmarerVehicule() {
		System.out.println("Le v�hicule matricule " + this.matriculeVoiture + " a d�mmarr�");
	}
	
	public void arreterVehicule() {
		System.out.println("Le v�hicule matricule " + this.matriculeVoiture + " s'est arr�t�");
	}
	
	public void afficher() {
		System.out.println("Le vh�icule matricule " + this.matriculeVoiture + ", mod�le : " + this.modele + ", de " + this.annee + ", de couleur "+ this.couleur + " vaut " + this.prix +"�");
	}

}
