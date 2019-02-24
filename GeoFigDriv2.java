
public class GeoFigDriv2 {

	public static void main( String[] args){
		
		GeoFig fig1 = new Circle( "Mauve", 5.6 );
		GeoFig fig2 = new Rectangle( "Polka Dot", 2.3, 4.5 );
		GeoFig fig3 = new Cylinder( "Blue", 4.5, 2.3 );	
		
		//find the figure with the largest area
		
		GeoFig maxarea1 = compFigA( fig1, fig2 );
		GeoFig maxarea2 = compFigA( maxarea1, fig3);
		
		System.out.println(fig1);
		System.out.println(fig2);
		System.out.println(fig3);
		
		
	}// ends method

	
	public static GeoFig compFigA( GeoFig f1, GeoFig f2 ){
		
		if( f1.findArea() > f2.findArea() ){
			
			return f1;
			
		}
		else {
			
			return f2;
			
		}// ends if statement
		
		
	}// ends compFigA method
	
	
	
	
	
	
}//ends class



