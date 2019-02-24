
public class Vote {

	//first declare instance variables
			
	private int count;
	
	
	
	//second create constructor/parameterized constructor
	public Vote( int c ){
	
	this.count = c;
	
	}
	
	
	//third create default variable
	
	public Vote(){
		
	this.count = 0;
		
	}
	
	
	
	//fourth create getter method
	
	public int getVote(){
		
		return this.count;
		
	}
	
	
	
	
	
	//does calculation
	
	public void incrementCount(){
		
		this.count++;
		
			
		
	}
	
	
	public void decrementCount(){
		
		this.count--;
		
		
				
		
	}
	
	
	
	
	//toString that outputs results
	
	
	public String toString(){
		
		return this.count + " votes";
		
		
		
	}
	
	
	
	
	
	
}
