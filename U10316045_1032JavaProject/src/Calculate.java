import java.awt.*;
import java.awt.event.*;
import java.io.PrintStream;

import javax.swing.*;

public class Calculate extends JPanel{
		private double years,weight,height;
		private int genderNum = 0;
		private int YearOld ;
		private double weightNum;
		private double heightNum;
	
	public Calculate(){
		
		//String array of JList
		String[] situation = {"躺著不動一整天","辦公室坐整天","輕度活動","中度活動","重度活動"};
		
		//JLabel
		final JLabel gender = new JLabel("我是誰？");
		final JLabel fit = new JLabel("穠纖合度");
		JLabel cal = new JLabel("大卡");
		
		//JRadioButton
		JRadioButton menbutton = new JRadioButton();
		JRadioButton womenbutton = new JRadioButton();
		
		//JList of people situation of action
		JList sportSituation = new JList(situation);
		JScrollPane sp = new JScrollPane(sportSituation);//put scroll into list 
		
		//JTextfield
		final JTextField TextYears = new JTextField(15);
		final JTextField TextWeight = new JTextField(15);
		final JTextField TextHeight = new JTextField(15);
		final JTextField TextBMI = new JTextField(15);
		final JTextField TextgoodWeight = new JTextField(15);
		final JTextField TextBMR = new JTextField(15);
		
		JButton set = new JButton("SET");
		
		setLayout(new GridBagLayout());
	
		int[] gx = {0,4};//gridx of JLabel men & women
		Object[] objL = {new JLabel("男 "),new JLabel("女 ")};//JLabel men & women
		
		//set JLabel grid
		for(int k =0; k < 2;k++){
			GridBagConstraints gendergrid = null;
			setLGrid((JLabel)objL[k],gendergrid,gx[k],0,1,1);
		}
		
		GridBagConstraints menbuttongrid = new GridBagConstraints();
		menbuttongrid.gridx = 1 ;
		menbuttongrid.gridy = 0 ;
		menbuttongrid.gridheight = 1 ;
		menbuttongrid.gridwidth = 2 ;
		menbuttongrid.fill = GridBagConstraints.NONE;
		menbuttongrid.anchor = GridBagConstraints.CENTER;
		add(menbutton,menbuttongrid);
		
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
		
		GridBagConstraints gendergrid = null;
		setLGrid(gender,gendergrid,7,0,1,3);
		
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
		
		//array to store JLabel
		Object[] obj = {new JLabel("年齡 : "),new JLabel("體重 : "),new JLabel("身高 : "),
				new JLabel("BMI : "),new JLabel("標準體重 : "),new JLabel("基礎代謝率 : "),new JLabel("運動強度 : ")};
		
		//set grid of JLabel
		for(int i = 1; i <= 7; i++){
			GridBagConstraints grid = null;
			setLGrid((JLabel) obj[i-1] ,grid,0,i,1,3);
		}
		
		//gridy
		int[] gy = {1,2,3,5};
		
		Object[] obj2 = {new JLabel("歲"),new JLabel("公斤"),new JLabel("公分"),new JLabel("公斤")};
		
		//set grid of Label
		for(int i = 1; i <= 4; i++){
			GridBagConstraints grid2 = null;
			setLGrid((JLabel) obj2[i-1] ,grid2,10,gy[i-1],1,3);
		}
		
		GridBagConstraints yearsTextgrid = null;
		setTGrid(TextYears,yearsTextgrid,7,1,1,3);
		
		//Years TextField ActionListener
		TextYears.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				YearOld = (int) Double.parseDouble(TextYears.getText());
				setGenderText(gender,YearOld,genderNum);
			}
		});
		
		
		GridBagConstraints weightTextgrid = null;
		setTGrid(TextWeight,weightTextgrid,7,2,1,3);
		
		GridBagConstraints heightTextgrid = null;
		setTGrid(TextHeight,heightTextgrid,7,3,1,3);
		
		GridBagConstraints TextBMIgrid =null;
		setTGrid(TextBMI,TextBMIgrid,7,4,1,3);
		
		GridBagConstraints fitgrid = null;
		setLGrid(fit,fitgrid,10,4,1,4);
		
		GridBagConstraints setBMIgrid = new GridBagConstraints();
		setBMIgrid.gridx =  13 ;
		setBMIgrid.gridy = 6;
		setBMIgrid.gridheight = 1 ;
		setBMIgrid.gridwidth = 1 ;
		setBMIgrid.anchor = GridBagConstraints.CENTER;
		add(set,setBMIgrid);
		
		GridBagConstraints TextgoodWeightgrid = null;
		setTGrid(TextgoodWeight,TextgoodWeightgrid,7,5,1,3);
		
		GridBagConstraints TextBMRgrid = null;
		setTGrid(TextBMR,TextBMRgrid,7,6,1,3);
		
		
		GridBagConstraints calgrid = null ;
		setLGrid(cal,calgrid,12,6,1,1);
		
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
					
				setFit(fit,YearOld,heightNum);
				
			}
		});
		//sportSituation
	}
	
	//set genderTextField method
	public void setGenderText(JLabel gender,int YearOld,int genderNum){
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
	
	//set grid of TextFeild method
	public void setTGrid(JTextField jtf, GridBagConstraints thegrid, int x, int y, int gheight, int gwidth){
		thegrid = new GridBagConstraints();
		thegrid.gridx = x ;
		thegrid.gridy = y;
		thegrid.gridheight = gheight;
		thegrid.gridwidth = gwidth;
		thegrid.fill = GridBagConstraints.NONE;
		thegrid.anchor = GridBagConstraints.CENTER;
		add(jtf,thegrid);
	}
	
	//set grid of Label method
	public void setLGrid(JLabel jbl, GridBagConstraints thegrid, int x, int y, int gheight, int gwidth){
		thegrid = new GridBagConstraints();
		thegrid.gridx = x ;
		thegrid.gridy = y;
		thegrid.gridheight = gheight;
		thegrid.gridwidth = gwidth;
		thegrid.fill = GridBagConstraints.NONE;
		thegrid.anchor = GridBagConstraints.CENTER;
		add(jbl,thegrid);
	}
	
	//set JLabel fit method
	public void setFit(JLabel fit,int YearOld,double heightNum){
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
	
	//calculate BMI method
	public int BMI(double weight, double height){
		double heightOfMeter = height/100;
		double BMI = weight/(heightOfMeter*heightOfMeter);
		return (int)(BMI);
	}
	
	// calculate appropriate weight method
	public int LowerSuitWeight(int year, double height){
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
	// calculate appropriate weight method
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
	
	//calculate BMR method
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
