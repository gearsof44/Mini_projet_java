package Main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner; 

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

	public static void main (String args[]){
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

	//Permet de parcourir le fichier recette afin d'afficher les gains
	//sur une periode donnee
	public void getMontantRecette(Date dateDebut, Date dateFin, boolean isTest) throws NumberFormatException, IOException{
		String logPath = "./LOG/";
		int total = 0;
		//On d�finie nos constante
		final int RECETTE_DATE = 0;
		final int RECETTE_MONTANT = 1;
		final String COMMA_DELIMITER = ",";
		final String NEW_LINE_SEPARATOR = "\n";
		String csvFile = logPath+"recette.csv";
		if (isTest) {
			csvFile = logPath+"recette_test.csv";
		}
		String strDateDebut = String.valueOf(dateDebut.getDay())+":"+String.valueOf(dateDebut.getMonth())+":"+String.valueOf(dateDebut.getYear());
		String strDateFin = String.valueOf(dateFin.getDay())+":"+String.valueOf(dateFin.getMonth())+":"+String.valueOf(dateFin.getYear());
		BufferedReader fileReader = null;
		try {
			String line = "";
			File fRecette = new File(csvFile);
			fileReader = new BufferedReader(new FileReader(fRecette));

			//Lit le fichier ligne par ligne
			while ((line = fileReader.readLine()) != null) {
				//Prend tout les champs de la ligne en cours de lecture
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
		//Affichage pour le client
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

}
