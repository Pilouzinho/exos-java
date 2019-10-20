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
		System.out.println("La moto matricule " + this.matriculeMoto + " a d�mmarr�");
	}
	
	@Override
	public void arreterVehicule() {
		System.out.println("La moto matricule " + this.matriculeMoto + " s'est arr�t�");
	}
	
	@Override
	public void afficher() {
		System.out.println("La moto matricule " + this.matriculeMoto + ", mod�le : " + this.modele + ", de " + this.annee + ", de couleur "+ this.couleur + " vaut " + this.prix +"�");
	}

}
