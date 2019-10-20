package fr.exos.principa.exo19;

import java.util.ArrayList;

public class Personnel {
	ArrayList<Employe> employes;

	public Personnel() {
		employes = new ArrayList<Employe>();
	}
	
	public Personnel(ArrayList<Employe> employes) {
		super();
		this.employes = employes;
	}

	
	public ArrayList<Employe> getEmployes() {
		return employes;
	}

	public void setEmployes(ArrayList<Employe> employes) {
		this.employes = employes;
	}
	
	
	public void ajouterEmploye(Employe employe) {
		employes.add(employe);
	}
	
	public void afficherSalaires() {
		for(Employe employe : this.employes) {
			System.out.println(employe);
			System.out.println("Salaire : " + employe.calculerSalaires());
			System.out.println();
		}
	}
	
	public double salaireMoyen() {
		double salaireTotal = 0;
		for(Employe employe : this.employes) {
			salaireTotal += employe.calculerSalaires();
		}
		
		return salaireTotal/this.employes.size();
	}
	
}
