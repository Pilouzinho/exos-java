package fr.exos.principal.exo10;

public class Camion extends Voiture {
	private static int matriculeCamions;
	private int matriculeCamion;

	public Camion(String modele, int annee, double prix, String couleur) {
		super(modele, annee, prix, couleur);
		matriculeCamions++;
		this.matriculeCamion = matriculeCamions;
	}
	
	//accesseurs
		public static int getMatriculeCamions() {
			return matriculeCamions;
		}

		public int getMatriculeCamion() {
			return matriculeCamion;
		}

		
		
		@Override
		public void demmarerVehicule() {
			System.out.println("La moto matricule " + this.matriculeCamion + " a démmarré");
		}
		
		@Override
		public void arreterVehicule() {
			System.out.println("La moto matricule " + this.matriculeCamion + " s'est arrêté");
		}
		
		@Override
		public void afficher() {
			System.out.println("La moto matricule " + this.matriculeCamion + ", modèle : " + this.modele + ", de " + this.annee + ", de couleur "+ this.couleur + " vaut " + this.prix +"€");
		}

}
