
public class DVDdriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		DVD dvd1 = new DVD("Star Wars", "Action", new Money( "$14.99" ) );
		DVD dvd2 = new DVD();
		
		System.out.println( dvd1 );
		System.out.println( "\n" + dvd2 );
		
		
	}

}
