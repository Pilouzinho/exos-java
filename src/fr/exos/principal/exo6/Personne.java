package fr.exos.principal.exo6;

public class Personne {
	protected String nom;
	private int age;
	private double salaire;
	
	
	public Personne(String nom, int age, double salaire) {
		super();
		this.nom = nom;
		this.age = age;
		this.salaire = salaire;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public double getSalaire() {
		return salaire;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
	
	public void comparer(Personne p) {
		System.out.println("L'âge de " + this.nom+ " est de " + this.age + " ans");
		System.out.println("L'âge de " + p.getNom() + " est de " + p.getAge() + " ans");
	}

}
