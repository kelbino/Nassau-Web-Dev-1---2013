
public abstract class CreditCard {

	private String idNum;
	private Money balance;

	public CreditCard( String i, Money b ){

		this.idNum = i;


	}

	public CreditCard(){

		this.idNum = "000000";


	}

	public String getIDnum(){

		return this.idNum;

	}

	public Money getBalance(){

		return this.balance;

	}

	public void setBalance( Money s){
		
		this.balance = s;
		
		
		
	}
	

	public boolean payCard(Money payamt){

		if( payamt.compareMoney(this.balance)== 1 ){

			payamt.subtractMoney(this.balance);
			return true;
		}
		else{

			return false;

		}


	}

	public abstract void chargeCard( Money chargeamt );







	public String toString(){


		return "ID number: " + this.idNum + "\n" + "Current balance: " + this.balance + "\n" ;


	}


}
