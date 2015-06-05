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
/*
活動係數 1 ==>基礎代謝量（躺著不動一整天）
活動係數 1.2 ==>辦公室坐整天型（幾乎很少或沒運動）
活動係數 1.375==>輕度活動型（每週運動1-2次）
活動係數 1.55==>中度運動型（每週運動3到5次）
活動係數 1.725==>重度運動型（每週運動6-7次）
活動係數 1.9==>體力勞動型（每天重度運動或重勞力工作者）

*/