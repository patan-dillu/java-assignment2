import java.awt.*;
import java.applet.*;
 
public class ConcentricCircles2 extends Applet
{
 String str = "Concentric Circles";
 
 public void paint(Graphics g) 
 {
  g.setColor(Color.pink);
  g.drawOval(20,20,45,45);
  
  g.setColor(Color.red);
  g.drawOval(10,10,65,65);
  
  g.setColor(Color.green);
  g.drawOval(30,30,25,25);
  
  g.setColor(Color.black);
  g.setFont(new Font("Times New Roman",Font.BOLD|Font.ITALIC,20));
  g.drawString(str,100,20);
 }
}