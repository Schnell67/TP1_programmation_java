
public class Cercle {
	// déclaration des attributs
	private Point centre;
	private double rayon;

	// constructeur
	public Cercle(double r) {
		// un constructeur initialise tous les attributs
		this.centre = new Point(0,0);
		this.rayon = r;
	}
	
	public Cercle(double r, Point c) {
		this.centre = c;
		this.rayon = r;
	}
	
	// les méthodes
	public double diametre() {
		double diam = 0.0;
			diam = 2 * this.rayon;
		return diam;
	}
	public double perimetre() {
		double peri=0.0;
			peri = 2 * Math.PI*this.rayon;
		return peri;
		
	}
	
	public double surface() {
		double surf = 0.0;
			surf = Math.PI * this.rayon * this.rayon;
		return surf;
	}
	
	public boolean intersection (Cercle cercle2) {
		boolean inter = false;
			if ((cercle2.centre.distance(this.centre)) <= this.rayon+ cercle2.rayon){
				inter = true;
			}
		return inter;
	}
	
	public boolean recherche(Point a) {
		boolean rech = false;
			if (this.centre.distance(a) <= this.rayon) {
			rech = true;
			}
		return rech;
	}
}
