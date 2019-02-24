
public class DishonestExpress extends CreditCard {

	private int interest;
	
	
	public DishonestExpress(String i, int t){
		
		super( i , new Money());
		this.interest = t;	
		
	}
	
	public DishonestExpress(){
		
		super();
		this.interest = 2;
		
	}
	
	public int getInterest(){
		
		return this.interest;
		
	}
	
	public void chargeCard( Money chargeamt ){
		
		chargeamt = chargeamt.multiplyMoney(interest); 
		
		super.setBalance(chargeamt.addMoney(getBalance()));
		
		
		
	}
	
}
