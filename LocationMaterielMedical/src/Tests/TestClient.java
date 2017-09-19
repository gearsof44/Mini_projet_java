package Tests;

import java.util.ArrayList;
import java.util.Date;

import Main.*;


public class TestClient {

public static void main (String args[]){
		
		ArrayList<Article> listeArticleTest = new ArrayList<Article>();
		listeArticleTest.add(new SouleveMalade(1224, "Soulevator", "SV-6", 222, 14,250, 360));
		listeArticleTest.add(new MatelasAAir(1224, "Matmoila", "PX9", 22, 4, "14cm","45cm", "85cm", 85.5, 30));
		listeArticleTest.add(new TableAtile(1224, "Soulevator", "SV-6", 2, 14, 4, "14cm","45cm", "85cm", true));
		Date dateDebutTest = new Date(2017,9,6);
		Date dateFinTest = new Date(2017,9,17);
		ArrayList<Location> listeLocationTest = new ArrayList<Location>();
		Client myClientTest = new Client(1, "DIDIER", "Jean", "ICI", "0658459545", listeLocationTest);
		Location loc = new Location(listeArticleTest, dateFinTest, dateFinTest, 110, myClientTest);
		System.out.println(loc.toString());
		myClientTest.AjouterLocation(loc);
		loc.toString();
		//System.out.println(myClientTest.getListeLocation());
		//myClientTest.RetirerLocation(loc);
		//System.out.println(loc.getListeArticle());
		
	}
}
