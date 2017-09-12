/**
 * 
 * @author GUILLET & COTTREL
 *
 */
public class Magasin {
	private String gerant;
	private String coordonnées;
	
	/**
	 * @param gerant
	 * @param coordonnées
	 */
	//Constructeur
	public Magasin(String gerant, String coordonnées) {
		super();
		this.gerant = gerant;
		this.coordonnées = coordonnées;
	}
	
	//getter setter

	public String getGerant() {
		return gerant;
	}
	public void setGerant(String gerant) {
		this.gerant = gerant;
	}
	public String getCoordonnées() {
		return coordonnées;
	}
	public void setCoordonnées(String coordonnées) {
		this.coordonnées = coordonnées;
	} 
	
}
