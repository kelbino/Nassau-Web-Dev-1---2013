
public class RentalHouse extends House {
	
	private Money rentperfoot;
	private Money utilities;
	private Money maintenance;
	
	public RentalHouse( int l, int w, int n, Money r, Money u, Money m) {
		
		super(l, w, n);
		this.rentperfoot = r;
		this.utilities = u;
		this.maintenance = m;		
		
	}
	
	public RentalHouse() {
		
		super();
		this.rentperfoot = new Money( "$0.50");
		this.utilities = new Money( "135.00");
		this.maintenance = new Money( "75.00");
				
	}
	
	public Money getRent(){
		
		return this.rentperfoot;
	}
	
	public Money getUtilities() {
		
		return this.utilities;
	}
	
	public Money getMaintenance(){
		
		return this.maintenance;
		
	}
	
	public Money computeCost(){
		
		return this.rentperfoot.multiplyMoney(this.findArea() ).addMoney(this.utilities ).addMoney( this.maintenance);
	}
	
	
}
