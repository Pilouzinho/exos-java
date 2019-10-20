package fr.exos.principal.exo17;

public class TestBatiment {

	public static void main(String[] args) {
		Batiment maison = new Maison("Rue de la maison", 7);
		System.out.println(maison);
		
		Batiment immeuble = new Immeuble("Rue de l'immeuble", 12);
		System.out.println(immeuble);
	}

}
