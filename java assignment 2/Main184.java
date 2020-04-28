import java.awt.*;
import java.applet.*;
 
public class Main184 extends Applet
{
<applet code="Main184.class" width=400 height=450></applet>
public void paint(Graphics gp)
{ int [] x = {150, 300, 225};
int [] y = {150, 150, 25};
gp.drawRect(150, 150, 150, 200); 
gp.drawRect(200, 200, 50, 150); 
gp.drawOval(200, 75, 50, 50); 
gp.drawPolygon(x, y, 3); 
}
}