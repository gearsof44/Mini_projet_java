package Main;

import java.io.FileWriter;
import java.io.IOException;
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
		this.listeLocation.add(loc);
	}

	public void RetirerLocation(Location loc){
		String outputFile = "archive.csv";
		final String COMMA_DELIMITER = ",";
		final String NEW_LINE_SEPARATOR = "\n";
		
		final String FILE_HEADER = "listeArticle,dateDebut,dateFin,montantFacture,coordonneesClient";
		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter(outputFile);
			fileWriter.append(FILE_HEADER.toString());
			fileWriter.append(NEW_LINE_SEPARATOR);
			fileWriter.append(String.valueOf(loc.getId()));
			fileWriter.append(COMMA_DELIMITER);
			fileWriter.append(String.valueOf(loc.getListeArticle()));
			fileWriter.append(COMMA_DELIMITER);
			fileWriter.append(String.valueOf(loc.getDateDebut()));
			fileWriter.append(COMMA_DELIMITER);
			fileWriter.append(String.valueOf(loc.getDateFin()));
			fileWriter.append(COMMA_DELIMITER);
			fileWriter.append(String.valueOf(loc.getMontantFacture()));
			fileWriter.append(NEW_LINE_SEPARATOR);
			fileWriter.append(String.valueOf(loc.getCoordonneesClient()));
			fileWriter.append(NEW_LINE_SEPARATOR);
			System.out.println("CSV file was created successfully !!!");
		} catch (Exception e) {
			System.out.println("Error in CsvFileWriter !!!");
			e.printStackTrace();
		}finally {
			try {
				fileWriter.flush();
				fileWriter.close();
			}catch (IOException e) {
				System.out.println("Error while flushing/closing fileWriter !!!");
				e.printStackTrace();
			}
		}
		this.listeLocation.remove(loc);
	}

	public Client(int id, String nom, String prenom, String adresse, String numTel, ArrayList<Location> listeLocation) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.numTel = numTel;
		this.listeLocation = listeLocation;
	}

	@Override
	public String toString() {
		String strListeLocation = "Pas de location en cours";
		for (Location o : listeLocation){
			strListeLocation += o.toString();
		}
		return "Client [nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + ", numTel=" + numTel
				+ ", listeLocation=" + strListeLocation;
	}
	
	
}
