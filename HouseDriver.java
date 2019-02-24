
public class HouseDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		House house1 = new House(60, 40, 2);
		
		System.out.println( house1 );
		
		House house2 = new House( 54, 45, 2);
		
		System.out.println( house2 );
		
		
		System.out.println( "Max house info: " + house1.compareHouse( house2 ) );
		
		
	}

}
