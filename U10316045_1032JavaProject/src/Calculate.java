import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculate extends JPanel{
		double years,weight,height;
		//double BMI;//18.5~24
		int genderNum = 0;
		int YearOld ;
		double weightNum;
		double heightNum;
	
	public Calculate(){
		final JLabel gender = new JLabel("我是誰？");
		JLabel men = new JLabel("男 ");
		JLabel women = new JLabel("女 ");
		JLabel years = new JLabel("年齡 ： ");
		JLabel weight = new JLabel("體重 ： ");
		JLabel height = new JLabel("身高 ： ");
		JLabel years2 = new JLabel("歲");
		JLabel weight2 = new JLabel("公斤");
		JLabel height2 = new JLabel("公分");
		JLabel bmi = new JLabel("ＢＭＩ : ");
		JLabel goodweight = new JLabel("標準體重 ： ");
		JLabel weight3 = new JLabel("公斤");
		
		JRadioButton menbutton = new JRadioButton();
		JRadioButton womenbutton = new JRadioButton();
		
		final JTextField TextYears = new JTextField(15);
		final JTextField TextWeight = new JTextField(15);
		final JTextField TextHeight = new JTextField(15);
		final JTextField TextBMI = new JTextField(15);
		final JTextField TextgoodWeight = new JTextField(15);
		
		JButton setBMI = new JButton("SET");
		
		setLayout(new GridBagLayout());
		
		
		GridBagConstraints mengrid = new GridBagConstraints();
		mengrid.gridx = 0 ;
		mengrid.gridy = 0 ;
		mengrid.gridheight = 1 ;
		mengrid.gridwidth = 1 ;
		mengrid.fill = GridBagConstraints.NONE;
		mengrid.anchor = GridBagConstraints.CENTER;
		add(men,mengrid);
		
		GridBagConstraints menbuttongrid = new GridBagConstraints();
		menbuttongrid.gridx = 1 ;
		menbuttongrid.gridy = 0 ;
		menbuttongrid.gridheight = 1 ;
		menbuttongrid.gridwidth = 2 ;
		menbuttongrid.fill = GridBagConstraints.NONE;
		menbuttongrid.anchor = GridBagConstraints.CENTER;
		add(menbutton,menbuttongrid);
		
		GridBagConstraints womengrid = new GridBagConstraints();
		womengrid.gridx = 4 ;
		womengrid.gridy = 0 ;
		womengrid.gridheight = 1 ;
		womengrid.gridwidth = 1 ;
		womengrid.fill = GridBagConstraints.NONE;
		womengrid.anchor = GridBagConstraints.CENTER;
		add(women,womengrid);
		
		GridBagConstraints womenbuttongrid = new GridBagConstraints();
		womenbuttongrid.gridx = 5 ;
		womenbuttongrid.gridy = 0 ;
		womenbuttongrid.gridheight = 1 ;
		womenbuttongrid.gridwidth = 2 ;
		womenbuttongrid.fill = GridBagConstraints.NONE;
		womenbuttongrid.anchor = GridBagConstraints.CENTER;
		add(womenbutton,womenbuttongrid);
		
		//radio button group
		ButtonGroup Group = new ButtonGroup();
		Group.add(menbutton);
		Group.add(womenbutton);
		
		GridBagConstraints gendergrid = new GridBagConstraints();
		gendergrid.gridx =  7 ;
		gendergrid.gridy = 0 ;
		gendergrid.gridheight = 1 ;
		gendergrid.gridwidth = 3 ;
		gendergrid.anchor = GridBagConstraints.CENTER;
		add(gender,gendergrid);
		
		//men button ActionListener
		menbutton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				genderNum = 1;//set gender =  men
				gender.setText("我是帥哥");
			}
		});
		//women button ActionListener
		womenbutton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				genderNum = 2;//set gender = women
				gender.setText("我是正咩");
			}
		});
		
		GridBagConstraints yearsgrid = new GridBagConstraints();
		yearsgrid.gridx = 0 ;
		yearsgrid.gridy = 1 ;
		yearsgrid.gridheight = 1 ;
		yearsgrid.gridwidth = 3 ;
		yearsgrid.fill = GridBagConstraints.NONE;
		yearsgrid.anchor = GridBagConstraints.CENTER;
		add(years,yearsgrid);
		
		GridBagConstraints yearsTextgrid = new GridBagConstraints();
		yearsTextgrid.gridx = 7 ;
		yearsTextgrid.gridy = 1 ;
		yearsTextgrid.gridheight = 1 ;
		yearsTextgrid.gridwidth = 3 ;
		yearsTextgrid.fill = GridBagConstraints.NONE;
		yearsTextgrid.anchor = GridBagConstraints.CENTER;
		add(TextYears,yearsTextgrid);
		
		GridBagConstraints years2grid = new GridBagConstraints();
		years2grid.gridx =  10 ;
		years2grid.gridy = 1 ;
		years2grid.gridheight = 1 ;
		years2grid.gridwidth = 1 ;
		years2grid.anchor = GridBagConstraints.CENTER;
		add(years2,years2grid);
		
		//Years TextField ActionListener
		TextYears.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				YearOld = (int) Double.parseDouble(TextYears.getText());
				if((genderNum == 1) && (YearOld <= 10 )){
					gender.setText("我是正太！");
				}
				else if((genderNum == 1) && (YearOld > 65 )){
					gender.setText("我是老爺爺");
				}
				else if((genderNum == 2) && (YearOld <= 10 )){
					gender.setText("我是可愛小蘿莉！");
				}
				else if((genderNum == 2) && (YearOld > 65 )){
					gender.setText("我是老奶奶");
				}
				else{
					if(genderNum == 1){
						gender.setText("我是帥哥");
					}
					else{
						gender.setText("我是正咩");
					}
				}
			}
		});
		
		GridBagConstraints weightgrid = new GridBagConstraints();
		weightgrid.gridx = 0 ;
		weightgrid.gridy = 2 ;
		weightgrid.gridheight = 1 ;
		weightgrid.gridwidth = 3 ;
		weightgrid.fill = GridBagConstraints.NONE;
		weightgrid.anchor = GridBagConstraints.CENTER;
		add(weight,weightgrid);
		
		GridBagConstraints weightTextgrid = new GridBagConstraints();
		weightTextgrid.gridx = 7 ;
		weightTextgrid.gridy = 2 ;
		weightTextgrid.gridheight = 1 ;
		weightTextgrid.gridwidth = 3 ;
		weightTextgrid.fill = GridBagConstraints.NONE;
		weightTextgrid.anchor = GridBagConstraints.CENTER;
		add(TextWeight,weightTextgrid);
		
		GridBagConstraints weight2grid = new GridBagConstraints();
		weight2grid.gridx =  10 ;
		weight2grid.gridy = 2 ;
		weight2grid.gridheight = 1 ;
		weight2grid.gridwidth = 1 ;
		weight2grid.anchor = GridBagConstraints.CENTER;
		add(weight2,weight2grid);
		
		GridBagConstraints heightgrid = new GridBagConstraints();
		heightgrid.gridx = 0 ;
		heightgrid.gridy = 3 ;
		heightgrid.gridheight = 1 ;
		heightgrid.gridwidth = 3 ;
		heightgrid.fill = GridBagConstraints.NONE;
		heightgrid.anchor = GridBagConstraints.CENTER;
		add(height,heightgrid);
		
		GridBagConstraints heightTextgrid = new GridBagConstraints();
		heightTextgrid.gridx = 7 ;
		heightTextgrid.gridy = 3 ;
		heightTextgrid.gridheight = 1 ;
		heightTextgrid.gridwidth = 3 ;
		heightTextgrid.fill = GridBagConstraints.NONE;
		heightTextgrid.anchor = GridBagConstraints.CENTER;
		add(TextHeight,heightTextgrid);
		
		GridBagConstraints height2grid = new GridBagConstraints();
		height2grid.gridx =  10 ;
		height2grid.gridy = 3 ;
		height2grid.gridheight = 1 ;
		height2grid.gridwidth = 1 ;
		height2grid.anchor = GridBagConstraints.CENTER;
		add(height2,height2grid);
		
		
		GridBagConstraints bmigrid = new GridBagConstraints();
		bmigrid.gridx = 0 ;
		bmigrid.gridy = 4 ;
		bmigrid.gridheight = 1 ;
		bmigrid.gridwidth = 3 ;
		bmigrid.fill = GridBagConstraints.NONE;
		bmigrid.anchor = GridBagConstraints.CENTER;
		add(bmi,bmigrid);
		
		GridBagConstraints TextBMIgrid = new GridBagConstraints();
		TextBMIgrid.gridx = 7 ;
		TextBMIgrid.gridy = 4;
		TextBMIgrid.gridheight = 1 ;
		TextBMIgrid.gridwidth = 3 ;
		TextBMIgrid.fill = GridBagConstraints.NONE;
		TextBMIgrid.anchor = GridBagConstraints.CENTER;
		add(TextBMI,TextBMIgrid);
		
		GridBagConstraints setBMIgrid = new GridBagConstraints();
		setBMIgrid.gridx =  12 ;
		setBMIgrid.gridy = 6 ;
		setBMIgrid.gridheight = 1 ;
		setBMIgrid.gridwidth = 1 ;
		setBMIgrid.anchor = GridBagConstraints.CENTER;
		add(setBMI,setBMIgrid);
		
		//set BMi
		setBMI.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				weightNum = Double.parseDouble(TextWeight.getText());
				heightNum = Double.parseDouble(TextHeight.getText());
				TextBMI.setText(String.valueOf(BMI(weightNum,heightNum)));
			}
		});
		
	}
	
	public double BMI(double weight,double height){//calculate BMI
		double heightOfMeter = height/100;
		double BMI = weight/(heightOfMeter*heightOfMeter);
		return BMI;
	}
	
	public void SuitWeight(double BMI){// calculate appropriate weight
		double goodweight1 = 18.5*Math.pow((height/100), 2);
		double goodweight2 = 24*Math.pow((height/100), 2);
		System.out.printf("%d ~ %d",goodweight1,goodweight2);
	}
	
}
