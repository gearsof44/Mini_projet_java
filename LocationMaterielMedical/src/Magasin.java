import java.util.ArrayList;
import java.util.Date;

/**
 * 
 * @author GUILLET & COTTREL
 *
 */
public class Magasin {
	private String gerant;
	private String coordonnées;
	private ArrayList<Article> listeArticle;
	
	/**
	 * @param gerant
	 * @param coordonnées
	 */
	//Constructeur
	public Magasin(String gerant, String coordonnées, ArrayList<Article> listeArticle) {
	this.gerant = gerant;
	this.coordonnées = coordonnées;
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
	public String getCoordonnées() {
		return coordonnées;
	}
	public void setCoordonnées(String coordonnées) {
		this.coordonnées = coordonnées;
	}
	public ArrayList<Article> getListeArticle() {
		return listeArticle;
	}
	public void setListeArticle(ArrayList<Article> listeArticle) {
		this.listeArticle = listeArticle;
	}	
	
}
