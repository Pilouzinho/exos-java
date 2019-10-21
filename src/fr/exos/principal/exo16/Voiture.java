package fr.exos.principal.exo16;

public class Voiture extends Vehicule {
	private static int qtiteVoit;
	
	public Voiture(String modele, int annee, double prix, String couleur) {
		super(modele, annee, prix, couleur);
		qtiteVoit++;
	}

	public Voiture() {
		super();
		qtiteVoit++;
	}
	
	public static int getQtiteVoit() {
		return qtiteVoit;
	}

}
