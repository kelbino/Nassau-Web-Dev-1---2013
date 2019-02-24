
public abstract class CreditCardAbstractClass {

	private String idNum;
	private Money balance;

	public CreditCardAbstractClass( String i, Money b ){

		this.idNum = "000000";


	}

	public CreditCardAbstractClass(){

		this.idNum = "000000";


	}

	public String getIDnum(){

		return this.idNum;

	}

	public Money getBalance(){

		return this.balance;

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

	public abstract Money chargeCard();







	public String toString(){


		return "ID number: " + this.idNum + "\n" + "Current balance: " + this.balance + "\n" ;


	}


}
