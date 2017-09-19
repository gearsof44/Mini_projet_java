package Tests;

import java.util.ArrayList;
import java.util.Date;

import Main.Article;
import Main.Client;
import Main.Location;
import Main.MatelasAAir;
import Main.SouleveMalade;
import Main.TableAtile;

public class TestLocation {
	
	public static void main (String args[]){
		
		ArrayList<Article> listeArticleTest = new ArrayList<Article>();
		listeArticleTest.add(new SouleveMalade(1224, "Soulevator", "SV-6", 222, 14,250, 360));
		listeArticleTest.add(new MatelasAAir(1224, "Matmoila", "PX9", 22, 4, "14cm","45cm", "85cm", 85.5, 30));
		listeArticleTest.add(new TableAtile(1224, "Soulevator", "SV-6", 2, 14, 4, "14cm","45cm", "85cm", true));
		Date dateDebutTest = new Date(2017,9,6);
		Date dateFinTest = new Date(2017,9,17);
		Client myClientTest = new Client(1, "DIDIER", "Jean", "ICI", "0658459545", null);
		Location loc = new Location(listeArticleTest, dateFinTest, dateFinTest, 110, myClientTest);
		myClientTest.AjouterLocation(loc);
		System.out.println(loc.toString());
	}

}
