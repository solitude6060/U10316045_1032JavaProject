import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculate extends JPanel{
		double years,weight,height;
		double BMI;//18.5~24
	
	public Calculate(){
		JLabel men = new JLabel("男");
		JLabel wemen = new JLabel("女");
		JLabel years = new JLabel("年齡 ： ");
		JLabel weight = new JLabel("體重 ： ");
		JLabel height = new JLabel("身高 ： ");
		JLabel years2 = new JLabel("歲");
		JLabel weight2 = new JLabel("公斤");
		JLabel height2 = new JLabel("公分");
		JLabel goodweight = new JLabel("標準體重 ： ");
		JLabel weight3 = new JLabel("公斤");
		
		JRadioButton menbutton = new JRadioButton();
		JRadioButton wemenbutton = new JRadioButton();
		
		JTextField TextYears = new JTextField(15);
		JTextField TextWeight = new JTextField(15);
		JTextField TextHeight = new JTextField(15);
		JTextField TextgoodWeight = new JTextField(15);
		
		
	}
	
	public double BMI(double weight,double height,double BMI){//calculate BMI
		return BMI = weight/Math.pow((height/100), 2);
	}
	
	public void SuitWeight(double BMI){// calculate appropriate weight
		double goodweight1 = 18.5*Math.pow((height/100), 2);
		double goodweight2 = 24*Math.pow((height/100), 2);
		System.out.printf("%d ~ %d",goodweight1,goodweight2);
	}
	
}
