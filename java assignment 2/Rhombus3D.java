import java.awt.*;
import java.applet.*;
<applet code="Rhombus3D" width=300 height=200>
</applet>
public class Rhombus3D extends Applet 
{
	public void init()
	{
		setBackground(Color.black);	
	}	  
	public void paint(Graphics g) 
	{
		g.setColor (Color.gray);
		g.draw3DRect (25, 10, 50, 75, true);
		g.draw3DRect (25, 110, 50, 75, false);
		g.fill3DRect (100, 10, 50, 75, true);
		g.fill3DRect (100, 110, 50, 75, false);
	}
}