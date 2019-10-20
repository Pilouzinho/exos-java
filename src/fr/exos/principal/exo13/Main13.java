package fr.exos.principal.exo13;

import java.util.ArrayList;
import java.util.Scanner;

import fr.exos.principal.exo12.Livre;

public class Main13 {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		Scanner scInt = new Scanner(System.in);
		int id;
		String nom, adresse, ville; 
		System.out.println("Ajouter une Biblioth�que : ");
		System.out.println("Id de la biblioth�que :");
		id = scInt.nextInt();
		System.out.println("Nom de la biblioth�que : ");
		nom = sc1.nextLine();
		System.out.println("Adresse de la biblioth�que : ");
		adresse = sc1.nextLine();
		System.out.println("Ville de la biblioth�que : ");
		ville = sc1.nextLine();
		ArrayList<Livre> listeDeLivres = new ArrayList<Livre>();
		Bibliotheque bibli = new Bibliotheque(id, nom, listeDeLivres, adresse, ville);
		System.out.println("Ajoutons des livres dans cette biblioth�que !");
		bibli.ajouterLivre();
		
		System.out.println(bibli);
	}

}
