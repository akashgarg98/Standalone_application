import java.awt.*;
import java.awt.event.*;
import java.sql.*;
class delete extends Frame implements ActionListener
{Button b1;Connection con;Statement st;ResultSet rs;String s1,s2;TextField l1, l2,l3;BorderLayout bl;FlowLayout fl;Label t1,t2,t3;
   delete()
{
bl=new BorderLayout();

fl=new FlowLayout();
setLayout(null);
Font f1=new Font("Verdana",Font.BOLD,20);
setFont(f1);
b1=new Button("delete");
b1.setBounds(1000,500,90,40);

l1=new TextField();
l1.setBounds(1300,200,150,50);
add(l1);
 l2=new TextField();
l2.setBounds(1300,300,150,50);
add(l2);
l3=new TextField();
l3.setBounds(1300,400,150,50);
add(l3);
t1=new Label(" delete Username");
t1.setBounds(600,200,150,30);
add(t1);
t2=new Label("delete password");
t2.setBounds(600,300,150,30);
add(t2);
t3=new Label("delete role");
t3.setBounds(600,400,150,30);
add(t3);
setBackground(Color.green);


b1.addActionListener(this);
add(b1);
}
public void actionPerformed(ActionEvent ae)
{String s1=l1.getText();
String s2=l2.getText();
String s3=l3.getText();
try
{Class.forName("com.mysql.jdbc.Driver");//learn exactly


//JDBC URL main protocol:sub protocol:db info
con=DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","akash");//("url",user,password)//learn url but remember to change name of database(bus1) accordingly

 st=con.createStatement();

if(ae.getSource()==b1)
{st.executeUpdate("DELETE FROM login WHERE uname LIKE  "+s1+"");
/*st.executeUpdate("DELETE FROM  login WHERE pswd  LIKE "+s2+"");
st.executeUpdate("DELETE FROM  login WHERE role LIKE "+s3+"");
*/
st.close();
con.close();
}}catch (Exception e1)
{System.out.println(" "+e1);}
}}
