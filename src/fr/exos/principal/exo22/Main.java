package fr.exos.principal.exo22;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;
import java.util.Properties;

public class Main{

	public static void main(String[] args) {
		Properties properties;
		Personne p1 = new Personne("1289874589", "bouchard", "Gérard", new Date(1984-10-02), "Poitiers");
		Personne p2 = new Personne("2587489758", "bouchard", "Géraldine", new Date(1989-10-02), "La souterraine");
		Personne p3 = new Personne("1648343343", "Dupont", "Gaston", new Date(1977-05-10), "Sainte verge");
		  try {
			  properties = new Properties();
			  properties.load(new FileInputStream("C:/Users/touch/eclipse-workspace/Cahier-exos-java/src/fr/exos/principal/exo21/data.properties"));
			  FileOutputStream fout = new FileOutputStream(properties.getProperty("fichier.output.personnes"));
			  ObjectOutputStream o = new ObjectOutputStream(fout);
			  System.out.println(properties.getProperty("fichier.output.personnes"));
			  o.writeObject(p1);
			  o.writeObject(p2);
			  o.writeObject(p3);
			  
			  FileInputStream fin = new FileInputStream(properties.getProperty("fichier.output.personnes"));
			  ObjectInputStream oin = new ObjectInputStream(fin);
			  
			  try {
				Personne pr1 = (Personne) oin.readObject();
				Personne pr2 = (Personne) oin.readObject();
				Personne pr3 = (Personne) oin.readObject();
				
				System.out.println(pr1);
				System.out.println(pr2);
				System.out.println(pr3);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("clase not found");
			}
			  
		} catch (FileNotFoundException e) {
			System.out.println("fiile not found");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("I/O not found");
			e.printStackTrace();
		}

	}

}
