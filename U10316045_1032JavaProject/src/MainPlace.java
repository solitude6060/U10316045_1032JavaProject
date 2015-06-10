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
		frame.setTitle("健康減重小幫手");
		frame.setSize(500, 400);
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	
}

//如果要單獨關視窗 - DISPOSE_ON_CLOSE