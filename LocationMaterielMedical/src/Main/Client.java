package Main;

import java.io.BufferedReader;
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
	static String logPath = "./LOG/";
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
	//Ajoute la location sous le fichier d'archivage et enregistre le montant gagne
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
		
		//Si le dossier log n'existe pas alors le creer
		File check_dir = new File(logPath);
		if (!check_dir.exists()) {
			check_dir.mkdir();
		}

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

			//Ajout des donnees dans le fichier log
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
			fileWriterLog.append(NEW_LINE_SEPARATOR);
			System.out.println("CSV log file was created successfully !!!");
			fileWriterRecette = new FileWriter(outputFileRecette, true);

			//Si le fichier recette n'existe pas renseigner le header
			if (! fRecette.exists()){
				fileWriterRecette.append(FILE_HEADER_RECETTE.toString());
				fileWriterRecette.append(NEW_LINE_SEPARATOR);
			}

			//Ajout des donnees dans le fichier recette
			fileWriterRecette.append(String.valueOf(loc.getDateFin().getDay())+":"+String.valueOf(loc.getDateFin().getMonth())+":"+String.valueOf(loc.getDateFin().getYear()));
			fileWriterRecette.append(COMMA_DELIMITER);
			fileWriterRecette.append(String.valueOf(loc.getMontantFacture()));
			fileWriterRecette.append(NEW_LINE_SEPARATOR);
			System.out.println("CSV recette file was created successfully !!!");
		} catch (Exception e) {
			System.out.println("Error in CsvFileWriter !!!");
			e.printStackTrace();
		}finally {
			try {
				//On ferme les different writers
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
	//sur une periode donnee
	public void getMontantRecette(Date dateDebut, Date dateFin) throws NumberFormatException, IOException{
		int total = 0;
		final int RECETTE_DATE = 0;
		final int RECETTE_MONTANT = 1;
		final String COMMA_DELIMITER = ",";
		final String NEW_LINE_SEPARATOR = "\n";
		String csvFile = logPath+"recette.csv";
		String strDateDebut = String.valueOf(dateDebut.getDay())+":"+String.valueOf(dateDebut.getMonth())+":"+String.valueOf(dateDebut.getYear());
		String strDateFin = String.valueOf(dateFin.getDay())+":"+String.valueOf(dateFin.getMonth())+":"+String.valueOf(dateFin.getYear());
		BufferedReader fileReader = null;
		try {
			String line = "";
			File fRecette = new File(csvFile);
			fileReader = new BufferedReader(new FileReader(fRecette));
			
			//Skip the read of the header
			fileReader.readLine();
			
			//Read the file line by line
			while ((line = fileReader.readLine()) != null) {
				//get all fields of the line
				String[] tokens = line.split(COMMA_DELIMITER);
				String strListTokenDate[] = tokens[RECETTE_DATE].split(":");
				String strListDateDebut[] = strDateDebut.split(":");
				String strListDateFin[] = strDateFin.split(":");
				int intListTokenDate1 = Integer.parseInt(strListTokenDate[0]);
				int intListTokenDate2 =	Integer.parseInt(strListTokenDate[1]);
				int intListTokenDate3 = Integer.parseInt(strListTokenDate[2]);
				int intListDateDebut1 = Integer.parseInt(strListDateDebut[0]);
				int intListDateDebut2 = Integer.parseInt(strListDateDebut[1]);
				int intListDateDebut3 = Integer.parseInt(strListDateDebut[2]);
				int intListDateFin1 = Integer.parseInt(strListDateFin[0]);
				int intListDateFin2 = Integer.parseInt(strListDateFin[1]);
				int intListDateFin3 = Integer.parseInt(strListDateFin[2]);
				if (intListDateDebut1 <= intListTokenDate1 && intListTokenDate1 <= intListDateFin1){
					if (intListDateDebut2 <= intListTokenDate2 && intListTokenDate2 <= intListDateFin2){
						if (intListDateDebut3 <= intListTokenDate3 && intListTokenDate3 <= intListDateFin3){
							total += Double.parseDouble(tokens[RECETTE_MONTANT]);
						}
					}
				}
			}
    	System.out.println("Recette sur laps de temps donne : "+total);
		}catch (Exception e) {
            System.out.println("Error in CsvFileReader !!!");
            e.printStackTrace();
        }
		finally{
			 try {
				 fileReader.close();
				 } catch (IOException e) {
					 System.out.println("Error while closing fileReader !!!");
					 e.printStackTrace();
					 }
				}
		}

	public void afficherLocationEnCours(){
		String strListeLocation = "";
		if (listeLocation.isEmpty()){
			strListeLocation = "Pas de location en cours";
		}else {
			for (Location o : listeLocation){
				strListeLocation += o.toString()+"\n";
			}
		}
		System.out.println("Locations en cours pour le client : "+nom+" "+prenom);
		System.out.println(strListeLocation);
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
		String strListeLocation ="";
		if (listeLocation.isEmpty()){
			strListeLocation = "Pas de location en cours";
		}
		for (Location o : listeLocation){
			strListeLocation += o.toString();
		}
		return "Client [nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + ", numTel=" + numTel
				+ ", listeLocation=" + strListeLocation;
	}


}
