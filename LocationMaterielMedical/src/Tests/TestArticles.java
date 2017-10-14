package Tests;

//import de toutes les classes du package main
import Main.*;

import java.util.ArrayList;

/**
 * @author GUILLET & COTTREL
 *
 */

public class TestArticles {
	
	public static void main(String args[]){
		
		//Definition d'une liste d'objets Article
		ArrayList<Article> listeArticles=new ArrayList<Article>();
		
		//Definition de different articles
		SouleveMalade soum=new SouleveMalade(1224, "Soulevator", "SV-6", 22.2, 14,850, 360);
		LitMecanise litm=new LitMecanise(1442, "LitMax", "LM-2", 14.56, 224, 450,"180", "120", "60", 360);
		FauteuilRoulant fautr=new FauteuilRoulant(2578, "RoueLibre", "RL-52", 8.2, 887,85, 12.3);
		MatelasAAir mataa=new MatelasAAir(339, "MatelasGonflette", "MG-44", 6.45, 78, "220","180", "20", 570.0, 3);
		TableAtile tabat=new TableAtile(12, "TableTuile", "TT-12", 4.44, 120, 85,"80", "120", "90", true);
		
		//Ajout de tous les articles definient precedemment
		//dans une liste d'objets Article
		listeArticles.add(soum);
		listeArticles.add(litm);
		listeArticles.add(fautr);
		listeArticles.add(mataa);
		listeArticles.add(tabat);
		
		//Test le bon affichage de la liste d'articles
		System.out.println("Test 1 : TestAfficherArticles");
		TestAfficherArticles(listeArticles);
	}
	
	//Test le bon affichage de la liste d'articles
	public static void TestAfficherArticles(ArrayList<Article> listeArticles) {
		Article.afficherTousArticles(listeArticles);
	}
	
	
}


