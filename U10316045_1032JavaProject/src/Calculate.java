import java.awt.*;
import java.awt.event.*;
import java.io.PrintStream;

import javax.swing.*;

public class Calculate extends JPanel{
		private double years,weight,height;
		private int genderNum = 0;
		private int actMode = 0;
		private int YearOld,wishkg ;
		private int LoseOrAdd = 0;
		private double weightNum;
		private double heightNum;
		
	
	public Calculate(){

		
		
		int[] gx = {0,4};//gridx of JLabel men & women
		int[] gy = {1,2,3,5};//gridy of unit
		
		//array to store JLabel		
		Object[] obj2 = {new JLabel("軍"),new JLabel("そょ"),new JLabel("そだ"),new JLabel("そょ")};//label of unit
		Object[] objL = {new JLabel("�k "),new JLabel("�k ")};//JLabel men & women
		Object[] objL2 = {new JLabel("�W�� "),new JLabel("喜�� ")};//JLabel
		Object[] obj = {new JLabel("�~綴 : "),new JLabel("悼�� : "),new JLabel("┃葵 : "),
				new JLabel("BMI : "),new JLabel("斜掲悼�� : "),new JLabel("芋側�N疎�v : "),new JLabel("�B以�j�� : "),new JLabel("�Cら旨呪�q : ")};
		
		//String array of JComboBox
		final String[] situation = {"叙吸ぃ以�@障ぱ","酔そ�認ぞ磴�","惨�廳＾�","い�廳＾�","���廳＾�","悼�O赫以��"};
		
		//JLabel
		final JLabel gender = new JLabel("и�O瞬�H");
		final JLabel fit = new JLabel("捉砥�X��");
		final JLabel wish = new JLabel("и�Q�n�H");
		JLabel cal = new JLabel("�j�d");
		JLabel cal2 = new JLabel("�j�d");
		JLabel cal3 = new JLabel("�j�d");
		JLabel kg = new JLabel("そょ");
		JLabel recommend = new JLabel("�慊慨遶�ぱ柴 : ");
		JLabel plan = new JLabel("�p�e�M囲");
		JLabel days = new JLabel("ぱ");
		JLabel heightCal = new JLabel("�Cら殻葵呪�q : ");
		JLabel Doyouknow = new JLabel("�A�捷D芹�H");
		JLabel knowledge = new JLabel("扱�d�p�`恥�I");
		
		//JButton
		JButton set = new JButton("SET");
		JButton display = new JButton("Display");
		
		//JRadioButton
		JRadioButton menbutton = new JRadioButton();
		JRadioButton womenbutton = new JRadioButton();
		JRadioButton loseweightbutton = new JRadioButton();
		JRadioButton addweightbutton = new JRadioButton();
		
		//JTextfield
		final JTextField TextYears = new JTextField(15);
		TextYears.setHorizontalAlignment(JTextField.RIGHT);
		final JTextField TextWeight = new JTextField(15);
		TextWeight.setHorizontalAlignment(JTextField.RIGHT);
		final JTextField TextHeight = new JTextField(15);
		TextHeight.setHorizontalAlignment(JTextField.RIGHT);
		final JTextField TextBMI = new JTextField(15);
		TextBMI.setHorizontalAlignment(JTextField.RIGHT);
		final JTextField TextgoodWeight = new JTextField(15);
		TextgoodWeight.setHorizontalAlignment(JTextField.RIGHT);
		final JTextField TextBMR = new JTextField(15);
		TextBMR.setHorizontalAlignment(JTextField.RIGHT);
		final JTextField Textconsump = new JTextField(15);
		Textconsump.setHorizontalAlignment(JTextField.RIGHT);
		final JTextField TextwishKg = new JTextField(5);
		TextwishKg.setHorizontalAlignment(JTextField.RIGHT);
		final JTextField Textrecommend = new JTextField(5);
		Textrecommend.setHorizontalAlignment(JTextField.RIGHT);
		final JTextField TextHeightCal = new JTextField(8);
		TextHeightCal.setHorizontalAlignment(JTextField.RIGHT);
		
		//JComboBox of people situation of action
		JComboBox sportSituation = new JComboBox(situation);
		JScrollPane sp = new JScrollPane(sportSituation);//put scroll into ComboBox 
		
		setLayout(new GridBagLayout());
		
		//set JLabel grid
		/*
		 *随詳�k�k�瑳佚�
		 */
		for(int k =0; k < 2;k++){
			GridBagConstraints LabelOfButtongrid = null;
			setLGrid((JLabel)objL[k],LabelOfButtongrid,gx[k],0,1,1);
			
			setLGrid((JLabel)objL2[k],LabelOfButtongrid,gx[k],11,1,1);
		}
		
		//set grid of JLabel
		/*
		 * 1~8��(�q�s�}�l)�瑳佚�
		 * 
		 */
		for(int i = 1; i <= 8; i++){
			GridBagConstraints grid = null;
			setLGrid((JLabel) obj[i-1] ,grid,0,i,1,4);
		}
		//恰��		
		//set grid of Unit Label
		for(int i = 1; i <= 4; i++){
			GridBagConstraints grid2 = null;
			setLGrid((JLabel) obj2[i-1] ,grid2,10,gy[i-1],1,3);
		}
				
		
		
		
		//set grid of button men
		GridBagConstraints menbuttongrid = new GridBagConstraints();
		menbuttongrid.gridx = 1 ;
		menbuttongrid.gridy = 0 ;
		menbuttongrid.gridheight = 1 ;
		menbuttongrid.gridwidth = 2 ;
		menbuttongrid.fill = GridBagConstraints.NONE;
		menbuttongrid.anchor = GridBagConstraints.CENTER;
		add(menbutton,menbuttongrid);
		
		//set grid of button women
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
		
		//set grid 
		GridBagConstraints addweightgrid = new GridBagConstraints();
		addweightgrid.gridx = 1 ;
		addweightgrid.gridy = 11 ;
		addweightgrid.gridheight = 1 ;
		addweightgrid.gridwidth = 2 ;
		addweightgrid.fill = GridBagConstraints.NONE;
		addweightgrid.anchor = GridBagConstraints.CENTER;
		add(addweightbutton,addweightgrid);
		
		//set grid of button women
		GridBagConstraints loseweightgrid = new GridBagConstraints();
		loseweightgrid.gridx = 5 ;
		loseweightgrid.gridy = 11 ;
		loseweightgrid.gridheight = 1 ;
		loseweightgrid.gridwidth = 2 ;
		loseweightgrid.fill = GridBagConstraints.NONE;
		loseweightgrid.anchor = GridBagConstraints.CENTER;
		add(loseweightbutton,loseweightgrid);
		//radio button group
		ButtonGroup Group2 = new ButtonGroup();
		Group2.add(addweightbutton);
		Group2.add(loseweightbutton);
		
		// set button
		GridBagConstraints setBMIgrid = new GridBagConstraints();
		setBMIgrid.gridx =  13 ;
		setBMIgrid.gridy = 6;
		setBMIgrid.gridheight = 1 ;
		setBMIgrid.gridwidth = 1 ;
		setBMIgrid.anchor = GridBagConstraints.CENTER;
		add(set,setBMIgrid);
		
		GridBagConstraints displaygrid = new GridBagConstraints();
		displaygrid.gridx =  9 ;
		displaygrid.gridy = 13;
		displaygrid.gridheight = 1 ;
		displaygrid.gridwidth = 4 ;
		displaygrid.anchor = GridBagConstraints.CENTER;
		add(display,displaygrid);
		 		
		
		// JLabel
		GridBagConstraints gendergrid = null;
		setLGrid(gender,gendergrid,7,0,1,3);
		
		GridBagConstraints fitgrid = null;
		setLGrid(fit,fitgrid,10,4,1,4);
		
		GridBagConstraints cal2grid = null;
		setLGrid(cal2,cal2grid,12,8,1,1);
		//set unit
		GridBagConstraints calgrid = null ;
		setLGrid(cal,calgrid,12,6,1,1);
		
		GridBagConstraints wishgrid = null ;
		setLGrid(wish,wishgrid,9,11,1,4);
		
		GridBagConstraints KGgrid = null ;
		setLGrid(kg,KGgrid,8,11,1,1);
		
		GridBagConstraints daysgrid = null ;
		setLGrid(days,daysgrid,8,12,1,1);
		
		GridBagConstraints cal3grid = null ;
		setLGrid(cal3,cal3grid,8,13,1,1);
		
		GridBagConstraints recommendgrid = null;
		setLGrid(recommend,recommendgrid,0,12,1,4);
		
		GridBagConstraints heightCalgrid = null;
		setLGrid(heightCal,heightCalgrid,0,13,1,4);
		
		GridBagConstraints Doyouknowgrid = null;
		setLGrid(Doyouknow,Doyouknowgrid,0,14,1,4);
		Doyouknow.setForeground(Color.red);
		
		GridBagConstraints knowledgegrid = null;
		setLGrid(knowledge,knowledgegrid,6,14,1,2);
		knowledge.setForeground(Color.MAGENTA);
		
		JLabel nul = new JLabel(" ");
		GridBagConstraints nulgrid = null;
		setLGrid(nul,nulgrid,0,9,1,5);
		
		GridBagConstraints plangrid = null;
		setLGrid(plan,plangrid,0,10,1,1);
		plan.setForeground(Color.red);
		//plan.setFont(new Font("斜窟悼", Font.BOLD, 17));
		
		
		
		// TextField
		GridBagConstraints yearsTextgrid = null;
		setTGrid(TextYears,yearsTextgrid,7,1,1,3);
		
		GridBagConstraints weightTextgrid = null;
		setTGrid(TextWeight,weightTextgrid,7,2,1,3);
		
		GridBagConstraints heightTextgrid = null;
		setTGrid(TextHeight,heightTextgrid,7,3,1,3);
		
		GridBagConstraints TextBMIgrid =null;
		setTGrid(TextBMI,TextBMIgrid,7,4,1,3);
		
		GridBagConstraints TextgoodWeightgrid = null;
		setTGrid(TextgoodWeight,TextgoodWeightgrid,7,5,1,3);
		
		GridBagConstraints TextBMRgrid = null;
		setTGrid(TextBMR,TextBMRgrid,7,6,1,3);
		
		GridBagConstraints Textconsumptiongrid = null;
		setTGrid(Textconsump,Textconsumptiongrid,7,8,1,3);
		
		GridBagConstraints TextwishKGgrid = null;
		setTGrid(TextwishKg,TextwishKGgrid,7,11,1,1);
		
		GridBagConstraints Textrecommendgrid = null;
		setTGrid(Textrecommend,Textrecommendgrid,7,12,1,1);
		
		GridBagConstraints TextHeightCalgrid = null;
		setTGrid(TextHeightCal,TextHeightCalgrid,6,13,1,2);
		
		
		//set grid of sportSituation ComboBox
		GridBagConstraints comboboxgrid = new GridBagConstraints();
		comboboxgrid.gridx = 7 ;
		comboboxgrid.gridy = 7 ;
		comboboxgrid.gridheight = 1 ;
		comboboxgrid.gridwidth = 3 ;
		comboboxgrid.fill = GridBagConstraints.NONE;
		comboboxgrid.anchor = GridBagConstraints.CENTER;
		add(sp,comboboxgrid);
		
		
		
		
		/*
		 * ActionListener
		 */
		//men button ActionListener
		menbutton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				genderNum = 1;//set gender =  men
				gender.setText("и�O�哭�");
			}
		});
				
		//women button ActionListener
		womenbutton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				genderNum = 2;//set gender = women
				gender.setText("и�Oタ��");
			}
		});
		
		addweightbutton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				LoseOrAdd = 1;//set gender = women
				wish.setText("и�n扱�d�W��");
			}
		});
		
		loseweightbutton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				LoseOrAdd = 2;//set gender = women
				wish.setText("���劉n喜�痢I�I");
			}
		});
				
				
		//Years TextField ActionListener
		TextYears.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				YearOld = (int) Double.parseDouble(TextYears.getText());
				setGenderText(gender,YearOld,genderNum);
				
			}
		});
		
		display.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				wishkg = (int) Double.parseDouble(TextwishKg.getText());
				Textrecommend.setText(String.valueOf(setDayNum(wishkg)*7)+" ~ "+wishkg*7);
				int total = (int) Double.parseDouble(Textconsump.getText()); 
				int result = total - 1100;
				int result2 = total -(int) (1100*1.5);
				TextHeightCal.setText(result+"~"+result2);
			}
		});
		
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
				
			}//end actionPerfromed
		});
		
		sportSituation.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				//get string which user choose
				JComboBox tmp = (JComboBox) e.getSource();
				String str = (String) tmp.getSelectedItem();
				//set the mode of action
				for(int h = 0; h < 6; h++){
					if(str.equals(situation[h])){
						actMode = h+1;
					}//end if
				}//end for
				
				Textconsump.setText(String.valueOf((int)(actIntensity(actMode)*BMR(weightNum, heightNum, YearOld, genderNum))));
				
			}//end actionPerfromed
		});
		
	}
	
	/*
	 * 
	 * 
	 * method
	 * 
	 * 
	 */
	public int setDayNum(int wishkg){
		int day = (int)(wishkg/1.5);
		return day;
	}
	
	
	//set genderTextField method
	public void setGenderText(JLabel gender,int YearOld,int genderNum){
		if((genderNum == 1) && (YearOld <= 10 )){
			gender.setText("и�Oタび�I");
		}
		else if((genderNum == 1) && (YearOld > 65 )){
			gender.setText("и�Oρ芸芸");
		}
		else if((genderNum == 1) && (YearOld > 12) && (YearOld < 19)){
			gender.setText("и�O�p�Aψ�I");
		}
		else if((genderNum == 2) && (YearOld <= 10 )){
			gender.setText("и�O�i�R�p土恢�I");
		}
		else if((genderNum == 2) && (YearOld > 12) && (YearOld < 19)){
			gender.setText("и�O�M�造屬k且�} >.^");
		}
		else if((genderNum == 2) && (YearOld > 65 )){
			gender.setText("и�Oρイイ");
		}
		else{
			if(genderNum == 1){
				gender.setText("и�O�哭�");
			}
			else{
				gender.setText("и�Oタ��");
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
			fit.setText("�攘躁箸��H");
		}
		else if(weightNum > UpperSuitWeight(YearOld,heightNum) && genderNum == 1){
			fit.setText("�陸v�O�A�I"); 
		}
		else if(weightNum > UpperSuitWeight(YearOld,heightNum) && genderNum == 2){
			fit.setText("�A�O�p検�C~~~"); 
		}
		else{
			if(genderNum == 1){
			fit.setText("せ喰�� <(��^��)>");
			}
			else{
			fit.setText("姶ヒ�u <)�C(> ");
			}
		}
	}
	
	//calculate BMI method
	public int BMI(double weight, double height){
		double heightOfMeter = height/100;
		double BMI = weight/(heightOfMeter*heightOfMeter);
		return (int)(BMI);
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
	
	/*
	 * intensity
	�＾鮒Y柴 1 ==>芋側�N疎�q�]叙吸ぃ以�@障ぱ�^
	�＾鮒Y柴 1.2 ==>酔そ�認ぞ磴價��]�X�G�椶岌率S�B以�^
	�＾鮒Y柴 1.375==>惨�廳＾鮒��]�C�g�B以1-2Ω�^
	�＾鮒Y柴 1.55==>い�弭B以���]�C�g�B以3��5Ω�^
	�＾鮒Y柴 1.725==>���弭B以���]�C�g�B以6-7Ω�^
	�＾鮒Y柴 1.9==>悼�O赫以���]�Cぱ���弭B以�劉�赫�O�u�@�漫^
	*
	*/
	public double actIntensity(int actMode){
		double intensity = 0;
		//mode case
		switch(actMode){
		case 1:intensity = 1;break;
		case 2:intensity = 1.2;break;
		case 3:intensity = 1.375;break;
		case 4:intensity = 1.55;break;
		case 5:intensity = 1.725;break;
		case 6:intensity = 1.9;break;
		}//end switch
		return intensity;
	}
	
	// calculate appropriate weight method
	public int LowerSuitWeight(int year, double height){
		double suitbmi = 0;
		double heightOfMeter = height/100;
		double goodweight1;
		if(year <= 18){
			switch(year){
			case 2:suitbmi = 15.2;break;
			case 3:suitbmi = 14.8;break;
			case 4:suitbmi = 14.4;break;
			case 5:suitbmi = 14;break;
			case 6:suitbmi = 13.9;break;
			case 7:suitbmi = 14.7;break;
			case 8:suitbmi = 15;break;
			case 9:suitbmi = 15.2;break;
			case 10:suitbmi = 15.4;break;
			case 11:suitbmi = 15.8;break;
			case 12:suitbmi = 16.4;break;
			case 13:suitbmi = 17.0;break;
			case 14:suitbmi = 17.6;break;
			case 15:suitbmi = 18.2;break;
			case 16:suitbmi = 18.6;break;
			case 17:suitbmi = 19;break;
			case 18:suitbmi = 19.2;break;
			}//end switch
			goodweight1 = suitbmi*Math.pow((heightOfMeter), 2);
		}//end if
		else{
			goodweight1 = 18.5*Math.pow((heightOfMeter), 2);
		}//end else
		return (int)(goodweight1);
		
	}
	
	// calculate appropriate weight method
	public int UpperSuitWeight(int year, double height){
		double suitbmi = 0;
		double heightOfMeter = height/100;
		double goodweight2 = 0;
		if(year <= 18){
			switch(year){
			case 2:suitbmi = 17.7;break;
			case 3:suitbmi = 17.7;break;
			case 4:suitbmi = 17.7;break;
			case 5:suitbmi = 17.7;break;
			case 6:suitbmi = 17.9;break;
			case 7:suitbmi = 18.6;break;
			case 8:suitbmi = 19.3;break;
			case 9:suitbmi = 19.7;break;
			case 10:suitbmi = 20.3;break;
			case 11:suitbmi = 21;break;
			case 12:suitbmi = 21.5;break;
			case 13:suitbmi = 22.2;break;
			case 14:suitbmi = 22.7;break;
			case 15:suitbmi = 23.1;break;
			case 16:suitbmi = 23.4;break;
			case 17:suitbmi = 23.6;break;
			case 18:suitbmi = 23.7;break;
			}//end switch
			goodweight2 = suitbmi*Math.pow((heightOfMeter), 2);
		}//end if
		else{
			goodweight2 = 24*Math.pow((heightOfMeter), 2);
		}//end else
		
		return (int)(goodweight2);
	}
	
	
	
	
}
