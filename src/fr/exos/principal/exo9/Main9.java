package fr.exos.principal.exo9;

import java.util.ArrayList;
import java.util.Scanner;

public class Main9 {

	public static void main(String[] args) {
		
		ArrayList<Voiture> voitures = new ArrayList<Voiture>();
		
		for(int i = 1; i <= 5; i++) {
			Scanner sc = new Scanner(System.in);
			String marque, couleur;
			int annee;
			double prix;
			
			System.out.println("Saisissez la marque du v�hicule n�" + i + ":");
			marque = sc.nextLine();
			System.out.println("Saisissez la couleur du v�hicule n�" + i + ":");
			couleur = sc.nextLine();
			System.out.println("Saisissez l'ann�e du v�hicule n�" + i + ":");
			annee = sc.nextInt();
			System.out.println("Saisissez le prix du v�hicule n�" + i + ":");
			prix = sc.nextDouble();
			voitures.add(new Voiture(marque, annee, prix, couleur));
		}
		
		for(Voiture voit : voitures) {
			voit.afficher();
			voit.demmarerVehicule();
			voit.arreterVehicule();
		}
		
		

	}

}
