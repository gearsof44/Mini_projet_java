
public class LitMecanise extends TableEtLit{
	private int degreInclinaison;

	public LitMecanise(int ref, String marque, String modele, double prixLocationJour, int nbStock, int poidsMax,
			String longueur, String largeur, String hauteur, int degreInclinaison) {
		super(ref, marque, modele, prixLocationJour, nbStock, poidsMax, longueur, largeur, hauteur);
		this.degreInclinaison = degreInclinaison;
	}

	public int getDegreInclinaison() {
		return degreInclinaison;
	}

	public void setDegreInclinaison(int degreInclinaison) {
		this.degreInclinaison = degreInclinaison;
	}

}
