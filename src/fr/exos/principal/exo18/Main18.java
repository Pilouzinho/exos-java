package fr.exos.principal.exo18;

public class Main18 {

	public static void main(String[] args) {
		Terrain terrain1 = new Terrain();
		terrain1.ajouterForme(new Rectangle(28,17));
		terrain1.ajouterForme(new Rectangle(12,10));
		terrain1.ajouterForme(new Rectangle(41, 7));
		
		System.out.println(terrain1);
		
		terrain1.ajouterForme(new Cercle(27));
		terrain1.ajouterForme(new Triangle(14,5));
		
		System.out.println(terrain1);

		System.out.println(terrain1.getSurfaceTotale());
	}

}
