package fr.exos.principal.exo20;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scint = new Scanner(System.in);
		int entreeUtilisateur = 0;
		boolean entreeOk = true;
		do {
			try {
				System.out.println("Entrez un entier :");
				entreeUtilisateur = scint.nextInt();
				if(entreeUtilisateur < 10) {
					throw new IllegalArgumentException();
				}
				entreeOk = true;
			}catch(InputMismatchException e) {
				System.out.println("Merci de rentrer uniquement un entier !");
				entreeOk = false;
			}catch(IllegalArgumentException e) {
				System.out.println("Merci de rentrer uniquement un entier supérieur à 10 !");
				entreeOk = false;
			}finally {
				scint.nextLine(); //vider le buffer du scanner
			}
		}while(!entreeOk);
		
		System.out.println("Le chiffre entier entré c'est le : " + entreeUtilisateur);
	}

}
