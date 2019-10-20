package fr.exos.principal.exo4;

import java.util.Scanner;

public class Chaine1 {
	private String chaineEntree;
	private String tests = "aeiouy";
	private String carSpe = " \n\t!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~";
	Scanner sc = new Scanner(System.in);
	

	public Chaine1() {
		super();
		System.out.println("Entrez une phrase : ");
		this.chaineEntree = sc.nextLine();
	}
	
	public Chaine1(String chaineEntree) {
		this.chaineEntree = chaineEntree;
	}

	public String getChaineEntree() {
		return chaineEntree;
	}

	public void setChaineEntree(String chaineEntree) {
		this.chaineEntree = chaineEntree;
	}
	
	public StringBuffer getAllVoyelles(){
		StringBuffer voyelles = new StringBuffer();
		
		for(int i = 0; i < this.chaineEntree.length(); i++) {
			if(tests.indexOf(this.chaineEntree.charAt(i)) > -1 && carSpe.indexOf(this.chaineEntree.charAt(i)) == -1 ) {
				voyelles.append(Character.toLowerCase(this.chaineEntree.charAt(i)));
			}
		}
		
		return voyelles;
	}

	public StringBuffer getAllConsonnes() {
		StringBuffer consonnes = new StringBuffer();
		
		for(int i = 0; i < this.chaineEntree.length(); i++) {
			if(tests.indexOf(this.chaineEntree.charAt(i)) == -1 && carSpe.indexOf(this.chaineEntree.charAt(i)) == -1) {
				consonnes.append(Character.toLowerCase(this.chaineEntree.charAt(i)));
			}
		}
		
		return consonnes;
		
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Chaine1 [chaineEntree=");
		builder.append(chaineEntree);
		builder.append(", getAllVoyelles()=");
		builder.append(this.getAllVoyelles());
		builder.append(", getAllConsonnes()=");
		builder.append(this.getAllConsonnes());
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}
