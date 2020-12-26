package finalProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


public class FinalProject implements ActionListener {
	JFrame frame;
	Container c;
	JLabel welcome,menu,displayMenu,whatToSelect,image,image2;
	JLabel SelectAny;
	JButton menuButton,homepage,seeAddeditems;
	JPanel panel1,panel2,Burger,Rice,Snacks,Side,ColdDrink,seeAdded,PayAndFinish;
	JRadioButton rad_1,rad_2,rad_3,rad_4,rad_5;//for panel2
	JCheckBox potato, chicken, chick_rock; //for Burger
	ButtonGroup group1;//for panel2
	JButton addToCart, goBack ,payement;//For Burger
	JCheckBox hot,strip,popcorn,vegstrip;//For Snacks
	JCheckBox extraC, extraD, hotCrip,Fiery;//For Side 
	JCheckBox veg,pop,grill; //for Rice
	JCheckBox pepsi,sevenup,dew,sting; //For Cold Drinks
	
	JTextArea textArea; //For showing added items 
	JLabel showhead,potat,chick,rock;//For Burger
	JLabel Veg1, pop1,gril;//For Rice
	JLabel hot1,bone1,corn1,stirp;//For Snacks
	JLabel extra1,extra2,crisp1,fiery1; //For Sides
	JLabel pep1,svnup,dew1,sting1;//For Cold Drinks
	
	JButton enterAmount,Closebtn,BILL; //for PayAndFinish
	JLabel totalBill;//for PayAndFinish
	 int bill = 0;
	int amountGot=0, restAmount=0;
	
	
	
