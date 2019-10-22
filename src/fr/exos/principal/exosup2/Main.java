package fr.exos.principal.exosup2;

public class Main {

	public static void main(String[] args) {
		Personne p1 = new Personne("Albert", "Bère", null);
		Personne p2 = new Personne("Mireille", "Miraisin", null);
		
		Appart apt = new Appart("Rue Patrick, Levallois Perret", 2500000);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(apt);
		
		p1.setAppart(apt);
		System.out.println(p1);
		
		p1.modifierPrixAppart(apt, 0.1);
		System.out.println(p1.getAppart());
		
		p1.vendreAppart(p2);
		
		System.out.println(p1);
		System.out.println(p2);
	}

}
