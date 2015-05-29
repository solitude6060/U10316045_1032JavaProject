import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainPlace extends JFrame {
	
	private Calculate basic = new Calculate(); 
	
	public MainPlace(){
		add(basic);
	}
	
	

	/** Main method */
	public static void main(String[] args) {
		JFrame frame = new MainPlace();
		frame.setTitle("°·±d´î­«¤pÀ°¤â");
		frame.setSize(450, 350);
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	
}
