
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Circle c1 = new Circle( 50.0, "Red ");
		Circle c2 = new Circle( 36.5, "Purple");
		
		
		System.out.println( "The color of C1 is " + c1.color );
		System.out.println( "The color of C2 is " + c2.color );
		
		System.out.println( "The raduis of C1 is " + c1.radius );
		System.out.println( "The area of C2 is " + c1.findArea() );
		
		// determine which object has the greater area value
		
		if( c1.findArea() > c2.findArea() ) {
			
			System.out.println( "C1 has the larger area" );
			
		}
		else {
			
			System.out.println( "C2 has the larger area" );
		
			
			
		}
		
		Circle c3 = new Circle( 5.6, "Orange" );
		System.out.println( "the color of C3 is " + c3.color );
		System.out.println( "The area of C3 is " + c3.findArea() );
		System.out.println( "The circumference of C3 is " + c3.findCircumference() );
		
	}

}
