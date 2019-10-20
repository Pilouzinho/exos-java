package fr.exos.principal.exo10;

public class Voiture {
	private static int matricule;
	private int matriculeVoiture;
	protected String modele;
	protected int annee;
	protected double prix;
	protected String couleur;
	
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

	
	
	//méthodes
	public void afficherCouleur() {
		System.out.println(this.couleur);
	}
	
	public void demmarerVehicule() {
		System.out.println("La voiture matricule " + this.matriculeVoiture + " a démmarré");
	}
	
	public void arreterVehicule() {
		System.out.println("La voiture matricule " + this.matriculeVoiture + " s'est arrêté");
	}
	
	public void afficher() {
		System.out.println("La voiture matricule " + this.matriculeVoiture + ", modèle : " + this.modele + ", de " + this.annee + ", de couleur "+ this.couleur + " vaut " + this.prix +"€");
	}

}
