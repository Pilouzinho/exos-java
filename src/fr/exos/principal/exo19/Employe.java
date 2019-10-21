package fr.exos.principal.exo19;


public abstract class Employe {
	private String nom;
	private String prenom;
	private int age;
	private String dateEntree;
	
	//constructeur
	public Employe(String nom, String prenom, int age, String dateEntree) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.dateEntree = dateEntree;
	}

	
	//accesseurs
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDateEntree() {
		return dateEntree;
	}

	public void setDateEntree(String dateEntree) {
		this.dateEntree = dateEntree;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employe [nom=");
		builder.append(nom);
		builder.append(", prenom=");
		builder.append(prenom);
		builder.append(", age=");
		builder.append(age);
		builder.append(", dateEntree=");
		builder.append(dateEntree);
		builder.append("]");
		return builder.toString();
	}
	
	
	//methodes
	public abstract double calculerSalaires();
	
	
	
}
