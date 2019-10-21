package fr.exos.principal.exo12;

import java.util.ArrayList;
import java.util.Scanner;

public class Main12 {

	public static void main(String[] args) {
//		Livre livre = new Livre("Fondation", "Isaac Asimov", 23.00);
//		
//		System.out.println(livre);
		
		ArrayList<Livre> listeLivres = new ArrayList<Livre>();		
		int nombreEntre;
		boolean continuer = true;
		char recommencer;
		Scanner sc = null;
		
		try {
			
			
			do {
				sc = new Scanner(System.in);
				String nomLivre, auteurLivre;
				double prixLivre;
				System.out.println("Ajouter un livre : ");
				System.out.println("Nom du livre :");
				nomLivre = sc.nextLine();
				System.out.println("Nom de l'auteur :");
				auteurLivre = sc.nextLine();
				System.out.println("Prix du livre :");
				prixLivre = sc.nextDouble();
				listeLivres.add(new Livre(nomLivre, auteurLivre, prixLivre));
				
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
		finally {
			if(sc!=null)
				sc.close();
		}
		System.out.println("Nombre de livres créés : " + listeLivres.size());
		for(Livre livre : listeLivres) {
			System.out.println(livre);
		}

	}

}
