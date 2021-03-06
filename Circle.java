
public class Circle extends GeoFig {
	
	private double radius;
	
	public Circle( String c, double r ){
		
		super( c );
		this.radius = r;
		
	}
	
	public Circle() {
		
		this( "Blue", 1.0 );		
		
	}
	
	public String figType(){
		
		return "Triangle";
		
	}
	
	public double getRadius(){
		
		return this.radius;
		
	}

	public double findArea() {
		
		return Math.PI * Math.pow( this.radius,  2 );
		
		
	}
	
	public double findPerim() {
		
		return 2 * Math.PI *this.radius;
				
	}
	
	
	
}
