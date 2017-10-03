package Main;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
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

	public void ajouterLocation(Location loc){
		this.listeLocation.add(loc);
	}

	//Permet de retirer une Location de la list de location active d'un Client
	//Ajoute la location sous le fichier d'archivage et enregistre le montant gagné
	//sous le fichier de recette
	public void retirerLocation(Location loc){
		String strmonthEnd = Integer.toString(loc.getDateFin().getMonth());
		if (strmonthEnd.length() == 1){
			strmonthEnd = "0"+strmonthEnd;
		}
		String stryearEnd = Integer.toString(loc.getDateFin().getYear());

		//Definition des paths de nos deux fichiers recette et log
		String outputFileCsv = logPath+stryearEnd+strmonthEnd+".loc.csv";
		String outputFileRecette = logPath+"recette.csv";

		//Definition du delimiteur et du separateur de ligne
		final String COMMA_DELIMITER = ",";
		final String NEW_LINE_SEPARATOR = "\n";

		//Definition de nos deux fichiers recette et log
		File fLog = new File(outputFileCsv);
		File fRecette = new File(outputFileRecette);

		//Definition des deux Headers
		final String FILE_HEADER_LOG = "id,listeArticle,dateDebut,dateFin,montantFacture,coordonneesClient";
		final String FILE_HEADER_RECETTE = "date,montantFacture";
		FileWriter fileWriterLog = null;
		FileWriter fileWriterRecette = null;
		try {
			fileWriterLog = new FileWriter(outputFileCsv, true);
			//Si le fichier log n'existe pas renseigner le header
			if (! fLog.exists()){
				fileWriterLog.append(FILE_HEADER_LOG.toString());
				fileWriterLog.append(NEW_LINE_SEPARATOR);
			}

			//Ajout des données dans le fichier log
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

			//Si le fichier recette n'existe pas renseigner le header
			if (! fRecette.exists()){
				fileWriterRecette.append(FILE_HEADER_RECETTE.toString());
				fileWriterRecette.append(NEW_LINE_SEPARATOR);
			}

			//Ajout des données dans le fichier receete
			fileWriterRecette.append(String.valueOf(loc.getDateFin()));
			fileWriterRecette.append(COMMA_DELIMITER);
			fileWriterRecette.append(String.valueOf(loc.getMontantFacture()));
			System.out.println("CSV recette file was created successfully !!!");
		} catch (Exception e) {
			System.out.println("Error in CsvFileWriter !!!");
			e.printStackTrace();
		}finally {
			try {
				//On ferme les différent writers
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

	//Permet de parcourir le fichier recette afin d'afficher les gains
	//sur une période donnée
	public void getMontantRecette(Date dateDebut, Date dateFin){
		private int total = 0;
		private static final int RECETTE_DATE = 0;
    private static final int RECETTE_MONTANT = 1;
		final String COMMA_DELIMITER = ",";
		final String NEW_LINE_SEPARATOR = "\n";
		String csvFile = logPath+"recette.csv";
		BufferedReader fileReader = null;
		HashMap<Date, double> hmap = new HashMap<Date, double>();
		try {
			String line = "";
			fileReader = new BufferedReader(new FileReader(csvFile));
			//Skip the read of the header
			fileReader.readLine();
			//Read the file line by line
      while ((line = fileReader.readLine()) != null) {
				//get all fields of the line
				String[] tokens = line.split(COMMA_DELIMITER);
				if (dateDebut < Date.parseDate(tokens[RECETTE_DATE]) < dateFin){
					if (tokens.length > 0) {
						hmap.put(Date.parseDate(tokens[RECETTE_DATE]), Double.parseDouble(tokens[RECETTE_DATE]));
				}
				Iterator it = hmap.entrySet().iterator();
    		while (it.hasNext()) {
        	Map.Entry pair = (Map.Entry)it.next();
        	total += pair.getValue();
        	it.remove();
    }
		System.out.println("Recette sur laps de temps donné : "+total);
	}

	public void afficherLocationEnCours(){
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
