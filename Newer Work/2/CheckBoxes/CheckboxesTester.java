//----------------------------------------------------
// Programmer:		dog-tor
// Date:		July 1, 2020
//----------------------------------------------------

import javax.swing.JFrame;

public class CheckboxesTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			// instantiate a frame
			// from the class JFrame
		JFrame frame = new JFrame("Fun wiht check boxes");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
			// the primary panel is added
			// to the frame and made visible
		frame.getContentPane().add(new CheckboxesGUI());
		frame.pack();
		frame.setVisible(true);
	}	// end method main

}	// end class CheckboxesTester