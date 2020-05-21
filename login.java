import java.awt.*;
import java.awt.event.*;

import java.sql.*;
class login extends Frame implements ActionListener
{Button b1;Connection con;Statement st;ResultSet rs;String s1,s2,s3,s4,s5;TextField l1, l2,l3;BorderLayout bl;FlowLayout fl;Label t1,t2,t3;
   login()
{try{MenuItem mi1;
Class.forName("com.mysql.jdbc.Driver");//learn exactly


//JDBC URL main protocol:sub protocol:db info
con=DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","akash");//("url",user,password)//learn url but remember to change name of database(bus1) accordingly

 st=con.createStatement();
setBackground(Color.cyan);
}
catch(Exception e){System.out.println("EXC "+e);}
bl=new BorderLayout();

fl=new FlowLayout();
setLayout(null);
Font f1=new Font("Verdana",Font.BOLD,30);
setFont(f1);
b1=new Button("ok");
b1.setBounds(1000,500,90,40);
t3=new Label("LIBRARY FORM LOGIN");
t3.setBounds(950,50,500,100);
add(t3);
l1=new TextField();
l1.setBounds(1200,200,150,50);
add(l1);
 l2=new TextField();
l2.setBounds(1200,300,150,50);
add(l2);
t1=new Label("Username");
t1.setBounds(900,200,150,30);
add(t1);
t2=new Label("password");
t2.setBounds(900,300,150,30);
add(t2);
b1.addActionListener(this);




add(b1);


}
public void actionPerformed(ActionEvent ae)
{
try
{
rs=st.executeQuery("select*from login");

s3=l1.getText();//not getString
 s4=l2.getText();

 
while(rs.next())
{ s1=rs.getString("uname");
  s2=rs.getString("pswd");
 s5=rs.getString("role");

if(s3.equals(s1)&&s4.equals(s2))
{
if(s5.equals("admin"))
{
fr3 a1=new fr3();
 a1.setSize(300,200);
a1.setVisible(true);
//dispose();
}
else
{

fr2 c1=new fr2();

c1.setSize(200,300);

c1.setVisible(true);
System.out.println("2");
//dispose();
 System.out.println("3");
}
}}



rs.close();
st.close();
con.close();

}catch(Exception e){System.out.println("EXC "+e);}
}

}







