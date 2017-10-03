package Main;

import java.io.File;
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
	static String logPath = "LOG/";
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
		String strmonthEnd = Integer.toString(loc.getDateFin().getMonth());
		if (strmonthEnd.length() == 1){
			strmonthEnd = "0"+strmonthEnd;
		}
		String stryearEnd = Integer.toString(loc.getDateFin().getYear());
		String outputFileCsv = logPath+stryearEnd+strmonthEnd+".loc.csv";
		String outputFileRecette = logPath+"recette.csv";
		final String COMMA_DELIMITER = ",";
		final String NEW_LINE_SEPARATOR = "\n";
		File fLog = new File(outputFileCsv);
		File fRecette = new File(outputFileRecette);
		final String FILE_HEADER_LOG = "id,listeArticle,dateDebut,dateFin,montantFacture,coordonneesClient";
		final String FILE_HEADER_RECETTE = "date,montantFacture";
		FileWriter fileWriterLog = null;
		FileWriter fileWriterRecette = null;
		try {
			fileWriterLog = new FileWriter(outputFileCsv, true);
			if (! fLog.exists()){
				fileWriterLog.append(FILE_HEADER_LOG.toString());
				fileWriterLog.append(NEW_LINE_SEPARATOR);
			}
			fileWriterLog.append(String.valueOf(loc.getId()));
			fileWriterLog.append(COMMA_DELIMITER);
			fileWriterLog.append(String.valueOf(loc.getListeArticle()));
			fileWriterLog.append(COMMA_DELIMITER);
			fileWriterLog.append(String.valueOf(loc.getDateDebut()));
			fileWriterLog.append(COMMA_DELIMITER);
			fileWriterLog.append(String.valueOf(loc.getDateFin()));
			fileWriterLog.append(COMMA_DELIMITER);
			fileWriterLog.append(String.valueOf(loc.getMontantFacture()));
			fileWriterLog.append(COMMA_DELIMITER);
			fileWriterLog.append(String.valueOf(loc.getCoordonneesClient()));
			System.out.println("CSV log file was created successfully !!!");
			fileWriterRecette = new FileWriter(outputFileRecette, true);
			if (! fRecette.exists()){
				fileWriterRecette.append(FILE_HEADER_RECETTE.toString());
				fileWriterRecette.append(NEW_LINE_SEPARATOR);
			}
			fileWriterRecette.append(String.valueOf(loc.getDateFin()));
			fileWriterRecette.append(COMMA_DELIMITER);
			fileWriterRecette.append(String.valueOf(loc.getMontantFacture()));
			System.out.println("CSV recette file was created successfully !!!");
		} catch (Exception e) {
			System.out.println("Error in CsvFileWriter !!!");
			e.printStackTrace();
		}finally {
			try {
				fileWriterLog.flush();
				fileWriterRecette.flush();
				fileWriterLog.close();
				fileWriterRecette.close();
			}catch (IOException e) {
				System.out.println("Error while flushing/closing fileWriter !!!");
				e.printStackTrace();
			}
		}
		this.listeLocation.remove(loc);
	}

	public void AfficherLocationEnCours(){
		for (Location o : listeLocation){
			strListeLocation += o.toString()+"\n";
		}
		System.out.println("Locations en cours pour le client : "+nom+" "+prenom);
		System.out.println();
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
		if (listeLocation.isEmpty()){
			String strListeLocation = "Pas de location en cours";
		}
		for (Location o : listeLocation){
			strListeLocation += o.toString();
		}
		return "Client [nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + ", numTel=" + numTel
				+ ", listeLocation=" + strListeLocation;
	}


}
