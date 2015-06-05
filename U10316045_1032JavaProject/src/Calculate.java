import java.awt.*;
import java.awt.event.*;
import java.io.PrintStream;

import javax.swing.*;

public class Calculate extends JPanel{
		double years,weight,height;
		int genderNum = 0;
		int YearOld ;
		double weightNum;
		double heightNum;
	
	public Calculate(){
		String[] situation = {"躺著不動一整天","辦公室坐整天","輕度活動","中度活動","重度活動"};
		
		final JLabel gender = new JLabel("我是誰？");
		JLabel men = new JLabel("男 ");
		JLabel women = new JLabel("女 ");
		JLabel cal = new JLabel("大卡");
		final JLabel fit = new JLabel("穠纖合度");
		
		JRadioButton menbutton = new JRadioButton();
		JRadioButton womenbutton = new JRadioButton();
		
		JComboBox sportSituation = new JComboBox(situation);
		
		final JTextField TextYears = new JTextField(15);
		final JTextField TextWeight = new JTextField(15);
		final JTextField TextHeight = new JTextField(15);
		final JTextField TextBMI = new JTextField(15);
		final JTextField TextgoodWeight = new JTextField(15);
		final JTextField TextBMR = new JTextField(15);
		
		JButton set = new JButton("SET");
		
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
		
		Object[] obj = {new JLabel("年齡 : "),new JLabel("體重 : "),new JLabel("身高 : "),
				new JLabel("BMI : "),new JLabel("標準體重 : "),new JLabel("基礎代謝率 : "),new JLabel("運動強度 : ")};
		
		for(int i = 1; i <= 7; i++){
			GridBagConstraints grid = new GridBagConstraints();
			grid.gridx = 0;
			grid.gridy = i;
			grid.gridheight = 1;
			grid.gridwidth = 3;
			grid.fill = GridBagConstraints.NONE;
			grid.anchor = GridBagConstraints.CENTER;
			add((Component) obj[i-1] ,grid);
		}
		
		int[] gy = {1,2,3,5};
		Object[] obj2 = {new JLabel("歲"),new JLabel("公斤"),new JLabel("公分"),new JLabel("公斤")};
		
		for(int i = 1; i <= 4; i++){
			GridBagConstraints grid2 = new GridBagConstraints();
			grid2.gridx = 10;
			grid2.gridy = gy[i-1];
			grid2.gridheight = 1;
			grid2.gridwidth = 3;
			grid2.fill = GridBagConstraints.NONE;
			grid2.anchor = GridBagConstraints.CENTER;
			add((Component) obj2[i-1] ,grid2);
		}
		
		GridBagConstraints yearsTextgrid = new GridBagConstraints();
		yearsTextgrid.gridx = 7 ;
		yearsTextgrid.gridy = 1 ;
		yearsTextgrid.gridheight = 1 ;
		yearsTextgrid.gridwidth = 3 ;
		yearsTextgrid.fill = GridBagConstraints.NONE;
		yearsTextgrid.anchor = GridBagConstraints.CENTER;
		add(TextYears,yearsTextgrid);
		
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
		
		
		GridBagConstraints weightTextgrid = new GridBagConstraints();
		weightTextgrid.gridx = 7 ;
		weightTextgrid.gridy = 2 ;
		weightTextgrid.gridheight = 1 ;
		weightTextgrid.gridwidth = 3 ;
		weightTextgrid.fill = GridBagConstraints.NONE;
		weightTextgrid.anchor = GridBagConstraints.CENTER;
		add(TextWeight,weightTextgrid);
		
		GridBagConstraints heightTextgrid = new GridBagConstraints();
		heightTextgrid.gridx = 7 ;
		heightTextgrid.gridy = 3 ;
		heightTextgrid.gridheight = 1 ;
		heightTextgrid.gridwidth = 3 ;
		heightTextgrid.fill = GridBagConstraints.NONE;
		heightTextgrid.anchor = GridBagConstraints.CENTER;
		add(TextHeight,heightTextgrid);
		
		GridBagConstraints TextBMIgrid = new GridBagConstraints();
		TextBMIgrid.gridx = 7 ;
		TextBMIgrid.gridy = 4;
		TextBMIgrid.gridheight = 1 ;
		TextBMIgrid.gridwidth = 3 ;
		TextBMIgrid.fill = GridBagConstraints.NONE;
		TextBMIgrid.anchor = GridBagConstraints.CENTER;
		add(TextBMI,TextBMIgrid);
		
		GridBagConstraints fitgrid = new GridBagConstraints();
		fitgrid.gridx =  10 ;
		fitgrid.gridy = 4 ;
		fitgrid.gridheight = 1 ;
		fitgrid.gridwidth = 4 ;
		fitgrid.anchor = GridBagConstraints.CENTER;
		add(fit,fitgrid);
		
		GridBagConstraints setBMIgrid = new GridBagConstraints();
		setBMIgrid.gridx =  13 ;
		setBMIgrid.gridy = 6;
		setBMIgrid.gridheight = 1 ;
		setBMIgrid.gridwidth = 1 ;
		setBMIgrid.anchor = GridBagConstraints.CENTER;
		add(set,setBMIgrid);
		
		GridBagConstraints TextgoodWeightgrid = new GridBagConstraints();
		TextgoodWeightgrid.gridx = 7 ;
		TextgoodWeightgrid.gridy = 5;
		TextgoodWeightgrid.gridheight = 1 ;
		TextgoodWeightgrid.gridwidth = 3 ;
		TextgoodWeightgrid.fill = GridBagConstraints.NONE;
		TextgoodWeightgrid.anchor = GridBagConstraints.CENTER;
		add(TextgoodWeight,TextgoodWeightgrid);
		
		GridBagConstraints TextBMRgrid = new GridBagConstraints();
		TextBMRgrid.gridx = 7 ;
		TextBMRgrid.gridy = 6;
		TextBMRgrid.gridheight = 1 ;
		TextBMRgrid.gridwidth = 3 ;
		TextBMRgrid.fill = GridBagConstraints.NONE;
		TextBMRgrid.anchor = GridBagConstraints.CENTER;
		add(TextBMR,TextBMRgrid);
		
		GridBagConstraints calgrid = new GridBagConstraints();
		calgrid.gridx =  12 ;
		calgrid.gridy = 6 ;
		calgrid.gridheight = 1 ;
		calgrid.gridwidth = 1 ;
		calgrid.anchor = GridBagConstraints.CENTER;
		add(cal,calgrid);
		
		//set BMi, BMR, suitable weight ActionListener
		set.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				weightNum = Double.parseDouble(TextWeight.getText());
				heightNum = Double.parseDouble(TextHeight.getText());
				YearOld = (int) Double.parseDouble(TextYears.getText());
				double bmiNUM = BMI(weightNum,heightNum);
				
				TextBMI.setText(String.valueOf(bmiNUM));
				TextgoodWeight.setText(String.valueOf(LowerSuitWeight(YearOld,heightNum))+" ~ "+String.valueOf(UpperSuitWeight(YearOld,heightNum)));
				TextBMR.setText(String.valueOf(BMR(weightNum, heightNum, YearOld, genderNum)));
					
				if(weightNum < LowerSuitWeight(YearOld,heightNum)){
					fit.setText("拒當紙片人");
				}
				else if(weightNum > UpperSuitWeight(YearOld,heightNum) && genderNum == 1){
					fit.setText("肥宅是你！"); 
				}
				else if(weightNum > UpperSuitWeight(YearOld,heightNum) && genderNum == 2){
					fit.setText("你是小腹婆~~~"); 
				}
				else{
					fit.setText("馬甲線/六塊肌");
				}
			}
		});
		
	}
	
	public int BMI(double weight, double height){//calculate BMI
		double heightOfMeter = height/100;
		double BMI = weight/(heightOfMeter*heightOfMeter);
		return (int)(BMI);
	}
	
	public int LowerSuitWeight(int year, double height){// calculate appropriate weight
		double suitbmi = 0;
		double heightOfMeter = height/100;
		double goodweight1;
		if(year <= 18){
			switch(year){
				case 2:
					suitbmi = 15.2;break;
				case 3:
					suitbmi = 14.8;break;
				case 4:
					suitbmi = 14.4;break;
				case 5:
					suitbmi = 14;break;
				case 6:
					suitbmi = 13.9;break;
				case 7:
					suitbmi = 14.7;break;
				case 8:
					suitbmi = 15;break;
				case 9:
					suitbmi = 15.2;break;
				case 10:
					suitbmi = 15.4;break;
				case 11:
					suitbmi = 15.8;break;
				case 12:
					suitbmi = 16.4;break;
				case 13:
					suitbmi = 17.0;break;
				case 14:
					suitbmi = 17.6;break;
				case 15:
					suitbmi = 18.2;break;
				case 16:
					suitbmi = 18.6;break;
				case 17:
					suitbmi = 19;break;
				case 18:
					suitbmi = 19.2;break;
			}
			goodweight1 = suitbmi*Math.pow((heightOfMeter), 2);
		}
		else{
			goodweight1 = 18.5*Math.pow((heightOfMeter), 2);
		}
		return (int)(goodweight1);
		
	}
	
	public int UpperSuitWeight(int year, double height){
		double suitbmi = 0;
		double heightOfMeter = height/100;
		double goodweight2 = 0;
		if(year <= 18){
			switch(year){
				case 2:
					suitbmi = 17.7;break;
				case 3:
					suitbmi = 17.7;break;
				case 4:
					suitbmi = 17.7;break;
				case 5:
					suitbmi = 17.7;break;
				case 6:
					suitbmi = 17.9;break;
				case 7:
					suitbmi = 18.6;break;
				case 8:
					suitbmi = 19.3;break;
				case 9:
					suitbmi = 19.7;break;
				case 10:
					suitbmi = 20.3;break;
				case 11:
					suitbmi = 21;break;
				case 12:
					suitbmi = 21.5;break;
				case 13:
					suitbmi = 22.2;break;
				case 14:
					suitbmi = 22.7;break;
				case 15:
					suitbmi = 23.1;break;
				case 16:
					suitbmi = 23.4;break;
				case 17:
					suitbmi = 23.6;break;
				case 18:
					suitbmi = 23.7;break;
			}
			goodweight2 = suitbmi*Math.pow((heightOfMeter), 2);
		}
		else{
			goodweight2 = 24*Math.pow((heightOfMeter), 2);
		}
		
		return (int)(goodweight2);
	}
	
	public int BMR(double weight, double height, int year, int gender){
		int BMR = 0;
		if(gender == 1){
			BMR = (int) ((13.7*weight)+(5.0*height)-(6.8*year)+66) ;
		}
		else{
			BMR = (int)((9.6*weight)+(1.8*height)-(4.7*year)+655);
		}
		
		return BMR;
	}
	
	
}
