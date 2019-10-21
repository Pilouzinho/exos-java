package fr.exos.principal.exo8;

import java.util.ArrayList;
import java.util.Scanner;

public class Main8 {

	public static void main(String[] args) {
		//partie 1
		
//		ArrayList<String> resultats = new ArrayList<>();
//		int valeurEntree;
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Entrez le nombre de valeurs souhaitée : ");
//		valeurEntree = sc.nextInt();
//		
//		for(int i = 0; i < valeurEntree*2; i++) {
//			if(i%2 != 0) {
//				resultats.add(i + " a pour carré " + i*i);
//			}
//		}
//		
//		for(String res : resultats) {
//			System.out.println(res);
//		}
		
		
		//partie 2
		
		ArrayList<Double> tableauTest = UtilTab.creerTableau();
		System.out.println("Affichage du tableau de départ :");
		UtilTab.afficherTableau(tableauTest);
		System.out.println("--------------------------------");
		System.out.println("Affichage de la somme des éléments du tableau :");
		System.out.println(UtilTab.somme(tableauTest));
		System.out.println("--------------------------------");
		System.out.println("Affichage du tableau incrémenté :");
		ArrayList<Double> tableauIncre = UtilTab.incre(tableauTest, 9);
		UtilTab.afficherTableau(tableauIncre);

	}

}
