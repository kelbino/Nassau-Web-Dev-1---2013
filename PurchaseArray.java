import javax.swing.*;

public class PurchaseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
			String[] products = { "RAM", "Monitor", "Hard Drive", "Graphic Card", "Keyboard" };
			double[] prices = { 59.99, 200.99, 115.99, 550.99, 29.99 };
			int[] quantitylist = { 12, 15, 23, 5, 4};
			
			
			
			//construct the menu of products for the user
			String menumsg = "Select a product number\n\n";
			
			for( int i = 0; i < products.length; i ++ ) {
				
				menumsg += i + " - " + products[ i ] + " $" + prices [ i ] + "\n";
				
				}
	
			int menuchoice = Integer.parseInt( JOptionPane.showInputDialog( menumsg ) );
			int quantity = Integer.parseInt( JOptionPane.showInputDialog( "Enter amount of " + products[ menuchoice ] + " to buy." ) );
			
			
			//determine if we have enough in stock with the quantity with the value that is in the quantity array.
			if( quantitylist [ menuchoice ] < quantity ) {
				
				JOptionPane.showMessageDialog( null,  "Sorry only " + quantitylist[ menuchoice ] + " in stock");
				
			}
			else {
				//you finish this
				
							
				String msg = " Product name is " + products[ menuchoice ] + "\n";
				msg += "Quantity ordered is " + quantity + "\n";
				msg += "Price per item is $" + prices[ menuchoice ] + "\n";
				double total = prices[ menuchoice ] * quantity;
				msg += "Total cost of order is $" + total;
						
				JOptionPane.showMessageDialog(null,  msg );
				
			}
	
	
	
	}
	
	
		
		
		
		
	

}
