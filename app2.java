import java.applet.*;
import java.awt.*;

// <applet code=app2 width=500 height=500></applet>

public class app2 extends Applet
{
	public void init()
	{
		System.out.println("\n\t I am in init()");
	}

	public void start()
	{
		System.out.println("\n\t I am in start()");
	}

	public void paint(Graphics g)
	{
		g.drawString("Life Cycle of Applet",200,100);
	}

	public void stop()
	{
		System.out.println("\n\t I am in stop()");
	}

	public void destroy()
	{
		System.out.println("\n\t I am in destroy()");
	}
}