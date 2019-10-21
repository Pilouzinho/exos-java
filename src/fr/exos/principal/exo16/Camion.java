package fr.exos.principal.exo16;

public class Camion extends Vehicule {
	private static int qtiteCamion;
	
	public Camion(String modele, int annee, double prix, String couleur) {
		super(modele, annee, prix, couleur);
		qtiteCamion++;
	}

	public Camion() {
		super();
		qtiteCamion++;
	}
	
	public static int getQtiteCamion() {
		return qtiteCamion;
	}

}
