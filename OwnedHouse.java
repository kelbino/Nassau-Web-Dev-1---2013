
public class OwnedHouse extends House {
	
	private Money costperfoot;
	private Money taxamt;
	
	public OwnedHouse( int l, int w, int n, Money c, Money t){

		super( l, w, n );
		this.costperfoot = c;
		this.taxamt = t;
		
	}
	
	public OwnedHouse(){
		
		super();
		this.costperfoot = new Money( "$1.00" );
		this.taxamt = new Money( "$8000.00");
				
	}
	
	public Money getCostPerFoot() {
		
		return this.costperfoot;
				
	}
	
	public Money getTaxAmt() {
		
		return this.taxamt;		
		
	}
	
	public Money computeCost() {
		
		return this.costperfoot.multiplyMoney(this.findArea() ).addMoney(this.taxamt);
		       /*                money                        */
	}
	
}
