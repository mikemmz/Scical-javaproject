/*

***
**
**
* 
* @author By My TEAM  Prasin  Nattakit   Thanapon  Phunawat

*/

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.*;

@SuppressWarnings("serial")
public class Scicalc255 extends JFrame {
	private  JTextField  txtin,txtout;
	private  JButton  but0,but1,but2,but3,but4,but5,but6,but7,but8,but9,butplus,butsub,butmulti,butdiv,butas,butAc,buts,
					  butsqrt,butper,butpow,butsin,butcos,buttan,butlog,butexp,butpi,butmod,butE,butss,butabs;
	 					
	private  double  x=0,y=0,result=0,a;
	private int count = 0;
	
	public Scicalc255(){
	
		super("Project Calc");
		
		// Container cp = getContentPane();
		 
		 JPanel paneloutput = new JPanel (new GridLayout(2,2));   // Display
		 JPanel panelop = new JPanel (new GridLayout (5,3,3,2));  // Triagle
		 
		 JPanel panelnum = new JPanel (new GridLayout(5,3,3,2));  // Number
		 JPanel panelopst = new JPanel (new GridLayout(5,1,3,2)); // Math
		 
		 	
		 this.txtin = new JTextField("",30);
		 this.txtin.setEditable(false);
		 this.txtout = new JTextField ("",30);
		 this.txtout.setEditable(false);
		 
		 this.but0 = new   JButton ("0");    // 0
		 this.but1 = new   JButton ("1");    // 1
		 this.but2 = new   JButton ("2");    // 2
		 this.but3 = new   JButton ("3");    // 3 
		 this.but4 = new   JButton ("4");    // 4
		 this.but5 = new   JButton ("5");    // 5
		 this.but6 = new   JButton ("6");    // 6
		 this.but7 = new   JButton ("7");    // 7 
		 this.but8 = new   JButton ("8");    // 8 
		 this.but9 = new   JButton ("9");    // 9
		 this.buts = new   JButton (".");    // .
		 this.butper = new JButton ("%");    // % 
		 this.butas = new  JButton ("=");    // =   
		 this.butas.setBackground(Color.green);
		 this.butss = new JButton ("+/-");
		 
		 this.butplus = new JButton("+");		// Plus
		 this.butsub = new JButton("-");		// Subtract 
		 this.butmulti = new JButton("x");		// Multiply 
		 this.butdiv = new JButton("/");		// Divide
		 this.butAc = new JButton ("Ac");		// Ac 
		 this.butAc.setBackground(Color.pink);
		 
		 this.butsin  = new JButton ("sin"); 	// Sin    
		 this.butcos  = new JButton ("cos");  	// Cos    
		 this.buttan  = new JButton ("tan"); 	// Tan    
		 this.butsqrt = new JButton ("sqrt");  	// Square root  
		 this.butlog  = new JButton ("log");  	// Log  
		 this.butexp  = new JButton ("exp");  	// Exp  
		 this.butpi   = new JButton ("TT"); 		// Pi   
		 this.butmod  = new JButton ("mod"); 	// Mod  
		 this.butpow  = new JButton ("^");		// ^2    
		 this.butE    = new JButton ("e"); 		// E  
		 this.butabs  = new JButton ("abs");
		 
		 //Color Letter
		 this.butper.setForeground(Color.blue);
		 this.butas.setForeground(Color.blue);
		 this.butss.setForeground(Color.blue);
		 
		 this.butplus.setForeground(Color.blue);
		 this.butsub.setForeground(Color.blue);
		 this.butmulti.setForeground(Color.blue);
		 this.butdiv.setForeground(Color.blue);
		 this.butAc.setForeground(Color.red);
		 
		 this.butsin.setForeground(Color.blue);
		 this.butcos.setForeground(Color.blue);
		 this.buttan.setForeground(Color.blue);
		 this.butsqrt.setForeground(Color.blue);
		 this.butlog.setForeground(Color.blue);
		 this.butexp.setForeground(Color.blue);
		 this.butpi.setForeground(Color.blue);
		 this.butmod.setForeground(Color.blue);
		 this.butpow.setForeground(Color.blue);
		 this.butE.setForeground(Color.blue);
		 this.butabs.setForeground(Color.blue);
		 
		 paneloutput.add(txtin);
		 paneloutput.add(txtout);
		
		 this.add(but0);
		 this.add(but1);
		 this.add(but2);
		 this.add(but3);
		 this.add(but4);
		 this.add(but5);
		 this.add(but6);
		 this.add(but7);
		 this.add(but8);
		 this.add(but9);
		 this.add(buts);
		 this.add(butper);
		 this.add(butss);
		 this.add(butplus);
		 this.add(butsub);
		 this.add(butmulti);
		 this.add(butdiv);
		 this.add(butas);
		 this.add(butsin);
		 this.add(butcos);
		 this.add(buttan);
		 this.add(butlog);
		 this.add(butsqrt);
		 this.add(butmod);
		 this.add(butexp);
		 this.add(butpow);
		 this.add(butpi);
		 this.add(butE);
		 this.add(butabs);
		
		 
		  //add Math function
		 panelop.add(butsin);
		 panelop.add(butcos);
		 panelop.add(buttan); 
		 panelop.add(butmod);
		 panelop.add(butlog);
		 panelop.add(butsqrt);
		 panelop.add(butexp);
		 panelop.add(butpow);
		 panelop.add(butabs);
		 panelop.add(butpi);
		 panelop.add(butE);
		 panelop.add(butper);
		 
		  
		  //add Math 
		  panelopst.add(butplus);
		  panelopst.add(butsub);
		  panelopst.add(butmulti);
		  panelopst.add(butdiv);
		  panelopst.add(butss);
		  panelopst.add(butas);
		  
		  //add Number
		  panelnum.add(butAc);
		  panelnum.add(but9);
		  panelnum.add(but8);
		  panelnum.add(but7);
		  panelnum.add(but6);
		  panelnum.add(but5);
		  panelnum.add(but4);
		  panelnum.add(but3);
		  panelnum.add(but2);
		  panelnum.add(but1);
		  panelnum.add(but0);
		  panelnum.add(buts);
		 
		  
		  
		  panelnum.setBackground(Color.white);
		  panelop.setBackground(Color.white);
		  panelopst.setBackground(Color.white);
		  
		  
		  this.setSize(480,350);
		  this.setVisible(true);
		  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
		  this.setLayout(new BorderLayout(3,3));
		  this.add(paneloutput,BorderLayout.NORTH);
		  this.add(panelop,BorderLayout.WEST);
		  this.add(panelopst,BorderLayout.EAST);
		  this.add(panelnum,BorderLayout.CENTER);
		 
		 
		 
		 //add Number
		 this.but0.addActionListener(new ActionListener(){
	    	   
	    	   public void actionPerformed(ActionEvent e){
	    		   txtin.setText(txtin.getText().concat("0"));  //0
	    	   }
	       });
		 
		 this.but1.addActionListener(new ActionListener(){
	    	   
	    	   public void actionPerformed(ActionEvent e){
	    		   txtin.setText(txtin.getText().concat("1"));  //1
	    	   }
	       });
		 
		 this.but2.addActionListener(new ActionListener(){
	    	   
	    	   public void actionPerformed(ActionEvent e){
	    		   txtin.setText(txtin.getText().concat("2"));  //2
	    	   }
	       });
		 this.but3.addActionListener(new ActionListener(){
	    	   
	    	   public void actionPerformed(ActionEvent e){
	    		   txtin.setText(txtin.getText().concat("3"));  //3
	    	   }
	       });
		
		 this.but4.addActionListener(new ActionListener(){
	    	   
	    	   public void actionPerformed(ActionEvent e){
	    		   txtin.setText(txtin.getText().concat("4"));  //4
	    	   }
	       });
		 
		 this.but5.addActionListener(new ActionListener(){
	    	   
	    	   public void actionPerformed(ActionEvent e){
	    		   txtin.setText(txtin.getText().concat("5"));  //5
	    	   }
	       });
		 
		 this.but6.addActionListener(new ActionListener(){
	    	   
	    	   public void actionPerformed(ActionEvent e){
	    		   txtin.setText(txtin.getText().concat("6"));  //6
	    	   }
	       });
		 
		 this.but7.addActionListener(new ActionListener(){
	    	   
	    	   public void actionPerformed(ActionEvent e){
	    		   txtin.setText(txtin.getText().concat("7"));  //7
	    	   }
	       });
		 
		 this.but8.addActionListener(new ActionListener(){
	    	   
	    	   public void actionPerformed(ActionEvent e){
	    		   txtin.setText(txtin.getText().concat("9"));  //8
	    	   }
	       });
		 
		 this.but9.addActionListener(new ActionListener(){
	    	   
	    	   public void actionPerformed(ActionEvent e){
	    		   txtin.setText(txtin.getText().concat("9"));  //9
	    	   }
	       });
		 
		 
		 this.butplus.addActionListener(new ActionListener(){
	    	   
	    	   public void actionPerformed(ActionEvent e){
	    		   txtin.setText(txtin.getText().concat(""));  // +
	    	   }
	       });
		 
		 this.butsub.addActionListener(new ActionListener(){
	    	   
	    	   public void actionPerformed(ActionEvent e){
	    		   txtin.setText(txtin.getText().concat(""));  // -
	    	   }
	       });
		 
		 this.butmulti.addActionListener(new ActionListener(){
	    	   
	    	   public void actionPerformed(ActionEvent e){
	    		   txtin.setText(txtin.getText().concat(""));  // *
	    	   }
	       });
		 this.butdiv.addActionListener(new ActionListener(){
	    	   
	    	   public void actionPerformed(ActionEvent e){
	    		   txtin.setText(txtin.getText().concat(""));  // >> / 
	    	   }
	       });
		 
		 this.buts.addActionListener(new ActionListener(){
	    	   
	    	   public void actionPerformed(ActionEvent e){
	    		   txtin.setText(txtin.getText().concat("."));  // >> . 
	    	   }
	       });
		 
		 
		 this.butss.addActionListener(new ActionListener(){
	    	   
	    	   public void actionPerformed(ActionEvent e){
	    		   txtin.setText(txtin.getText().concat("-"));  // >> +/-
	    	   }
	       });
		 
		 
		 this.butAc.addActionListener(new ActionListener(){
	    	   
	    	   public void actionPerformed(ActionEvent e){
	    		   txtin.setText ("");  txtout.setText("");  //(txtin.getText().concat(""));  // >> ac 
	    	   }
	       });
		 
		 
		 // Action Command +,-,x,/
		 
		 this.butplus.addActionListener(new ActionListener(){   //+
	    	   
	    	   public void actionPerformed(ActionEvent e){
	    		   x = Double.parseDouble(txtin.getText());
		           count = 1;
		           txtin.setText("");
	    	   }
	           });
		 
		 this.butsub.addActionListener(new ActionListener(){   //-
	    	   
	    	   public void actionPerformed(ActionEvent e){
	    		   x = Double.parseDouble(txtin.getText());
		           count = 2;
		           txtin.setText("");
	    	   }
	           });
		 this.butmulti.addActionListener(new ActionListener(){   //*
	    	   
	    	   public void actionPerformed(ActionEvent e){
	    		   x = Double.parseDouble(txtin.getText());
		           count = 3;
		           txtin.setText("");
	    	   }
	           });
		 
		 this.butdiv.addActionListener(new ActionListener(){   // >> / 
	    	   public void actionPerformed(ActionEvent e){
	    		   x = Double.parseDouble(txtin.getText());
		           count = 4;
		           txtin.setText("");
	    	   }
	           });
		 this.butmod.addActionListener(new ActionListener(){   // >> mod 
	    	   public void actionPerformed(ActionEvent e){
	    		   x = Double.parseDouble(txtin.getText());
		           count = 5;
		           txtin.setText("");
	    	   }
	           });
		 
		 this.butpow.addActionListener(new ActionListener(){   // >> pow 
	    	   public void actionPerformed(ActionEvent e){
	    		   x = Double.parseDouble(txtin.getText());
		           count = 6;
		           txtin.setText("");
	    	   }
	           });
		 
		 this.butper.addActionListener(new ActionListener(){   // >> %  
	    	   public void actionPerformed(ActionEvent e){
	    		   x = Double.parseDouble(txtin.getText());
		           count = 7;
		           txtin.setText("");
	    	   }
	           });
		 
		 
		 this.butas.addActionListener(new ActionListener(){   // =  total
	    	   
	    	   public void actionPerformed(ActionEvent e){
	    		   y=Double.parseDouble(txtin.getText());
		            switch(count)
		            {
		                case 1: result=x+y;
		                break;
		               
		                case 2: result =x-y;
		                break;
		               
		                case 3: result = x*y;
		                break;
		               
		                case 4: result = x/y;
		                break;
		               
		                case 5 : result = x%y;
		                break;
		               
		                case 6 : result = Math.pow(x, y);
		                break;
		                
		                case 7 : result = (x*y/100);
		                break;
		                
		                default: result=0;
		            }
		            txtout.setText(""+result);
		 
	    	   }
		 });
		 
		 
		 
		 
		 
		 
		 //Math Faction
		
		 this.butsin.addActionListener(new ActionListener(){   // sin
		 	   
		 	   public void actionPerformed(ActionEvent e){
		 		   a = Math.sin(Double.parseDouble(txtin.getText()));
			          
			           txtin.setText("");
			           txtout.setText(txtout.getText() + a);
		 	   }
		        });
		 
		 
		 this.butcos.addActionListener(new ActionListener(){   // cos
		 	   
		 	   public void actionPerformed(ActionEvent e){
		 		   a = Math.cos(Double.parseDouble(txtin.getText()));
			          
			           txtin.setText("");
			           txtout.setText(txtout.getText() + a);
		 	   }
		        });
		 
		 
		 this.buttan.addActionListener(new ActionListener(){   // tan
		 	   
		 	   public void actionPerformed(ActionEvent e){
		 		   a = Math.tan(Double.parseDouble(txtin.getText()));
			          
			           txtin.setText("");
			           txtout.setText(txtout.getText() + a);
		 	   }
		        });
		 
		 
		 this.butsqrt.addActionListener(new ActionListener(){   // sqrt
		 	   
		 	   public void actionPerformed(ActionEvent e){
		 		   a = Math.sqrt(Double.parseDouble(txtin.getText()));
			          
			           txtin.setText("");
			           txtout.setText(txtout.getText() + a);
		 	   }
		        });
		 
		 this.butlog.addActionListener(new ActionListener(){   // log10
		 	   
		 	   public void actionPerformed(ActionEvent e){
		 		   a = Math.log10(Double.parseDouble(txtin.getText()));
			         
			           txtin.setText("");
			           txtout.setText(txtout.getText() + a);
		 	   }
		        });
		 
		 this.butpi.addActionListener(new ActionListener(){   // pi
		 	   
		 	   public void actionPerformed(ActionEvent e){
		 		   a =  Math.PI;//(Double.parseDouble(txtin.getText()));
			          
			           txtin.setText("");
			           txtout.setText(txtout.getText() + a);
		 	   }
		        });
		 
		 
		 
		 this.butexp.addActionListener(new ActionListener(){   // exp
		 	   
		 	   public void actionPerformed(ActionEvent e){
		 		   a = Math.exp(Double.parseDouble(txtin.getText()));
			         
			           txtin.setText("");
			           txtout.setText(txtout.getText() + a);
		 	   }
		        });
		 
		 this.butE.addActionListener(new ActionListener(){   //E
		 	   
		 	   public void actionPerformed(ActionEvent e){
		 		   a = Math.E; //(Double.parseDouble(txtin.getText()));
			          // count =1;
			           txtin.setText("");
			           txtout.setText(txtout.getText() + a);
		 	   }
		        });
		 
		 this.butexp.addActionListener(new ActionListener(){   // tan
		 	   
		 	   public void actionPerformed(ActionEvent e){
		 		   a = Math.exp(Double.parseDouble(txtin.getText()));
			          
			           txtin.setText("");
			           txtout.setText(txtout.getText() + a);
		 	   }
		        });
		 
		 
		 this.butabs.addActionListener(new ActionListener(){   //abs
		 	   
		 	   public void actionPerformed(ActionEvent e){
		 		   a = Math.abs(Double.parseDouble(txtin.getText()));
			          // count =1;
			           txtin.setText("");
			           txtout.setText(txtout.getText() + a);
		 	   }
		        });
}
	

	protected int a(double parseDouble) {
		return 0;
	}


	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable(){
			 
            @Override
            public void run() {
            new Scicalc255 ();
        }
 
      });
	}

}
