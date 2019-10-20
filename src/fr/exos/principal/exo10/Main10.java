package fr.exos.principal.exo10;

import java.util.ArrayList;
import java.util.Scanner;

import fr.exos.principal.exo9.Voiture;

public class Main10 {

	public static void main(String[] args) {
		
		ArrayList<Voiture> voitures = new ArrayList<Voiture>();
		ArrayList<Moto> motos = new ArrayList<Moto>();
		ArrayList<Camion> camions = new ArrayList<Camion>();
		
		for(int i = 1; i <= 2; i++) {
			Scanner sc = new Scanner(System.in);
			String marque, couleur;
			int annee;
			double prix;
			
			System.out.println("Saisissez la marque de la voiture n°" + i + ":");
			marque = sc.nextLine();
			System.out.println("Saisissez la couleur de la voiture n°" + i + ":");
			couleur = sc.nextLine();
			System.out.println("Saisissez l'année de la voiture n°" + i + ":");
			annee = sc.nextInt();
			System.out.println("Saisissez le prix de la voiture n°" + i + ":");
			prix = sc.nextDouble();
			voitures.add(new Voiture(marque, annee, prix, couleur));
		}
		
		
		for(int i = 1; i <= 1; i++) {
			Scanner sc = new Scanner(System.in);
			String marque, couleur;
			int annee;
			double prix;
			
			System.out.println("Saisissez la marque de la moto n°" + i + ":");
			marque = sc.nextLine();
			System.out.println("Saisissez la couleur de la moto n°" + i + ":");
			couleur = sc.nextLine();
			System.out.println("Saisissez l'année de la moto n°" + i + ":");
			annee = sc.nextInt();
			System.out.println("Saisissez le prix de la moto n°" + i + ":");
			prix = sc.nextDouble();
			motos.add(new Moto(marque, annee, prix, couleur));
		}
		
		
		for(int i = 1; i <= 1; i++) {
			Scanner sc = new Scanner(System.in);
			String marque, couleur;
			int annee;
			double prix;
			
			System.out.println("Saisissez la marque du camion n°" + i + ":");
			marque = sc.nextLine();
			System.out.println("Saisissez la couleur du camion n°" + i + ":");
			couleur = sc.nextLine();
			System.out.println("Saisissez l'année du camion n°" + i + ":");
			annee = sc.nextInt();
			System.out.println("Saisissez le prix du camion n°" + i + ":");
			prix = sc.nextDouble();
			camions.add(new Camion(marque, annee, prix, couleur));
		}
		
		for(Voiture voit : voitures) {
			voit.afficher();
			voit.demmarerVehicule();
			voit.arreterVehicule();
		}
		
		for(Moto moto : motos) {
			moto.afficher();
			moto.demmarerVehicule();
			moto.arreterVehicule();
		}
		
		for(Camion camtar : camions) {
			camtar.afficher();
			camtar.demmarerVehicule();
			camtar.arreterVehicule();
		}
		
		

	}
}
