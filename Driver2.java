import javax.swing.*;

public class Driver2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double r = Double.parseDouble( JOptionPane.showInputDialog( "Enter circle radius") );
		String c = JOptionPane.showInputDialog( "Enter circle color" );
		
		
		Circle usercircle = new Circle( r, c );
		
				
		JOptionPane.showMessageDialog( null, usercircle.toString() );
		
		Circle myCircle = new Circle();
		Circle hisCircle = new Circle( 4.7);
		
		String msg = "His circle has a radius of " + hisCircle.radius + "\n";
		
		
		JOptionPane.showMessageDialog( null, myCircle.toString() );
		JOptionPane.showMessageDialog( null,  hisCircle.toString() );
		
		

	}
	

}
