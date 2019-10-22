package fr.exos.principal.exo21;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

	public static void main(String[] args) {
		Properties properties;
        try {
            properties= new Properties();
            properties.load(new FileInputStream("C:/Users/touch/eclipse-workspace/Cahier-exos-java/src/fr/exos/principal/exo21/data.properties"));
            
            System.out.println(properties.getProperty("fichier.personne"));
            System.out.println(properties.getProperty("fichier.article"));
            System.out.println(properties.getProperty("fichier.input.personnes"));
            System.out.println(properties.getProperty("fichier.output.personnes"));
            System.out.println(properties.getProperty("fichier.input.articles"));
            System.out.println(properties.getProperty("fichier.outpput.articles"));
            System.out.println(properties.getProperty("formateur.java"));
            System.out.println(properties.getProperty("formateur.android"));
            System.out.println(properties.getProperty("formateur.test"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
	}

}
	