import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Tik_Tac_Toe implements ActionListener
{
	JFrame win=new JFrame();
	//GridLayout grid=new GridLayout(3,3,10,10);
	JButton b1=new JButton();
	JButton b2=new JButton();
	JButton b3=new JButton();
	JButton b4=new JButton();
	JButton b5=new JButton();
	JButton b6=new JButton();
	JButton b7=new JButton();
	JButton b8=new JButton();
	JButton b9=new JButton();
	JButton b10=new JButton();
	JButton reset=new JButton("Reset");
	JButton ex=new JButton("Exit");
	JPanel p1=new JPanel();
	JPanel p2=new JPanel();
	JLabel l1=new JLabel("Player One = X");
	JLabel l2=new JLabel("Player Two = O");
	
	JPanel panal=new JPanel();
	JPanel panal2=new JPanel();
	
	boolean b=true;
	Tik_Tac_Toe()
	{
		win.setLayout(null);
		ex.setBackground(Color.gray);
		reset.setBackground(Color.GREEN);
		//.setBounds(0,0,350,350);
		//panal2.setBounds(350,100,350,350);
		p1.setLayout(new GridLayout(3,3));
		p2.setLayout(null);
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		p1.add(b4);
		p1.add(b5);
		p1.add(b6);
		p1.add(b7);
		p1.add(b8);
		p1.add(b9);
		win.add(reset);
		win.add(ex);
		//p2.setBackground(Color.red);
		win.add(l1);
		win.add(l2);
		p1.setBounds(40,40,300,300);
		//panal2.add(b10);
		//win.add(panal);
		//win.add(panal2);
		p2.setBounds(310,10,300,300);
		reset.setBounds(400,100,80,40);  
		ex.setBounds(400,170,80,40);  
		b1.setBounds(50,100,50,50);  
		b2.setBounds(100,100,50,50);  
		b3.setBounds(150,100,50,50);  
		  b4.setBounds(50,150,50,50);  
		  b5.setBounds(100,150,50,50);  
		      b6.setBounds(150,150,50,50);  
			      b7.setBounds(50,200,50,50);  
				   b8.setBounds(100,200,50,50);  
				       b9.setBounds(150,200,50,50);
					   win.setTitle("Tic Tac Toe");
l1.setBounds(50,310,100,100);					   
l2.setBounds(50,340,100,100);					   
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		reset.addActionListener(this);
		ex.addActionListener(this);
		
		win.setBounds(0,0,600,600);
		win.add(p1);
		win.add(p2);
		win.show();
	}
	public void actionPerformed(ActionEvent e)
	{
		b=!b;
		JButton but=(JButton)e.getSource();
		if(b==true)
		{
			but.setLabel("O");
			reset.setLabel("Reset");
			//but.setBackground(Color.red);
			
		}
		else 
		{
			but.setLabel("X");
			//but.setBackground(Color.blue);
			reset.setLabel("Reset");
		}
		if(b1.getLabel().equals("O")&& b2.getLabel().equals("O")&& b3.getLabel().equals("O"))
		{
			
			
			JOptionPane.showMessageDialog(null,"Second Player win");
		clear();
		}
		if(reset==e.getSource())
		{
			clear();
		}
		if(ex==e.getSource())
		{
			System.exit(0);
		}
		 else if(b4.getLabel().equals("O")&& b5.getLabel().equals("O") && b6.getLabel().equals("O"))
		 {
			 JOptionPane.showMessageDialog(null,"Second Player win");
clear();		
		}
		 else if(b1.getLabel().equals("O")&& b5.getLabel().equals("O") && b9.getLabel().equals("O"))
		{
			JOptionPane.showMessageDialog(null,"Second Player win");
		clear();
		}
		else if(b3.getLabel().equals("O") && b5.getLabel().equals("O")&& b7.getLabel().equals("O"))
		{
			JOptionPane.showMessageDialog(null,"Second Player win");
		clear();
		}
		else if(b1.getLabel().equals("O") && b4.getLabel().equals("O") && b7.getLabel().equals("O"))
		{
		
		JOptionPane.showMessageDialog(null,"Second Player win");
		clear();
		}
		else if(b7.getLabel().equals("O") && b8.getLabel().equals("O") && b9.getLabel().equals("O") )
		{
			JOptionPane.showMessageDialog(null,"Second player win");
			clear();		
		}
		else if(b3.getLabel().equals("O") && b6.getLabel().equals("O") && b9.getLabel().equals("O"))
		{
			JOptionPane.showMessageDialog(null,"Second Player win");
		clear();
		}
		else if(b2.getLabel().equals("O") && b5.getLabel().equals("O") && b8.getLabel().equals("O"))
		{
			JOptionPane.showMessageDialog(null,"Second Player win");
		clear();
		}
	
	   else if(b1.getLabel().equals("O")&& b2.getLabel().equals("O")&& b3.getLabel().equals("O"))
		{		
			JOptionPane.showMessageDialog(null,"Second Player win");
		clear();
		}
		 else if(b1.getLabel().equals("X")&& b5.getLabel().equals("X") && b9.getLabel().equals("X"))
		{
			JOptionPane.showMessageDialog(null,"First Player win");
		clear();
		}
		else if(b3.getLabel().equals("X") && b5.getLabel().equals("X") && b7.getLabel().equals("X"))
		{
			JOptionPane.showMessageDialog(null,"First Player win");
		clear();
		}
		else if(b1.getLabel().equals("X") && b4.getLabel().equals("X") && b7.getLabel().equals("X"))
		{
			JOptionPane.showMessageDialog(null,"First Player win");
		clear();
		}
		else if(b7.getLabel().equals("X") && b8.getLabel().equals("X") && b9.getLabel().equals("X") )
		{
			JOptionPane.showMessageDialog(null,"First player win");
		clear();
		}
		else if(b3.getLabel().equals("X") && b6.getLabel().equals("X") && b9.getLabel().equals("X"))
		{
			JOptionPane.showMessageDialog(null,"First Player win");
		clear();
		}
		else if(b2.getLabel().equals("X")&& b5.getLabel().equals("X") && b8.getLabel().equals("X"))
		{
			JOptionPane.showMessageDialog(null,"First Player win");
		clear();
		}
		else if(b4.getLabel().equals("X") && b5.getLabel().equals("X") && b6.getLabel().equals("X"))
		{
			JOptionPane.showMessageDialog(null,"First Player Win");
		clear();
		}
		else if(b1.getLabel().equals("X") && b2.getLabel().equals("X") && b3.getLabel().equals("X"))
		{
			JOptionPane.showMessageDialog(null,"First Player Win");
			clear();
			//but.setEnabled(false);
		}
		if(!b1.getLabel().equals("")&& !b2.getLabel().equals("")&& !b3.getLabel().equals("")&& !b4.getLabel().equals("")&& !b5.getLabel().equals("") && !b6.getLabel().equals("") && !b7.getLabel().equals("") && !b8.getLabel().equals("") && !b9.getLabel().equals(""))
		//setEnableall();
		{
			JOptionPane.showMessageDialog(null,"match Draw");
			clear();		
		}
		
	}
		public void clear()
		{
			b1.setLabel("");
			b2.setLabel("");
			b3.setLabel("");
			b4.setLabel("");
			b5.setLabel("");
			b6.setLabel("");
			b7.setLabel("");
			b8.setLabel("");
			b9.setLabel("");
		}


public static void main(String arg[])
{
	new Tik_Tac_Toe();
}
}