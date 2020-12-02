
public class Rectangle {
	//d�claration des attributs
		private Point pointBasGauche;
		private double longueur;
		private double hauteur;

		//constructeurs
		public Rectangle() {
			this.longueur = 1;
			this.hauteur = 1;
			this.pointBasGauche = new Point(0,0);
		}
	   public Rectangle(Point bg, double i, double h) {
		   this.pointBasGauche = bg;
		   this.longueur = 1;
		   this.hauteur = 1;   
	   }
	   public Rectangle(Point bg, Point hd) {
		   this.pointBasGauche = bg;
		   this.longueur = hd.getX() - bg.getX();
		   this.hauteur = hd.getY() - bg.getY();
	   }
	   
	     //les m�thodes
	   public double perimetre() {
			double peri=0;
				peri = 2 * (this.longueur+this.hauteur);
			return peri;
		}
	   
	   public double surface() {
			double surf= 0;
			   surf = this.longueur * this.hauteur * 2;
			  return surf;	
		}
	   public Point pointBasGauche() {
			Point resultat = null;
			resultat = pointBasGauche;		
			return resultat;
		}
	   public Point pointHautDroit() {
	       Point hd = null;
	   /*
	    *  m�thode un avec 2 variables locales hdx et hdy permettant de stocker les valeur 
	    *  des composantes calcul�es du point
	    */
	       double hdx =this.pointBasGauche.getX() + this.longueur ;
	       double hdy = this.pointBasGauche.getY() + this.hauteur;
	       hd = new Point(hdx, hdy);
	   /*
	    * m�thode directe qui ne passe aps par des variables locales.
	    */
	       hd = new Point(this.pointBasGauche.getX() + this.longueur,
	               this.pointBasGauche.getY() + this.hauteur);
	       return hd; }
	       
	    public Point pointBasDroit() {
	           Point bd = null;
	       /*
	        *  m�thode un avec 2 variables locales hdx et hdy permettant de stocker les valeurs 
	        *  des composantes calcul�es du point
	        */
	           double hdx =this.pointBasGauche.getX() + this.longueur ;
	           double hdy = this.pointBasGauche.getY() + this.hauteur;
	           bd = new Point(hdx, hdy);
	       /*
	        * m�thode directe qui ne passe aps par des variables locales.
	        */
	           bd = new Point(this.pointBasGauche.getX() + this.longueur,
	                   this.pointBasGauche.getY() + this.hauteur);
	           return bd; 
	   }
	    public Point pointHautGauche() {
	        double phdx = 0.0;
	        double phdy = 0.0;
	        Point phd = null;
	        phdy=pointBasGauche.getX();
	        phdy=pointBasGauche.getY()+this.hauteur;
	        phd=new Point(phdx,phdy);
	        return phd;
	    }
}
