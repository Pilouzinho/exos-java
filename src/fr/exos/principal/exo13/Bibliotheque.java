package fr.exos.principal.exo13;

import java.util.ArrayList;
import java.util.Scanner;

import fr.exos.principal.exo12.Livre;

public class Bibliotheque {
	private int id;
	private String nom;
	private static int nbreDeLivresMax = 10;
	private ArrayList<Livre> listeDeLivres = new ArrayList<>();
	private String adresse;
	private String ville;
	
	
	//constructeur(s)
	public Bibliotheque(int id, String nom, ArrayList<Livre> listeDeLivres, String adresse, String ville) {
		super();
		this.id = id;
		this.nom = nom;
		this.listeDeLivres = listeDeLivres;
		this.adresse = adresse;
		this.ville = ville;
	}
	
	//accesseurs
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public static int getNbreDeLivresMax() {
		return nbreDeLivresMax;
	}
	public ArrayList<Livre> getListeDeLivres() {
		return listeDeLivres;
	}
	public void setListeDeLivres(ArrayList<Livre> listeDeLivres) {
		this.listeDeLivres = listeDeLivres;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Bibliotheque [id=");
		builder.append(id);
		builder.append(", nom=");
		builder.append(nom);
		builder.append(", listeDeLivres=");
		builder.append(listeDeLivres);
		builder.append(", adresse=");
		builder.append(adresse);
		builder.append(", ville=");
		builder.append(ville);
		builder.append(", nombre de livres max =");
		builder.append(nbreDeLivresMax);
		builder.append("]");
		return builder.toString();
	}
	
	
	//méthodes
	public void ajouterLivre() {
				
		boolean continuer = true;
		char recommencer;
				
		do {
			Scanner sc = new Scanner(System.in);
			String nomLivre, auteurLivre;
			double prixLivre;
			System.out.println("Ajouter un livre : ");
			System.out.println("Nom du livre :");
			nomLivre = sc.nextLine();
			System.out.println("Nom de l'auteur :");
			auteurLivre = sc.nextLine();
			System.out.println("Prix du livre :");
			prixLivre = sc.nextDouble();
			this.listeDeLivres.add(new Livre(nomLivre, auteurLivre, prixLivre));
			
			System.out.println("Souhaitez-vous ajouter un nouveau livre ? (O/N)");
			recommencer = sc.next().charAt(0);
			if(recommencer == 'O' || recommencer == 'o' || recommencer == '0') {
				continuer = true;
			}else {
				continuer = false;
				System.out.println("Fin de l'ajout de livres");
			}
		}while(continuer);
	}
	
}
