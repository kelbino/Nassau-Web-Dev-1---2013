
public class MoneyDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//lets create some money 
		
		Money monicaMoney =  new Money( 78, 43 );
		Money ericMoney = new Money( 102, 30 );
		Money brianMoney = new Money( 67, 07 );
		
		
		
		
		System.out.println( "Monica has " + monicaMoney );
		System.out.println( "Eric has " + ericMoney );
		System.out.println( "Brian has " + brianMoney );
		
		
		if( monicaMoney.compareMoney( new Money( 90 , 50) ) >= 0 ) {
			
			System.out.println( "\nMonica has enough funds to buy item ");
			
		}
		else {
			
			System.out.println( "\nMonica doesn't have enough funds to purchase the item \n" );
			
		}
		
		ericMoney = ericMoney.addMoney( new Money( 75, 23 ) );
		System.out.println( "Eric Now has " + ericMoney );
		
		monicaMoney = monicaMoney.subtractMoney(new Money (25, 00) );
		System.out.println( "Monica now has " + monicaMoney );
		
		brianMoney = brianMoney.addMoney( new Money ( 25, 00) );
		System.out.println( "Brian now has " + brianMoney );
		
		Money andrewMoney = new Money( 203, 98 );
		System.out.println( "Andrew has " + andrewMoney );
		
		andrewMoney = andrewMoney.addMoney(new Money( 15, 93 ) );
		System.out.println( "\nAndrew now has" + andrewMoney );
		
		ericMoney = ericMoney.subtractMoney(new Money( 15, 93 ) );
		System.out.println( "\nEric now has" + ericMoney );
		
		
		
		
	}

}
