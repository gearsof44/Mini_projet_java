import java.util.ArrayList;
import java.util.Date;

/**
 * @author GUILLET & COTTREL
 *
 */
public class Location {

	private int id;
	private ArrayList<Article> listeArticle;
	private Date dateDebut;
	private Date dateFin;
	private double montantFacture;
	private Client coordonneesClient;
	
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
	public Location(ArrayList<Article> listeArticle, Date dateDebut, Date dateFin, double montantFacture, Client coordonneesClient) {
		this.listeArticle = listeArticle;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.montantFacture = montantFacture;
		this.coordonneesClient = coordonneesClient;
	}
	
	/**
	 * @param client
	 * @param articlesCommandes
	 * @param dateDebut
	 * @param dateFin
	 * @return
	 */
	public Location AjouterLocation(Client client, ArrayList<Article> articlesCommandes, Date dateDebut, Date dateFin){
		double prixLocation = 0;
		for (Article art : articlesCommandes){
			double nbJourLoc = dateFin.getDate() - dateDebut.getDate();
			double prixParJour = art.getPrixLocationJour();
			prixLocation += nbJourLoc*prixParJour;
		}
		Location nouvelleLocation = new Location(articlesCommandes, dateDebut, dateFin, prixLocation, client);
		return nouvelleLocation;
	}
	
	
	
}
