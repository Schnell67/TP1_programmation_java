
public class Point {
	// les attributs

    /**
     *  attribut x, abscisse du point
     */
	private double x;
	/**
     * attribut y : ordonnées du point
     */
	private double y;

    // les constructeurs.

    /**
     * constructeur par défaut d'un point. initialise les attribut au coordonnées 0;0
     */
	public Point() {

        /*
         * dans un constructeur, on initialise tous les attributs
         * 
         */
		this.x = 0 ;
		this.y = 0 ;
	}
	/**
     * constructeur de point utilisant des coordonnées
     * @param a valeur de l'abscisse du point
     * @param b valuer de l'ordonnée du point
     */
	public Point (double a, double b) {
		this.x = a;
		this.y = b;
	}

    // les méthodes

    /**
     * méthode de calcul de la distance entre le point et un point de coordonnée a et b
     * @param a abscisse du point dont on calcule l'éloignement
     * @param b ordonnée du point dont on calcule l'éloignement
     * @return la distance calculée
     */


	public double distance (double a, double b) {
		double resultat = 0.0;
		// je ne sais pas calculer, mais je sais créer une méthode qui compile
		resultat = Math.sqrt((x-a)*(x-a) +(y-b)*(y-b));
		return resultat;
	}
	public double distance(Point camarade) {
	    double resultat = 0.0;
	        
	    resultat = Math.sqrt((this.x-camarade.x)*(this.x-camarade.x) + (this.y-camarade.y)*(this.y-camarade.y));

	    return resultat;
	}
	
	public double getX() {
		double res = 0;
		res = this.x;
		return res;
	}
	public double getY() {
		double res = 0;
		res = this.y;
		return res;
	}
}