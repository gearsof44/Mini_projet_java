package Tests;

import java.util.ArrayList;

import Main.*;

public class TestArticles {
	public static void main(String args[]){
		ArrayList<Article> listeArticle=new ArrayList<Article>();
		SouleveMalade soum=new SouleveMalade(1224, "Soulevator", "SV-6", 22.2, 14,850, 360);
		LitMecanise litm=new LitMecanise(1442, "LitMax", "LM-2", 14.56, 224, 450,"180", "120", "60", 360);
		FauteuilRoulant fautr=new FauteuilRoulant(2578, "RoueLibre", "RL-52", 8.2, 887,85, 12.3);
		MatelasAAir mataa=new MatelasAAir(339, "MatelasGonflette", "MG-44", 6.45, 78, "220","180", "20", 570.0, 3);
		TableAtile tabat=new TableAtile(12, "TableTuile", "TT-12", 4.44, 120, 85,"80", "120", "90", true);
		listeArticle.add(soum);
		listeArticle.add(litm);
		listeArticle.add(fautr);
		listeArticle.add(mataa);
		listeArticle.add(tabat);
		Main.Article.afficherTousArticles(listeArticle);
		System.out.println(soum.toString());
		System.out.println(litm.toString());
		System.out.println(fautr.toString());
		System.out.println(mataa.toString());
		System.out.println(tabat.toString());
	}
}
