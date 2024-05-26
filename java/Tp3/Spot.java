public class Spot {
	Ampoule amp;
	Timer t;

	public Spot(Ampoule amp, Timer t) {
		this.amp = amp;
		this.t=t;

	}

	public Spot(int couleur, int puissance, double frequence) {
		this.amp= new amp.Ampoule(couleur,puissance);
		this.t= new t.Timer(frequence);
	}
	/*
	public Spot(Spot t) {

	}

	public void setFrequence(double frequence) {

	}

	public double getFrequence() {

	}

	public int getCouleur() {

	}

	public int getPuissance() {

	}

	public void allumer() {

	}

	public void eteindre() {

	}

	public void clignoter() {

	}

	public void clignoter(long duree) {

	}

	public String toString() {
		
	}*/
}
