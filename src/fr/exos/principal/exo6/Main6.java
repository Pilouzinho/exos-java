package fr.exos.principal.exo6;

public class Main6 {

	public static void main(String[] args) {
		Personne perso1 = new Personne("Tiphaine", 30, 1400);
		Personne perso2 = new Personne("Pilou", 34, 1600);
		Administration admin = new Administration();
		Entreprise entre1 = new Entreprise();
		
		admin.comparer(perso1, perso2);
		perso1.comparer(perso2);
		
		entre1.augmentation(perso1);
		entre1.augmentation(perso2);
		
		System.out.println(perso1.getSalaire());
		System.out.println(perso2.getSalaire());

	}

}
