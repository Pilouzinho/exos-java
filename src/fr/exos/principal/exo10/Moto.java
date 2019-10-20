package fr.exos.principal.exo10;

public class Moto extends Voiture {
	private static int matriculeMotos;
	private int matriculeMoto;
	
	//constructeur
	public Moto(String modele, int annee, double prix, String couleur) {
		super(modele, annee, prix, couleur);
		matriculeMotos++;
		this.matriculeMoto = matriculeMotos;
		
	}

	
	//accesseurs
	public static int getMatriculeMotos() {
		return matriculeMotos;
	}

	public int getMatriculeMoto() {
		return matriculeMoto;
	}

	
	
	@Override
	public void demmarerVehicule() {
		System.out.println("La moto matricule " + this.matriculeMoto + " a démmarré");
	}
	
	@Override
	public void arreterVehicule() {
		System.out.println("La moto matricule " + this.matriculeMoto + " s'est arrêté");
	}
	
	@Override
	public void afficher() {
		System.out.println("La moto matricule " + this.matriculeMoto + ", modèle : " + this.modele + ", de " + this.annee + ", de couleur "+ this.couleur + " vaut " + this.prix +"€");
	}

}
