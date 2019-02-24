
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
		
		String msg = "Figure type: " + this.figType() + "\n";
		msg+= "Area of figure: " + this.findArea() + "\n";
		msg+= "Color of figure: " + this.getColor() + "\n";
		
		if( this instanceof Cylinder /* is reference of what "this" is an instanceof */){
			msg+= "Volume of figure: " + ((Cylinder)this).findVolume() + "\n";
	}
		else{
			msg+= "Perimiter of figure: " + this.findPerim() + "\n";
	}
		
		
		return msg;
		
		
		
	}
		
		
		
		
	
	
	
	
	
	
}
