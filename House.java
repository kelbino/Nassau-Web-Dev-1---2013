
public abstract class House {
	//first instance variable
	private int length;
	private int width;
	private int numFloors;
	
	
	
	//Parameterized constructor
	public House( int l, int w, int n){
		
		this.length = l;
		this.width = w;
		this.numFloors = n;
				
	}
		
	//default constructor
	public House(){
		
		this( 110, 60, 3);
		
	}
		
	
	//getter method
	public int getLength(){
		
		return this.length;
		
	}
	
	public int getWidth(){
		
		return this.width;
		
	}
	
	public int numFloors(){
		
		return this.numFloors;
		
	}
		
	//instance methods
	
	public int findArea(){
		
		return this.length * this.width * this.numFloors;
	}
	
	public House compareHouse( House otherhouse ) {
		
		if(this.findArea() > otherhouse.findArea() )
			return this;
		else
			return otherhouse;
		
	}
	
	public abstract Money computeCost();
	
	
	//toString method
	
	public String toString(){
		
		return "House contains an Area of: " + findArea();
		
	}
	
	
	
}
