
public class MasterCrook extends CreditCard {

	private Money servicefee;

	
	public MasterCrook( String i, Money b ){
		
		super( i, new Money());
		this.servicefee = b;
		
	}

	public MasterCrook(){
		
		super();
		this.servicefee = new Money( 5, 00 ); 
	}
	
	public Money getServiceFree() {
		
		return this.servicefee;
		
	}
	
	public void chargeCard( Money chargeamt) {
		
		super.setBalance(chargeamt);
		
		this.servicefee = this.servicefee.addMoney(chargeamt); 
		
	}
	
}
