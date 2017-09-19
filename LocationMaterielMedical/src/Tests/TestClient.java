package Tests;

import java.util.ArrayList;
import java.util.Date;

import Main.*;


public class TestClient {

public static void main (String args[]){
		
		ArrayList<Article> listeArticleTest = new ArrayList<Article>();
		ArrayList<Location> listeLocationTest = new ArrayList<Location>();
		listeArticleTest.add(new SouleveMalade(1224, "Soulevator", "SV-6", 222, 14,250, 360));
		listeArticleTest.add(new MatelasAAir(1224, "Matmoila", "PX9", 22, 4, "14cm","45cm", "85cm", 85.5, 30));
		listeArticleTest.add(new TableAtile(1224, "Soulevator", "SV-6", 2, 14, 4, "14cm","45cm", "85cm", true));
		Date dateDebutTest = new Date(2017,9,6);
		Date dateFinTest = new Date(2017,9,17);
		Location myLocationTest = new Location(null, null, null, 0, null);
		Client myClientTest = new Client(1,"DIDIER", "Jean", "ICI", "0658459545");
		Client client2 = new Client(2,"DIDIER", "Jean", "ICI", "0789562128");
		Location loc = myLocationTest.AjouterLocation(myClientTest, listeArticleTest, dateDebutTest, dateFinTest);
		listeLocationTest.add(loc);
		Main.Location.afficherLocationClient(listeLocationTest,client2);
		System.out.println(loc.toString());
	}
}
