package fr.exos.principal.exo16;

public class Tracteur extends Vehicule {
	private static int qtiteTract;

	public Tracteur(String modele, int annee, double prix, String couleur) {
		super(modele, annee, prix, couleur);
		qtiteTract++;
	}

	public Tracteur() {
		super();
		qtiteTract++;
	}
	
	public static int getQtiteTract() {
		return qtiteTract;
	}

}
