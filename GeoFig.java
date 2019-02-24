
public abstract class GeoFig {

	//first instance variable
	private String color;
	
	//Parameterized constructor
	public GeoFig( String c ){
		
		this.color = c;
		
	}
	
	//default constructor
	public GeoFig(){
		
		this("Clear");
		
		
	}
	
	//getter method
	public String getColor(){
		
		return this.color;
	}
	
	//instance methods
	
	public abstract double findArea(); /*abstract method - doesn't have 
	enough information to fill in
	
	when a sub class is created the abstract method must be overwritten
	
	*/
	
	public abstract double findPerim();
	
	public abstract String figType();
	
	public String toString() {
		
		return "Figure has an area of " + this.findArea() + "\nFigure has a color of " + this.getColor();
		
	}
		
		
		
		
	
	
	
	
	
	
}
