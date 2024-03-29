
import java.util.Scanner;

import javax.swing.*;

import java.applet.*;
import java.awt.*;

public class StudentGraphicExample extends JPanel
{
	int count = 10;
	int forColor = 1;
	public void paint (Graphics page)
	{
		//setBackground(Color.WHITE);
		page.setColor(Color.RED);
		String out = "String output is done like this ";
		Font saveFont = page.getFont();
		page.setFont(new Font("Times New Roman", Font.BOLD, 25));
		page.drawString(out, 500, 200);
		page.setFont(new Font("Arial", Font.BOLD, 15));
		page.setColor(new Color(102,27,221));
		out ="custom color see paint program";
		page.drawString(out, 500, 250);
		page.setFont(saveFont);
		page.setColor(Color.GREEN);
		page.drawString(out, 500, 300);
		graph(page);
	}
	public void graph(Graphics page)
	{
		int x;
		page.setColor(Color.BLACK);
		for(x= 10; x < 19; x++)
		{
			page.drawLine (x, 600, x, 500);  // line
		}
		page.setColor(new Color(49,238,105));
		for(x= 20; x < 29; x++)
		{
			page.drawLine (x, 600, x, 400);  // line
		}
		page.setColor(new Color(223,50,237));
		for(x= 30; x < 39; x++)
		{
			page.drawLine (x, 600, x, 300);  // line
		}
		page.setColor(new Color(200,200,200));
		for(x= 40; x < 49; x++)
		{
			page.drawLine (x, 600, x, 200);  // line
		}
		page.setColor(new Color(139,226,168));
		for(x= 50; x < 59; x++)
		{
			page.drawLine (x, 600, x, 100);  // line
		}
		page.setColor(new Color(50,50,250));
		for(x= 60; x < 69; x++)
		{
			page.drawLine (x, 600, x, 500);  // line
		}
		page.setColor(new Color(250,10,10));
		for(x= 70; x < 79; x++)
		{
			page.drawLine (x, 600, x, 300);  // line
		}
		page.setColor(new Color(125,226,50));
		for(x= 80; x < 89; x++)
		{
			page.drawLine (x, 600, x, 100);  // line
		}
		setNewColor(page, 9);
		for(x= 90; x < 99; x++)
		{
			page.drawLine (x, 600, x, 200);  // line
		}
		setNewColor(page, 10);
		for(x= 100; x < 109; x++)
		{
			page.drawLine (x, 600, x, 500);  // line
		}
		setNewColor(page, 11);
		for(x= 110; x < 119; x++)
		{
			page.drawLine (x, 600, x, 100);  // line
		}
		setNewColor(page, 1);
		for(x= 120; x < 729; x++)
		{
			page.drawLine (x, 600, x, 400);  // line
		}
		page.drawLine (800, 600, 900, 400);  // line
		page.drawRect (50, 50, 40, 40);    // square
		page.drawRect (60, 80, 230, 30);   // rectangle
		page.drawOval (175, 65, 80, 80);    // circle
	}
	private void setNewColor(Graphics page, int forColor)
	{
		switch (forColor)
		{
		case 1:
			page.setColor(Color.BLACK);
			break;
		case 2:
			page.setColor(Color.BLUE);
			break;
		case 3:
			page.setColor(Color.CYAN);
			break;
		case 4:
			page.setColor(Color.DARK_GRAY);
			break;
		case 5:
			page.setColor(Color.GRAY);
			break;
		case 6:
			page.setColor(Color.GREEN);
			break;
		case 7:
			page.setColor(Color.LIGHT_GRAY);
			break;
		case 8:
			page.setColor(Color.DARK_GRAY);
			break;
		case 9:
			page.setColor(Color.MAGENTA);
			break;
		case 10:
			page.setColor(Color.ORANGE);
			break;
		case 11:
			page.setColor(Color.PINK);
			break;
		case 12:
			page.setColor(Color.YELLOW);
			break;
		}
	}
}
