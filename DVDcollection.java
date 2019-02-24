
public class DVDcollection {

	private DVD[] collection;
	private int count;
	private Money totalcost;
	



	public DVDcollection( int size) {
		
		this.collection = new DVD[ size ];
		this.count = 0;
		this.totalcost = new Money();
		
		
	}
	
	public DVDcollection(){ //default 
		
		this( 50 );
		
		
	}
	
	public int getCount(){
		
		return this.count;
		
	}
	
	public Money getTotalCost() {
		
		return this.totalcost;
		
	}
	
	public void addDVD( DVD newdvd ){
		
		
		this.collection[ this.count ] = newdvd;
		this.count++;
		this.totalcost = this.totalcost.addMoney( newdvd.getCost() );
		
		
	}
	
	public String searchGenre( String genre){
		
		
		
		
	}
	
	
	public String toString(){
		
		String msg = "My DVD Collection\n*****************\n\n";
		msg += "Total DVDs is " + this.count + "\n";
		msg += "Total cost is " + this.totalcost + "\n\n";
		
		for( int i = 0; i < this.count ; i++ ){
			
			msg += this.collection[ i ] + "\n";
			
		}
		
		return msg;
		
		
	}
	
	
}//ends class
