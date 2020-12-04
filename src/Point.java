
public class Point {
	// les attributs

    /**
     *  attribut x, abscisse du point
     */
	private double x;
	/**
     * attribut y : ordonn�es du point
     */
	private double y;

    // les constructeurs.

    /**
     * constructeur par d�faut d'un point. initialise les attribut au coordonn�es 0;0
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
     * constructeur de point utilisant des coordonn�es
     * @param a valeur de l'abscisse du point
     * @param b valuer de l'ordonn�e du point
     */
	public Point (double a, double b) {
		this.x = a;
		this.y = b;
	}

    // les m�thodes

    /**
     * m�thode de calcul de la distance entre le point et un point de coordonn�e a et b
     * @param a abscisse du point dont on calcule l'�loignement
     * @param b ordonn�e du point dont on calcule l'�loignement
     * @return la distance calcul�e
     */


	public double distance (double a, double b) {
		double resultat = 0.0;
		// je ne sais pas calculer, mais je sais cr�er une m�thode qui compile
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