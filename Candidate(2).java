
public class Candidate {
	//first declare instance variables
			
	private String name;
	private Vote numVotes; //keeps track of votes received by candidates <--- is object of vote class
		
	
	
	//second create constructor/parameterized constructor
				
	public Candidate( String n){
		
		this.name = n;
		this.numVotes = new Vote();
				
	}
	
	
	//third create default variable
	
	public Candidate(){
		
		this.name = "";
		this.numVotes = new Vote();//shouldn't this call "Vote()"?
		
		
	}
	
	
	
	
	
	
	
	//fourth create getter method
	
	public String getName(){
		
		return this.name;
		
	}
	
	public int getNumVotes(){
		
		return this.numVotes.getVote();
						
	}
	
	
	
		
	//does calculation
	
	
	public void addVotes(){ //this should call the "incrementCount() method and return the results
		
		this.numVotes.incrementCount();
		
		
		
		
		
		
	}
	
	
	public void removeVotes(){
		
		this.numVotes.decrementCount();
		
		
		
		
	}
	
	
	
	//String that outputs results

	public String toString(){//shouldn't this refer to the original toString from the Vote class?
		
		return  name + " recieved " + this.numVotes.toString();
		
		
		
	}
	






}
