package fr.exos.principal.exo3;

import java.util.Arrays;
import java.util.Scanner;

public class TableauNombres {
	private double[] tab = new double[10];
	Scanner sc = new Scanner(System.in);
	
	public TableauNombres() {
		int nbPassage = 0;
		boolean inversion;
		
		for(int i =0; i < 10; i++) {
			System.out.println("Entrez la valeur n° : " + (i+1));
			this.tab[i] = sc.nextInt();
		}
		
		
		do {
			inversion = false;
			for (int i = 0; i < this.tab.length-(1+nbPassage); i++) {
				if(this.tab[i] > this.tab[i+1]) {
					double temp = this.tab[i];
					this.tab[i] = this.tab[i+1];
					this.tab[i+1] = temp;
					inversion = true;

				}
			}
			nbPassage++;
			
		}while(inversion);
		
	}

	public double[] getTableau() {
		return tab;
	}

	public void setTableau(double[] tableau) {
		this.tab = tableau;
	}

	
	
	public double total() {
		double total = 0;
		for(int i =0; i < this.tab.length; i++) {
			total += this.tab[i];
		}
		return total; 
	}
	
	public double moyenne() {
		return this.total()/this.tab.length;
	}
	
	
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TableauNombres [tableau=");
		builder.append(Arrays.toString(tab));
		builder.append(", moyenne()=");
		builder.append(moyenne());
		builder.append(", isMax()=");
		builder.append(isMax());
		builder.append(", isMin()=");
		builder.append(isMin());
		builder.append(", ecartMax()=");
		builder.append(ecartMax());
		builder.append("]");
		return builder.toString();
	}

	public double isMax() {
		double max = 0;
		for(int i =0; i < this.tab.length; i++) {
			if(this.tab[i] > max) {
				max = this.tab[i];
			}
		}
		
		return max;
	}
	
	public double isMin() {
		double min = this.tab[0];
		for(int i =0; i < this.tab.length; i++) {
			if(this.tab[i] < min) {
				min = this.tab[i];
			}
		}
		
		return min;
	}
	
	public double ecartMax() {
		double ecart = 0, ecartMax = 0, testPrecedent = this.tab[1] - this.tab[0];
		for(int i = 0; i < this.tab.length; i++) {
			ecart = Math.abs(this.tab[i] - testPrecedent);
			if(ecart > ecartMax) {
				ecartMax = ecart;
			}
			
			testPrecedent = this.tab[i];
		}
		
		return ecartMax;
	}
	
	public void valDessusMoyenne() {
		for(int i = 0; i < this.tab.length; i++) {
			if(this.tab[i] > this.moyenne()) {
				System.out.println(this.tab[i] + " | ");
			}
		}
	}
	
	
}
