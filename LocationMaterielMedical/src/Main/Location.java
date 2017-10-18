package Main;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

/**
 * @author GUILLET & COTTREL
 *
 */

public class Location {

	//attributs
	private int id;
	private ArrayList<Article> listeArticle;
	private Date dateDebut;
	private Date dateFin;
	private double montantFacture;
	private Client coordonneesClient;

	//getter setter
	public int getId() {
		return id;
	}
	public Client getCoordonneesClient() {
		return coordonneesClient;
	}
	public void setId(int id) {
		this.id = id;
	}
	public ArrayList<Article> getListeArticle() {
		return listeArticle;
	}
	public void setListeArticle(ArrayList<Article> listeArticle) {
		this.listeArticle = listeArticle;
	}
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	public Date getDateFin() {
		return dateFin;
	}
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	public double getMontantFacture() {
		return montantFacture;
	}
	public void setMontantFacture(double montantFacture) {
		this.montantFacture = montantFacture;
	}
	public void setCoordonneesClient(Client coordonneesClient) {
		this.coordonneesClient = coordonneesClient;
	}

	/**
	 * @param listeArticle
	 * @param dateDebut
	 * @param dateFin
	 * @param montantFacture
	 * @param coordonneesClient
	 */
	//Constructeur
	public Location(int id, ArrayList<Article> listeArticle, Date dateDebut, Date dateFin, double montantFacture, Client coordonneesClient) {
		this.id = id;
		this.listeArticle = listeArticle;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.montantFacture = montantFacture;
		this.coordonneesClient = coordonneesClient;
	}

	public void afficherLocation(){
		System.out.println("Identifiant"+getId());
		System.out.println("Client: "+getCoordonneesClient());
		System.out.println("Date de début: "+getDateDebut());
		System.out.println("Date de fin: "+getDateFin());
		System.out.println("Liste des articles: ");
		Article.afficherTousArticles(getListeArticle());
	}


	public static void afficherLocationClient(Client locClient){
		for(Location loc:locClient.getListeLocation()){
			loc.afficherLocation();
		}
	}

	@Override
 	public String toString() {
		String strListeArticle = "";
		if (listeArticle.isEmpty()) {
			strListeArticle = "Pas d'articles";
		}
		for (Article art : listeArticle){
			strListeArticle += art.toString();
		}
 		return "Location [id=" + id + ", listeArticle=" + strListeArticle + ", dateDebut=" + dateDebut + ", dateFin="
 				+ dateFin + ", montantFacture=" + montantFacture + ", coordonneesClient=" + "nom : "+ coordonneesClient.getNom() + ", prenom : "+ coordonneesClient.getPrenom() +", num tel : "+ coordonneesClient.getNumTel() + "]";
 	}

}
