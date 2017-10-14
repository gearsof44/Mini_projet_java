package Main;
import java.util.ArrayList;
import java.util.Date;

/**
 * 
 * @author GUILLET & COTTREL
 *
 */

public class Magasin {
	
	//attributs
	private String gerant;
	private String coordonnees;
	private ArrayList<Article> listeArticle;
	
	/**
	 * @param gerant
	 * @param coordonnees
	 */	
	//Constructeur
	public Magasin(String gerant, String coordonnees, ArrayList<Article> listeArticle) {
	this.gerant = gerant;
	this.coordonnees = coordonnees;
	this.listeArticle = listeArticle;
	}
		
	public void main (String args[]){
		
	}
	
	//getter setter
	public String getGerant() {
		return gerant;
	}
	public void setGerant(String gerant) {
		this.gerant = gerant;
	}
	public String getCoordonnees() {
		return coordonnees;
	}
	public void setCoordonnees(String coordonnees) {
		this.coordonnees = coordonnees;
	}
	public ArrayList<Article> getListeArticle() {
		return listeArticle;
	}
	public void setListeArticle(ArrayList<Article> listeArticle) {
		this.listeArticle = listeArticle;
	}	
	
}
