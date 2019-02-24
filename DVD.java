
public class DVD {

	private String title;
	private String genre;
	private Money cost;
	
	public DVD( String t, String g, Money c ){
		
		this.title = t;
		this.genre = g;
		this.cost = c;
		
		
	}
	
	public DVD(){
		
		this.title = "To be Determined";
		this.genre = "To be determined";
		this.cost = new Money();
			
		
	}
	
	
	public String getGenre(){
		
		return this.genre;
		
		
	}
	
	public Money getCost(){
		
		return this.cost;
				
			
	}
	
	public String toString() {
		
		String msg = "Title: " + this.title;
		msg += "\nGenre: " + this.genre;
		msg += "\nCost : " + this.cost;
		
		return msg;
			
		
	}
	
	
	
	
	
}
