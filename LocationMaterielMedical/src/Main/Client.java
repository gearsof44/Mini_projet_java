package Main;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author GUILLET & COTTREL
 *
 */

public class Client {

	private String nom;
	private String prenom;
	private String adresse;
	private String numTel;
	private ArrayList<Location> listeLocation;
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getNumTel() {
		return numTel;
	}
	public void setNumTel(String numTel) {
		this.numTel = numTel;
	}
	
	public ArrayList<Location> getListeLocation() {
		return listeLocation;
	}
	
	public void setListeLocation(ArrayList<Location> listeLocation) {
		this.listeLocation = listeLocation;
	}
	
	public void AjouterLocation(Location loc){
		listeLocation.add(loc);
	}
	
	public void RetirerLocation(Location loc){
		listeLocation.remove(loc);
	}
		
	/**
	 * @param nom
	 * @param prenom
	 * @param adresse
	 * @param numTel
	 * @param listeLocation
	 */
	public Client(String nom, String prenom, String adresse, String numTel, ArrayList<Location> listeLocation) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.numTel = numTel;
		this.listeLocation = listeLocation;
	}
	@Override
	public String toString() {
		return "Client [nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + ", numTel=" + numTel
				+ ", listeLocation=" + listeLocation;
	}
	
	
}
