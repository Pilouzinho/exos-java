package fr.exos.principal.exosup3;

public class Main {

	public static void main(String[] args) {
		Compte compte1 = new Compte(1, "Dudulle", 23.90);
		CompteEpargne compte2 = new CompteEpargne(2, "Dudulle", 250.85, 0.02);
		CompteCourant compte3 = new CompteCourant(3, "Dudulle", 7.90, 200);
		
		compte3.deposerArgent(10);
		compte3.retirerArgent(120);
		compte3.consulterCompte();
		
		compte2.ajoutInterets();
		
		compte2.consulterCompte();

	}

}
