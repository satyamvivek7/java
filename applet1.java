import java.awt.*;
import java.applet.*;
public class applet1 extends Applet
        {
        public void paint(Graphics g)
                {
                g.drawString("This is my first program in applet.",10,10);
				g.drawLine(20,20,200,200);
				g.setColor(Color.green);
				g.drawRect(220,250,100,100);
				g.setColor(Color.red);
				g.fillRect(400,400,600,600);
					
                }
        }

		