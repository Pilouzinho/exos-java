package fr.exos.principal.exo16;

public class Moto extends Vehicule {
	private static int qtiteMoto;

	public Moto(String modele, int annee, double prix, String couleur) {
		super(modele, annee, prix, couleur);
		qtiteMoto++;
	}

	public Moto() {
		super();
		qtiteMoto++;
	}

	public static int getQtiteMoto() {
		return qtiteMoto;
	}
}
