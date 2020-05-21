import java.awt.*;
import java.awt.event.*;
class fr2 extends Frame implements ActionListener

{
fr2(){
MenuItem mi2,mi3,mi4,mi1;
MenuBar w1=new MenuBar();
setMenuBar(w1);
Menu file=new Menu("update");
mi1=new MenuItem("Add");
mi1.addActionListener(this);
file.add(mi1);
mi2=new MenuItem("veiw");
//mi1.addActionListener(this);
file.add(mi2);

mi4=new MenuItem("delete");
mi4.addActionListener(this);
file.add(mi4);
w1.add(file);
w1.setFont(new Font("sans-serif",Font.PLAIN,20));



}
public void actionPerformed(ActionEvent ae2)
{if(ae2.getActionCommand().equals("Add"))
{
add q1=new add();
q1.setSize(200,300);
q1.setVisible(true);}
if(ae2.getActionCommand().equals("delete"))
{
delete q2=new delete();
q2.setSize(200,300);
q2.setVisible(true);}
/*if(ae2.getActionCommand().equals("veiw"))
{
veiw q3=new veiw();
q3.setSize(200,300);
q3.setVisible(true);}*/}}