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
	public Location(ArrayList<Article> listeArticle, Date dateDebut, Date dateFin, double montantFacture, Client coordonneesClient) {
		this.listeArticle = listeArticle;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.montantFacture = montantFacture;
		this.coordonneesClient = coordonneesClient;
	}
	
	public void afficherLocation(){
		System.out.println("Identifiant"+getId());
		System.out.println("Client: "+getCoordonneesClient());
		System.out.println("Date de dÃ©but: "+getDateDebut());
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
		String strListeArticle = "Pas d'articles";
		for (Article art : listeArticle){
			strListeArticle += art.toString();
		}
 		return "Location [id=" + id + ", listeArticle=" + strListeArticle + ", dateDebut=" + dateDebut + ", dateFin="
 				+ dateFin + ", montantFacture=" + montantFacture + ", coordonneesClient=" + "nom : "+ coordonneesClient.getNom() + ", prenom : "+ coordonneesClient.getPrenom() +", num tel : "+ coordonneesClient.getNumTel() + "]";
 	}
	
	//Permet de parcourir le fichier recette afin d'afficher les gains
		//sur une periode donnee
		public void getMontantRecette(Date dateDebut, Date dateFin, boolean isTest) throws NumberFormatException, IOException{
			String logPath = "./LOG/";
			int total = 0;
			//On définie nos constante
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
		
		public void getMontantRecette(Date dateDebut, Date dateFin) throws NumberFormatException, IOException{
			getMontantRecette(dateDebut, dateFin, false);
		}
	
}
