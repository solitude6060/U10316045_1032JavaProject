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
		frame.setTitle("���d��p����");
		frame.setSize(520, 650);
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	
}

//�p�G�n��W������ - DISPOSE_ON_CLOSE
//�A���D�ܡH���T�����b���d����O�̭��n���I
//�A���D�ܡH����άO���@�˪�~��פ~�O����I
//�A���D�ܡH����M���V�f�t�~�঳�Ĵ�Τ��_�D�I
//�A���D�ܡH�έD�|�a�ӳ\�h�e�f�I