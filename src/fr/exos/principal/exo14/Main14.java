package fr.exos.principal.exo14;

import java.util.ArrayList;
import java.util.Scanner;

public class Main14 {

	public static void main(String[] args) {
		Scanner scStr = new Scanner(System.in);
		Scanner scInt = new Scanner(System.in);
		ArrayList<Etudiant> etudiants = new ArrayList<Etudiant>();
		ArrayList<Employe> employes = new ArrayList<Employe>();
		ArrayList<Professeur> profs = new ArrayList<Professeur>();

		
		for(int i = 0; i < 2; i++) {
			etudiants.add(new Etudiant());
		}
		for(int i = 0; i < 2; i++) {
			employes.add(new Employe());
		}
		for(int i = 0; i < 2; i++) {
			profs.add(new Professeur());
		}
		
		for(Etudiant etudiant : etudiants) {
			System.out.println(etudiant);
		}
		for(Employe employe : employes) {
			System.out.println(employe);
		}
		for(Professeur prof : profs) {
			System.out.println(prof);
		}
	}

}