	FinalProject(){
		
		frame = new JFrame("19SW28");
		
	    c = frame.getContentPane();
		c.setLayout(null);
		frame.setResizable(false);
		
		ImageIcon icon = new ImageIcon("kfc.jpg");
		ImageIcon icon1 = new ImageIcon("kfcimage.png");
	
		frame.setIconImage(icon.getImage());
		frame.setVisible(true);
		frame.setBounds(100,100,600,400);
		
		
		
		panel1 = new JPanel();
		panel1.setLayout(null);
		panel1.setVisible(true);
		panel1.setBounds(0,0,600,400);		
		panel1.setBackground(Color.CYAN);
		
		Font f = new Font("Impact",Font.BOLD,30);
		
		//***********   Code for Welcome note  **********************************
		
		welcome = new JLabel("Welcome to KFC");
		welcome.setBounds(30,20,230,30);
		welcome.setForeground(Color.RED);
		welcome.setFont(f);
		
		
		image = new JLabel("");
		image.setBounds(10,100,225,225);
		image.setIcon(icon1);
		
		
		//*******************  Code for displaying menu line... ************************************
		
		menu = new JLabel("Go to Menu");
		menu.setBounds(350,160,120,30);
		menu.setFont(new Font("Arial",Font.BOLD,15));
		
		
		//**********************    Code for creating menu button  **********************************
		
		Cursor cur = new Cursor(Cursor.HAND_CURSOR);
		
				menuButton = new JButton("Menu");
		menuButton.setBounds(325,220,140,30);
		menuButton.setBackground(Color.ORANGE);
		menuButton.setCursor(cur);
		menuButton.addActionListener(this);
		
		
		panel1.add(welcome);
		panel1.add(menu);
		panel1.add(menuButton);
		panel1.add(image);
		c.add(panel1);
		
		//***********************   Code for displaying menu items  *****************
		
		homepage = new JButton("Homepage");
		homepage.setBackground(Color.orange);
		homepage.setBounds(430,20,120,30);
		homepage.setCursor(cur);
		homepage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel1.setVisible(true);
				panel1.add(welcome);
				panel2.setVisible(false);
			}
		});
		
		
		displayMenu = new JLabel("Thank you sir , Here it is !");
		displayMenu.setBounds(27,70,250,30);
		displayMenu.setFont(new Font("Arial",Font.BOLD,20));
		displayMenu.setForeground(Color.BLUE);
		displayMenu.setVisible(true);
		
		whatToSelect = new JLabel("What do you want to buy? ");
		whatToSelect.setBounds(30,95,350,30);
		whatToSelect.setForeground(Color.BLUE);
		whatToSelect.setFont(new Font("Arial",Font.BOLD,20));
		whatToSelect.setVisible(true);
		
		rad_1 = new JRadioButton(" Burger");
		rad_1.setCursor(cur);
		rad_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel2.setVisible(false);
				Burger.setVisible(true);
				
			}
		});
		rad_1.setBounds(50,160,100,30);
		
		
		rad_2 = new JRadioButton(" Rice Bowlz");
		rad_2.setBounds(50,190,100,30);
		rad_2.setCursor(cur);
		rad_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel2.setVisible(false);
				Rice.setVisible(true);
			}
		});
		rad_2.setVisible(true);
		
		rad_3 = new JRadioButton(" Snacks");
		rad_3.setBounds(50,220,100,30);
		rad_3.setCursor(cur);
		rad_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel2.setVisible(false);
				Snacks.setVisible(true);
			}
		});
		
	
		
		rad_4 = new JRadioButton(" Side Dishes");
		rad_4.setBounds(50,250,100,30);
		rad_4.setCursor(cur);
		rad_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel2.setVisible(false);
				Side.setVisible(true);
			}
		});
		
		
		rad_5 = new JRadioButton(" Cold Drinks");
		rad_5.setBounds(50,280,100,30);
		rad_5.setCursor(cur);
		rad_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel2.setVisible(false);
				ColdDrink.setVisible(true);
			}
		});
		
		ImageIcon icon2 = new ImageIcon("chicken.jpg");
		
		image2 = new JLabel("");
		image2.setIcon(icon2);
		image2.setBounds(280,140,285,183);
		
		
		
		
		group1 = new ButtonGroup();
		group1.add(rad_1);
		group1.add(rad_2);
		group1.add(rad_3);
		group1.add(rad_4);
		group1.add(rad_5);
		
		panel2 = new JPanel();
		panel2.setLayout(null);
		panel2.setVisible(false);
		panel2.setBounds(0,0,600,400);
		
	
				
		
		panel2.add(displayMenu);
		panel2.add(rad_1);
		panel2.add(rad_2);
		panel2.add(rad_3);
		panel2.add(rad_4);
		panel2.add(rad_5);
		panel2.add(whatToSelect);
		panel2.add(welcome);
		panel2.add(image2);
		panel2.add(homepage);
		
	// *******************   Setting panel3   *********************************************************
		
		Burger = new JPanel();
		Burger.setLayout(null);
		Burger.setBounds(30,50,600,400);
		Burger.setVisible(false);
		c.add(Burger);
		
		addToCart = new JButton("TOTAL BILL");
		addToCart.setBounds(150,250,130,30);
		addToCart.setBackground(Color.ORANGE);
		addToCart.setCursor(cur);
		addToCart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(c, "Total Bill: "+bill);
			}
		});
		
		
		SelectAny = new JLabel("Which item do you want to select from menu?");
		SelectAny.setFont(new Font("Arial",Font.BOLD,17));
		SelectAny.setForeground(Color.BLUE);
		SelectAny.setBounds(80,0,400,40);
		
		seeAddeditems = new JButton("SEE ADDED");
		seeAddeditems.setBackground(Color.ORANGE);
		seeAddeditems.setBounds(0,250,130,30);
		seeAddeditems.setCursor(cur);
		seeAddeditems.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Burger.setVisible(false);
				seeAdded.setVisible(true);
			}
		});
		
		
		
		goBack = new JButton("GO BACK");
		goBack.setBackground(Color.ORANGE);
		goBack.setBounds(300,250,100,30);
		goBack.setCursor(cur);
		goBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel2.setVisible(true);
				Burger.setVisible(false);
			}
		});
		
		payement = new JButton("PAY&FINISH");
		payement.setBounds(420,250,120,30);
		payement.setBackground(Color.ORANGE);
		payement.setCursor(cur);
		payement.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PayAndFinish.setVisible(true);
				Burger.setVisible(false);
				PayAndFinish.add(textArea);
			}
		});
		
		
		
		potato = new JCheckBox(" Potato Krisper             Rs: 35");
		potato.setBounds(80,50,200,30);
		potato.setCursor(cur);
		potato.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==1) {
					bill = bill+35;					
					potat = new JLabel("Potato Krisper             Rs: 35");
					potat.setBounds(30,10,350,30);
					potat.setVisible(true);
					textArea.add(potat);
				
				}
				else {
					bill = bill-35;
					potat.setVisible(false);
					
				}
				
			}
		});
		
		chicken = new JCheckBox(" Chicken Snackers      Rs: 45");
		chicken.setBounds(80,100,200,30);
		chicken.setCursor(cur);
		chicken.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==1) {
					bill = bill+45;
					chick = new JLabel("Chicken Snackers      Rs: 45");
					chick.setBounds(30,25,350,30);
					chick.setVisible(true);
					textArea.add(chick);
					
					
				}
				else {
					bill = bill-45;
					chick.setVisible(false);
				}
				
			}
		});
		
		chick_rock = new JCheckBox(" Chicken Rockin          Rs: 85");
		chick_rock.setBounds(80,150,200,30);
		chick_rock.setCursor(cur);
		chick_rock.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==1) {
					bill = bill+85;
					rock = new JLabel("Chicken Rockin      Rs: 85");
					rock.setBounds(30,40,350,30);
					rock.setVisible(true);
					textArea.add(rock);
				}
				else {
					bill = bill-85;
					rock.setVisible(false);
				}
				
			}
		});
		
		Burger.add(potato);
		Burger.add(chicken);
		Burger.add(chick_rock);
		Burger.add(SelectAny);
		Burger.add(addToCart);
		Burger.add(goBack);
		Burger.add(payement);
		Burger.add(seeAddeditems);
		
	// ************ Setting Panel4 for Rice Bowl ************************
	
		Rice = new JPanel();
		Rice.setLayout(null);
		Rice.setBounds(30,50,600,400);
		Rice.setVisible(false);
		c.add(Rice);
		
		addToCart = new JButton("TOTAL BILL");
		addToCart.setBounds(150,250,130,30);
		addToCart.setBackground(Color.ORANGE);
		addToCart.setCursor(cur);
		addToCart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(c, "Total Bill: "+bill);
			}
		});
		
		SelectAny = new JLabel("Which item do you want to select from menu?");
		SelectAny.setFont(new Font("Arial",Font.BOLD,17));
		SelectAny.setForeground(Color.BLUE);
		SelectAny.setBounds(80,0,400,40);
		
		goBack = new JButton("GO BACK");
		goBack.setBounds(300,250,100,30);
		goBack.setBackground(Color.ORANGE);
		goBack.setCursor(cur);
		goBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel2.setVisible(true);
				Rice.setVisible(false);
			}
		});
		
		seeAddeditems = new JButton("SEE ADDED");
		seeAddeditems.setBounds(0,250,130,30);
		seeAddeditems.setBackground(Color.ORANGE);
		seeAddeditems.setCursor(cur);
		seeAddeditems.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Rice.setVisible(false);
				seeAdded.setVisible(true);
			}
		});
		
		payement = new JButton("PAY&FINISH");
		payement.setBounds(420,250,120,30);
		payement.setBackground(Color.ORANGE);
		payement.setCursor(cur);
		payement.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Rice.setVisible(false);
				PayAndFinish.setVisible(true);
				PayAndFinish.add(textArea);
			}
		});
		
		veg = new JCheckBox(" Veg Strips Bowlz                   Rs: 89");
		veg.setBounds(80,50,250,30);
		veg.setCursor(cur);
		veg.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==1) {
					bill = bill+89;
					Veg1 = new JLabel("Veg Strips Bowlz      Rs: 89");
					Veg1.setBounds(30,55,350,30);
					Veg1.setVisible(true);
					textArea.add(Veg1);
				}
				else {
					bill = bill-89;
					Veg1.setVisible(false);
				}
				
			}
		});
		
		pop = new JCheckBox(" Chicken Popcorn Bowlz       Rs: 99");
		pop.setBounds(80,100,250,30);
		pop.setCursor(cur);
		pop.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==1) {
					bill = bill+99;
					pop1 = new JLabel("Chicken Popcorn Bowlz       Rs: 99");
					pop1.setBounds(30,70,350,30);
					pop1.setVisible(true);
					textArea.add(pop1);
				}
				else {
					bill = bill-99;
					pop1.setVisible(false);
				}
				
			}
		});
		
		grill = new JCheckBox(" Fiery Grilled Bowlz               Rs: 125");
		grill.setBounds(80,150,300,30);
		grill.setCursor(cur);
		grill.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==1) {
					bill = bill+125;
					gril = new JLabel("Fiery Grilled Bowlz        Rs: 125");
					gril.setBounds(30,85,350,30);
					gril.setVisible(true);
					textArea.add(gril);
					
				}
				else {
					bill = bill-125;
					gril.setVisible(false);
				}
				
			}
		});
		
		Rice.add(veg);
		Rice.add(pop);
		Rice.add(grill);
		Rice.add(addToCart);
		Rice.add(goBack);
		Rice.add(payement);
		Rice.add(SelectAny);
		Rice.add(seeAddeditems);
		
		// ************ Setting Panel5 for Snacks ************************
		
			Snacks = new JPanel();
			Snacks.setLayout(null);
			Snacks.setBounds(30,50,600,400);
			Snacks.setVisible(false);
			c.add(Snacks);
			
			addToCart = new JButton("TOTAL BILL");
			addToCart.setBounds(150,250,130,30);
			addToCart.setBackground(Color.ORANGE);
			addToCart.setCursor(cur);
			addToCart.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					JOptionPane.showMessageDialog(c, "Total Bill: "+bill);
				}
			});
			
			SelectAny = new JLabel("Which item do you want to select from menu?");
			SelectAny.setFont(new Font("Arial",Font.BOLD,17));
			SelectAny.setForeground(Color.BLUE);
			SelectAny.setBounds(80,0,400,40);
			
			goBack = new JButton("GO BACK");
			goBack.setBounds(300,250,100,30);
			goBack.setCursor(cur);
			goBack.setBackground(Color.ORANGE);
			goBack.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					panel2.setVisible(true);
					Snacks.setVisible(false);
				}
			});
			
			seeAddeditems = new JButton("SEE ADDED");
			seeAddeditems.setBounds(0,250,130,30);
			seeAddeditems.setCursor(cur);
			seeAddeditems.setBackground(Color.ORANGE);
			seeAddeditems.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Snacks.setVisible(false);
					seeAdded.setVisible(true);
				}
			});
			
			payement = new JButton("PAY&FINISH");
			payement.setBounds(420,250,120,30);
			payement.setBackground(Color.ORANGE);
			payement.setCursor(cur);
			payement.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					PayAndFinish.setVisible(true);
					Snacks.setVisible(false);
					PayAndFinish.add(textArea);
				}
			});
			
			
			hot = new JCheckBox(" Hot wings                           Rs: 55");
			hot.setBounds(80,50,250,30);
			hot.setCursor(cur);
			hot.addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent e) {
					if(e.getStateChange()==1) {
						bill = bill+55;
						hot1 = new JLabel("Hot wings             Rs: 55");
						hot1.setBounds(30,100,350,30);
						hot1.setVisible(true);
						textArea.add(hot1);
					}
					else {
						bill = bill-55;
						hot1.setVisible(false);
					}
					
				}
			});
			
			strip = new JCheckBox(" Bonless strips 3pc              Rs: 99");
			strip.setBounds(80,100,250,30);
			strip.setCursor(cur);
			strip.addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent e) {
					if(e.getStateChange()==1) {
						bill = bill+99;
						bone1 = new JLabel("Bonless strips 3pc            Rs: 99");
						bone1.setBounds(30,115,350,30);
						bone1.setVisible(true);
						textArea.add(bone1);
					}
					else {
						bill = bill-99;
						bone1.setVisible(false);
					}
					
				}
			});
			
			popcorn = new JCheckBox(" Popcorn chicken(lrg.)         Rs: 149");
			popcorn.setBounds(80,150,300,30);
			popcorn.setCursor(cur);
			popcorn.addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent e) {
					if(e.getStateChange()==1) {
						bill = bill+149;
						corn1 = new JLabel("Popcorn chicken(lrg.)         Rs: 149");
						corn1.setBounds(30,130,350,30);
						corn1.setVisible(true);
						textArea.add(corn1);
					}
					else {
						bill = bill-149;
						corn1.setVisible(false);
					}
					
				}
			});
			
			vegstrip = new JCheckBox(" Veg strips*6pc                    Rs: 59");
			vegstrip.setBounds(80,200,250,30);
			vegstrip.setCursor(cur);
			vegstrip.addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent e) {
					if(e.getStateChange()==1) {
						bill = bill+59;
						stirp = new JLabel("Veg strips*6pc         Rs: 59");
						stirp.setBounds(30,145,350,30);
						stirp.setVisible(true);
						textArea.add(stirp);
					}
					else {
						bill = bill-59;
						stirp.setVisible(false);
					}
					
				}
			});
			
			
			Snacks.add(hot);
			Snacks.add(popcorn);
			Snacks.add(vegstrip);
			Snacks.add(strip);
			Snacks.add(addToCart);
			Snacks.add(goBack);
			Snacks.add(payement);
			Snacks.add(SelectAny);
			Snacks.add(seeAddeditems);
		// ************ Setting Panel6 for Side Dishes ************************
			
			Side = new JPanel();
			Side.setLayout(null);
			Side.setBounds(30,50,600,400);
			Side.setVisible(false);
			c.add(Side);
			
			addToCart = new JButton("TOTAL BILL");
			addToCart.setBounds(150,250,130,30);
			addToCart.setBackground(Color.ORANGE);
			addToCart.setCursor(cur);
			addToCart.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					JOptionPane.showMessageDialog(c, "Total Bill: "+bill);
				}
			});
			
			SelectAny = new JLabel("Which item do you want to select from menu?");
			SelectAny.setFont(new Font("Arial",Font.BOLD,17));
			SelectAny.setForeground(Color.BLUE);
			SelectAny.setBounds(80,0,400,40);
			
			goBack = new JButton("GO BACK");
			goBack.setBounds(300,250,100,30);
			goBack.setBackground(Color.ORANGE);
			goBack.setCursor(cur);
			goBack.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					panel2.setVisible(true);
					Side.setVisible(false);
				}
			});
			
			payement = new JButton("PAY&FINISH");
			payement.setBackground(Color.ORANGE);
			payement.setBounds(420,250,120,30);
			payement.setCursor(cur);
			payement.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					Side.setVisible(false);
					PayAndFinish.setVisible(true);
					PayAndFinish.add(textArea);
				}
			});
			
			seeAddeditems = new JButton("SEE ADDED");
			seeAddeditems.setBounds(0,250,130,30);
			seeAddeditems.setBackground(Color.ORANGE);
			seeAddeditems.setCursor(cur);
			seeAddeditems.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Side.setVisible(false);
					seeAdded.setVisible(true);
				}
			});
			
			
			extraC = new JCheckBox(" Extra cheese             Rs: 15");
			extraC.setBounds(80,50,250,30);
			extraC.setCursor(cur);
			extraC.addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent e) {
					if(e.getStateChange()==1) {
						bill = bill+15;
						extra1 = new JLabel("Extra cheese             Rs: 15");
						extra1.setBounds(30,160,350,30);
						extra1.setVisible(true);
						textArea.add(extra1);

					}
					else {
						bill = bill-15;
						extra1.setVisible(false);
					}
					
				}
			});
			 
			extraD = new JCheckBox(" Extra Dips                  Rs: 20");
			extraD.setBounds(80,100,250,30);
			extraD.setCursor(cur);
			extraD.addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent e) {
					if(e.getStateChange()==1) {
						bill = bill+20;
						extra2 = new JLabel("Extra Dips         Rs: 20");
						extra2.setBounds(30,175,350,30);
						extra2.setVisible(true);
						textArea.add(extra2);
					}
					else {
						bill = bill-20;
						extra2.setVisible(false);
					}
					
				}
			});
			
			hotCrip = new JCheckBox(" Hot & Crispy              Rs: 75");
			hotCrip.setBounds(80,150,300,30);
			hotCrip.setCursor(cur);
			hotCrip.addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent e) {
					if(e.getStateChange()==1) {
						bill = bill+75;
						crisp1 = new JLabel("Hot & Crispy              Rs: 75");
						crisp1.setBounds(30,190,350,30);
						crisp1.setVisible(true);
						textArea.add(crisp1);
					}
					else {
						bill = bill-75;
						crisp1.setVisible(false);
					}
					
				}
			});
			
			Fiery = new JCheckBox("  Fiery Grilled              Rs: 75");
			Fiery.setBounds(80,200,250,30);
			Fiery.setCursor(cur);
			Fiery.addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent e) {
					if(e.getStateChange()==1) {
						bill = bill+75;
						fiery1 = new JLabel(" Fiery Grilled         Rs: 75");
						fiery1.setBounds(30,205,350,30);
						fiery1.setVisible(true);
						textArea.add(fiery1);
					}
					else {
						bill = bill-75;
						fiery1.setVisible(false);
					}
					
				}
			});
			
			
			Side.add(extraC);
			Side.add(extraD);
			Side.add(hotCrip);
			Side.add(Fiery);
			Side.add(addToCart);
			Side.add(goBack);
			Side.add(payement);
			Side.add(SelectAny);
			Side.add(seeAddeditems);
			
			// *********** Setting panel for Cold Drinks *****************
			
			ColdDrink = new JPanel();
			ColdDrink.setLayout(null);
			ColdDrink.setBounds(30,50,600,400);
			ColdDrink.setVisible(false);
			c.add(ColdDrink);
			
			addToCart = new JButton("TOTAL BILL");
			addToCart.setBounds(150,250,130,30);
			addToCart.setCursor(cur);
			addToCart.setBackground(Color.ORANGE);
			addToCart.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					JOptionPane.showMessageDialog(c, "Total Bill: "+bill);
				}
			});
			
			SelectAny = new JLabel("Which item do you want to select from menu?");
			SelectAny.setFont(new Font("Arial",Font.BOLD,17));
			SelectAny.setForeground(Color.BLUE);
			SelectAny.setBounds(80,0,400,40);
			
			goBack = new JButton("GO BACK");
			goBack.setBackground(Color.ORANGE);
			goBack.setCursor(cur);
			goBack.setBounds(300,250,100,30);
			goBack.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					panel2.setVisible(true);
					ColdDrink.setVisible(false);
				}
			});
			
			payement = new JButton("PAY&FINISH");
			payement.setBounds(420,250,120,30);
			payement.setBackground(Color.ORANGE);
			payement.setCursor(cur);
			payement.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ColdDrink.setVisible(false);
					PayAndFinish.setVisible(true);
					PayAndFinish.add(textArea);
					
				}
			});
			
			seeAddeditems = new JButton("SEE ADDED");
			seeAddeditems.setBounds(0,250,130,30);
			seeAddeditems.setCursor(cur);
			seeAddeditems.setBackground(Color.ORANGE);
			seeAddeditems.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ColdDrink.setVisible(false);
					seeAdded.setVisible(true);
					
				}
			});
			
		
			
			pepsi = new JCheckBox(" Pepsi             Rs:120 ");
			pepsi.setBounds(80,50,250,30);
			pepsi.setCursor(cur);
			pepsi.addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent e) {
					if(e.getStateChange()==1) {
						bill = bill+120;
						pep1 = new JLabel("Pepsi           Rs:120");
						pep1.setBounds(30,220,350,30);
						pep1.setVisible(true);
						textArea.add(pep1);
					}
					else {
						bill = bill-120;
						pep1.setVisible(false);
					}
					
				}
			});
			 
			sevenup = new JCheckBox(" 7up                Rs:120");
			sevenup.setBounds(80,100,250,30);
			sevenup.setCursor(cur);
			sevenup.addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent e) {
					if(e.getStateChange()==1) {
						bill = bill+120;
						svnup = new JLabel("7up            Rs:120");
						svnup.setBounds(30,235,150,30);
						svnup.setVisible(true);
						textArea.add(svnup);
					}
					else {
						bill = bill-120;
						svnup.setVisible(false);
					}
					
				}
			});
			
			dew = new JCheckBox(" Dew               Rs:120");
			dew.setBounds(80,150,300,30);
			dew.setCursor(cur);
			dew.addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent e) {
					if(e.getStateChange()==1) {
						bill = bill+120;
						dew1 = new JLabel("Dew               Rs:120");
						dew1.setBounds(30,250,150,30);
						dew1.setVisible(true);
						textArea.add(dew1);
					}
					else {
						bill = bill-120;
						dew1.setVisible(false);
					}
					
				}
			});
			
			sting = new JCheckBox(" Sting              Rs:60");
			sting.setBounds(80,200,250,30);
			sting.setCursor(cur);
			sting.addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent e) {
					if(e.getStateChange()==1) {
						bill = bill+60;
						sting1 = new JLabel("Sting              Rs:60");
						sting1.setBounds(30,265,350,30);
						sting1.setVisible(true);
						textArea.add(sting1);
					}
					else {
						bill = bill-60;
						sting1.setVisible(false);
					}
					
				}
			});
			
			
			ColdDrink.add(pepsi);
			ColdDrink.add(sevenup);
			ColdDrink.add(dew);
			ColdDrink.add(sting);
			ColdDrink.add(addToCart);
			ColdDrink.add(goBack);
			ColdDrink.add(payement);
			ColdDrink.add(SelectAny);
			ColdDrink.add(seeAddeditems);
			
	//***************  Creating JPanel for showing added items  ***************************
		
			seeAdded = new JPanel();
			seeAdded.setLayout(null);
			seeAdded.setBounds(0,0,600,400);
			seeAdded.setVisible(false);
			c.add(seeAdded);
			
			
			textArea = new JTextArea();
			textArea.setBounds(60,40,300,300);
			textArea.setEditable(false);
			
			showhead = new JLabel("Your Added Items List");
			showhead.setBounds(20,5,250,30);
			showhead.setFont(new Font("Arial",Font.BOLD,20));
			showhead.setForeground(Color.BLUE);
			
			goBack = new JButton("Go Back");
			goBack.setBounds(450,300,100,30);
			goBack.setCursor(cur);
			goBack.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					panel2.setVisible(true);
					seeAdded.setVisible(false);
				}
			});
			
			seeAdded.add(goBack);
			seeAdded.add(showhead);
			seeAdded.add(textArea);
			c.add(seeAdded);
		
		// ********************** Creating panel for PayAndFinish ******************
			
			PayAndFinish = new JPanel();
			PayAndFinish.setLayout(null);
			PayAndFinish.setBounds(0,0,600,400);
			PayAndFinish.setVisible(false);
			
			
			enterAmount = new JButton("ENTER AMOUNT");
			enterAmount.setBounds(400,250,150,30);
			enterAmount.setCursor(cur);
			enterAmount.setBackground(Color.ORANGE);
			enterAmount.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					if(bill==0) {
						JOptionPane.showMessageDialog(c, "Your bill has been paid or it is zero!  :)");						
					}
					
					else if(bill>0) {
					
						try{
							amountGot = Integer.parseInt(JOptionPane.showInputDialog(c,"Enter amount to pay !"));
							restAmount = amountGot-bill;
							
							if(restAmount>0) {
								JOptionPane.showMessageDialog(c, "Your rest amount after payement is "+restAmount);
								bill = 0;
							}
							
							else if(restAmount==0){
								JOptionPane.showMessageDialog(c, "Thanks Sir, your amount after payement is "+restAmount);
								bill = 0;
							}
							
							else {
								JOptionPane.showMessageDialog(c, "You amount is lower than bill, Please enter valid amount ");
							}
						}
						catch(Exception e1) {
							System.out.print(e1.getMessage());
						}
						
						if(bill==0)
						JOptionPane.showMessageDialog(c, "Your bill has been paid :)");
						
						
						
					}
				}
			});
			
			
			
			totalBill = new JLabel("Your Total Bill : ");
			totalBill.setBounds(400,150,140,30);
			
			BILL = new JButton("BILL");
			BILL.setBounds(495,155,70,20);
			BILL.setBackground(Color.YELLOW);
			BILL.setCursor(cur);
			BILL.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					JOptionPane.showMessageDialog(c, "Your bill is "+bill);
					
				}
				
			});
		
			
			Closebtn = new JButton("CLOSE");
			Closebtn.setBounds(400,310,150,30);
			Closebtn.setBackground(Color.ORANGE);
			Closebtn.setCursor(cur);
			Closebtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					if(bill>0 && amountGot==0) {
						JOptionPane.showMessageDialog(c, "Please pay your bill honestly :)");
					}
					
					else if(amountGot<bill) {
						JOptionPane.showMessageDialog(c, "You amount is lower than bill, Please enter valid amount :) ");
					}
					
					else {
						JOptionPane.showMessageDialog(c, "Thank you! Please Come Again :) ");
						System.exit(0);
					}
					
				}
			});
			
			showhead = new JLabel("Your Added Items List");
			showhead.setBounds(20,5,250,30);
			showhead.setFont(new Font("Arial",Font.BOLD,20));
			showhead.setForeground(Color.BLUE);

			
			
			
			PayAndFinish.add(enterAmount);
			PayAndFinish.add(totalBill);
			PayAndFinish.add(showhead);
			PayAndFinish.add(Closebtn);
			PayAndFinish.add(BILL);
			c.add(PayAndFinish);
	
	
}
	public static void main(String args[]) {
		new FinalProject();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getActionCommand().equals("Menu")){
			
			panel1.setVisible(false);
			panel2.setVisible(true);
			panel2.add(welcome);
			c.add(panel2);
		}		
		
		
	}
}

