public class Ampoule {
	private int couleur;
	private int puissance;

	public Ampoule() {
		this.puissance = 100;
		this.couleur = 19;

	}

	public Ampoule(int couleur, int puissance) {
		this.couleur = couleur;
		this.puissance = puissance;
	}
	public Ampoule(Ampoule a) {
		this.couleur = a.getCouleur();
		this.puissance = a.getPuissance();
	}

	public void allumer() {
		System.out.println("Allumer: +"+puissance+"lm "+"à "+couleur+"k");
	}

	public void eteindre() {
		System.out.println("Eteindre: -"+puissance+"lm "+"à "+couleur+"k");
	}

	public int getCouleur() {
		return this.couleur;

	}

	public void setCouleur(int couleur) {
		this.couleur=couleur;
	}

	public int getPuissance() {
		return this.puissance;

	}

	public void setPuissance(int puissance) {
		this.puissance=puissance;
	}

	public String toString() {
		return "lampe a  "+puissance+"lm"+"et couleur a "+couleur+"k";
	}
}
