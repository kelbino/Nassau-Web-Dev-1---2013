//import commands go here
//we can import additional java libraries
//to give java adavnced capabilities and features
import javax.swing.*;

public class ComputePay {

		public static void main(String[] args) {
			
			//create variables, remember, data types matter
			String empname = JOptionPane.showInputDialog("Enter employee name");
				int hours = Integer.parseInt( JOptionPane.showInputDialog("Enter hours worked ") );
				double payrate = Double.parseDouble( JOptionPane.showInputDialog("Enter payrate") );
				
				double totalpay = hours * payrate;
				
				String msg = "Employee name is " + empname + "\n";
				msg += "pay rate is $" + payrate + "\n";
				msg += "Hours worked is " + hours + "\n";
				msg += "Total pay is $" +  totalpay;

				//test for amt of work hours
				if(hours >= 40 ) {
					
					msg += "\n\nYou need a vacation.";
				}
				else {
					msg += "\n\nGood for you, time for some fun";
				}
				
				
				
				
				// print output
				JOptionPane.showMessageDialog( null,  msg );
		}
}
