
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// dans un programme principal
		Point p = new Point() ;
		// quelles sont les valeurs de p.x et de p.y
		Point p1 = new Point(0, 3) ;
		// quelles sont les valeurs de p1.x et de p1.y
		Point p2 = new Point(0,0) ;

		// Distance
		double d = p1.distance(4,12) ;
		// d contient 9,85
		System.out.println("La distance entre p1 et (4,12) = " + d) ;

		// Distance entre p et p2
		double d1 = p.distance(p2) ;
		System.out.println("La distance entre p et p2 = " + d1) ;
		
		Cercle cercle1 = new Cercle(15);
        double surf1= cercle1.surface();
        System.out.println("la surface est "+ surf1);
        Point point1 = new Point (10,10);
        Cercle cercle2=new Cercle(10,point1);
        
        boolean appartient = cercle2.recherche(p2);
        	if (appartient == true) {
        		System.out.println("le point p2 appartient au cercle2");
        	} else {
        		System.out.println("le point p2 n'appartient pas au cercle2");
        	}
	}// fin de main

} // fin de la classe
