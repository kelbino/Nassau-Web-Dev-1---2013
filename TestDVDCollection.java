
public class TestDVDCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DVDcollection mycollection = new DVDcollection( 3 );
		
		DVD dvd1 = new DVD( "Groundhogs Day", "Comedy", new Money("$9.99") );
		
		mycollection.addDVD( dvd1 );
		
		mycollection.addDVD( new DVD( "Malificent", "Drama", new Money( "18.99" ) ) );
		
		System.out.println( mycollection);
		

	}

}
