
public class ExceptionSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1, num2;
		
		num1 = 12;
		num2 = 4;
		
		
		
		try { //if here an error is generates the error will be caught  by "catch"
			
		
			int ans = num1/ num2;
			System.out.println("Answer is " + ans);
		}
		
		catch (ArithmeticException e ) {
			
			System.out.println( "Sorry, cannot divide by zero" );
			
		}
		
		catch ( ClassCastException e ) {
			
			System.out.println( "Sorry, no casting" );
			
		}
		
		
	}

}
