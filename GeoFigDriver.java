
public class GeoFigDriver {

	
	 public static void main(String[] args ){
		 
		 GeoFig r1  = new Rectangle( "red", 6.7, 3.4 );
		 GeoFig c1 = new Triangle( "Pink", 7.6 );
		 
		 System.out.println( "Area of rectangle is " + r1.findArea() );
		 
		 printInfo( r1 );
		 printInfo( c1 );
		 
		 
	 }// end method
	 
	 public static void printInfo( GeoFig myfig ){
		 
		
		 
		 System.out.println( "Information about figure " + myfig.figType() );
		 System.out.println( "Color is " + myfig.getColor() );
		 System.out.println( "Area of figure is " + myfig.findArea() );
		 System.out.println( "Perimeter of figure is " + myfig.findPerim() );
		 
	 }
}
