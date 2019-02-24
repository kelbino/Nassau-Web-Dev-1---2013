import javax.swing.*;

public class Shapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Triangle t1 = new Triangle( 4.0, 5.0 );
	System.out.println( "Info about t1\n\n" + t1 );
	
	Triangle t2 = new Triangle();
	System.out.println( "Info about t2\n\n" + t2 );
	
	Triangle t3 = new Triangle( 4.5, 7.9);
	Circle c1 = new Circle( 1.2 );
	
	System.out.println( "Info about t3\n" + t3 );
	System.out.println( "Infor about c1\n\n" + c1 );
	
	
	if( t3.findArea() > c1.findArea() ) {
		
		System.out.println( "T3 triangle has the larger area \n");
	}
	else {
		
		System.out.println( "C1 corcle has the larger area \n");
	}
	
	Circle c4 = new Circle();
	System.out.println( "\nCircle c4 before change\n" + c4 );
	
	c4.color = "Yellow";
	System.out.println( "\nCircle c4 after change\n" + c4 );
	
	
	Circle c5 = new Circle( 5.1, "Black" );
	Circle c6 = new Circle( 4.2, "Blue" );
	
	if( c5.color.equals( c6.color ) == true ) {
		
		System.out.println( "\nColors are the same");
		
	}
	else{
		
		System.out.println( "\nColors aren't the same");
		
		
		
	}
	
		
	}

}
