
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
	
	if( payamt.compareMoney(this.balance)== true ){
		
		
	}
	
public abstract Money chargeCard();
	
	

	
}


public String toString(){
	
	
	return;

	
}

	
}
