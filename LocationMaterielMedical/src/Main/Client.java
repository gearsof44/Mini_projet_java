package Main;
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
	
	/**
	 * @param nom
	 * @param prenom
	 * @param adresse
	 * @param numTel
	 */
	//constructeur
	public Client(int id,String nom, String prenom, String adresse, String numTel) {
		super();
		this.id=id;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.numTel = numTel;
	}
}
