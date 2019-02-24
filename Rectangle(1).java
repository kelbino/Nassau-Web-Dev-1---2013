
public class Rectangle extends GeoFig{

	private double length;
	private double width;
	
	public Rectangle( String c, double l, double w ){
		
		super( c );
		this.length = l;
		this.width = w;
			
	}
	
	public Rectangle() {
		
		this( "Green", 2.0, 1.0 );
		
	}

		
	public double getWidth() {
		
		return this.width;
		
	}
	
	
	public double getLength() {
		
		return this.length;
		
	}
	
	
	public String figType(){
		
		return "Rectangle";
		
	}
	
	public double findArea() {
		
		return this.length * this.width;
		
	}
	
	public double findPerim() {
		
		return 2 * (this.length + this.width );
		
		
	}
	
	
	
}



