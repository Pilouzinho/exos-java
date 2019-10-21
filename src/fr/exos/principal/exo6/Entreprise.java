package fr.exos.principal.exo6;

public class Entreprise {
	private double coef = 1.2;
	public void augmentation(Personne p) {
		if(p.getSalaire() < 1500) {
			p.setSalaire(p.getSalaire()*coef);
		}
	}
}
