import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculate extends JPanel{
		double years,weight,height;
		double BMI;//18.5~24
	
	public Calculate(){
		JLabel men = new JLabel("男 ");
		JLabel wemen = new JLabel("女 ");
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
		
		setLayout(new GridBagLayout());
		
		
		GridBagConstraints mengrid = new GridBagConstraints();
		mengrid.gridx = 0 ;
		mengrid.gridy = 0 ;
		mengrid.gridheight = 1 ;
		mengrid.gridwidth = 1 ;
		mengrid.weightx = 0;
		mengrid.weighty = 0;
		mengrid.fill = GridBagConstraints.NONE;
		mengrid.anchor = GridBagConstraints.CENTER;
		add(men,mengrid);
		
		GridBagConstraints menbuttongrid = new GridBagConstraints();
		menbuttongrid.gridx = 1 ;
		menbuttongrid.gridy = 0 ;
		menbuttongrid.gridheight = 1 ;
		menbuttongrid.gridwidth = 2 ;
		menbuttongrid.weightx = 0;
		menbuttongrid.weighty = 0;
		menbuttongrid.fill = GridBagConstraints.NONE;
		menbuttongrid.anchor = GridBagConstraints.CENTER;
		add(menbutton,menbuttongrid);
		
		GridBagConstraints wemengrid = new GridBagConstraints();
		wemengrid.gridx = 4 ;
		wemengrid.gridy = 0 ;
		wemengrid.gridheight = 1 ;
		wemengrid.gridwidth = 1 ;
		wemengrid.fill = GridBagConstraints.NONE;
		wemengrid.anchor = GridBagConstraints.CENTER;
		add(wemen,wemengrid);
		
		GridBagConstraints wemenbuttongrid = new GridBagConstraints();
		wemenbuttongrid.gridx = 5 ;
		wemenbuttongrid.gridy = 0 ;
		wemenbuttongrid.gridheight = 1 ;
		wemenbuttongrid.gridwidth = 2 ;
		wemenbuttongrid.fill = GridBagConstraints.NONE;
		wemenbuttongrid.anchor = GridBagConstraints.CENTER;
		add(wemenbutton,wemenbuttongrid);
		
		GridBagConstraints yearsgrid = new GridBagConstraints();
		yearsgrid.gridx = 0 ;
		yearsgrid.gridy = 1 ;
		yearsgrid.gridheight = 1 ;
		yearsgrid.gridwidth = 3 ;
		yearsgrid.fill = GridBagConstraints.NONE;
		yearsgrid.anchor = GridBagConstraints.CENTER;
		add(years,yearsgrid);
		
		
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
