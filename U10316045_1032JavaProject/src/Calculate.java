import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculate extends JPanel{
		double years,weight,height;
		double BMI;
	
	public Calculate(){
		JLabel men = new JLabel("男");
		JLabel wemen = new JLabel("女");
		JLabel years = new JLabel("年齡 ： ");
		JLabel weight = new JLabel("體重 ： ");
		JLabel height = new JLabel("身高 ： ");
		JLabel years2 = new JLabel("歲");
		JLabel weight2 = new JLabel("公斤");
		JLabel height2 = new JLabel("公分");
		
		JRadioButton menbutton = new JRadioButton();
		JRadioButton wemenbutton = new JRadioButton();
		
		JTextField TextYears = new JTextField(15);
		JTextField TextWeight = new JTextField(15);
		JTextField TextHeight = new JTextField(15);
		
	}
	
	public double BMI(double weight,double height,double BMI){
		return BMI = weight/Math.pow((height/100), 2);
	}
	
}
