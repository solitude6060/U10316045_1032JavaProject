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
		frame.setSize(520, 650);
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	
}

//如果要單獨關視窗 - DISPOSE_ON_CLOSE
//你知道嗎？正確飲食在健康減重中是最重要的！
//你知道嗎？減重跟減肥是不一樣的~體脂才是關鍵！
//你知道嗎？有氧和重訓搭配才能有效減肥不復胖！
//你知道嗎？肥胖會帶來許多疾病！