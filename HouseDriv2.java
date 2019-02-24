
public class HouseDriv2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		House rental1 = new RentalHouse( 60, 30, 3, new Money( "$1.50"), new Money( "$100.00" ), new Money( "$350.00") );
		
		House rental2 = new RentalHouse();
		
		System.out.println( "Area of rental 1 is " + rental1.findArea() );
		System.out.println("To rent 1, you pay " + rental1.computeCost() );
		
		
	}

}
