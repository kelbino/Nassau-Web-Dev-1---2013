
public class Cylinder extends Circle {
	
	private double length;
	
	public Cylinder( String c, double r, double l ) {
		
		super( c, r );
		this.length = l;
		
	}
		public Cylinder() {
			
			this( "Blank", 1.0, 1.0 );
			
			
		}
		
		public double getLength(){
			
			return this.length;
			
		}
		
		//override figType() method
		public String figType() {
			
			return "Cylinder";
			
		}
		
		public double findArea() {
			
			return super.findPerim() * this.length + 2 * super.findArea();
			
		}
		
		public double findVolume() {
			
			
			return super.findArea() * this.length;
			
		}
		
		
		
		
	}
	
	
	
	
	
	


