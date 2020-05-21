import java.awt.*;
import java.awt.event.*;

import java.sql.*;
class fra extends Frame implements ActionListener
{Button b5;Label l;FlowLayout fl;
        fra()
    {fl=new FlowLayout();
     setLayout(null);
Font f=new Font("sans-serif",Font.PLAIN,30);

b5=new Button("start");
	b5.addActionListener(this);
	add(b5);
		 l=new Label("WELCOME TO LIBRARY LOGIN SYSTEM");
		add(l);
		l.setBounds(600,150,2000,40);
		b5.setBounds(850,300,120,80);
		setFont(f);
		setBackground(Color.yellow);
		}
		public void actionPerformed(ActionEvent qw)
		{if(qw.getSource()==b5)
		{login lg=new login();
		lg.setSize(300,200);
		lg.setVisible(true);}}}






class start
{
public static void main(String args[])
{fra f1=new fra();
f1.setSize(300,200);
f1.setVisible(true);}}