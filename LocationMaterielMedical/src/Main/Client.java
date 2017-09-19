package Main;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author GUILLET & COTTREL
 *
 */

public class Client {
	//attributs
	private int id;
	private String nom;
	private String prenom;
	private String adresse;
	private String numTel;
	private ArrayList<Location> listeLocation;
	//getter setter
	
	public String getNom() {
		return nom;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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

	public Client(int id, String nom, String prenom, String adresse, String numTel, ArrayList<Location> listeLocation) {
		super();
		this.id = id;
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
