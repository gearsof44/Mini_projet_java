/**
 * @author GUILLET & COTTREL
 *
 */

public class Client {

	private String nom;
	private String prenom;
	private String adresse;
	private String numTel;
	
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
	
	/**
	 * @param nom
	 * @param prenom
	 * @param adresse
	 * @param numTel
	 */
	public Client(String nom, String prenom, String adresse, String numTel) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.numTel = numTel;
	}
}
