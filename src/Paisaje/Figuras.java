package Paisaje;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public final class Figuras {
	public static void ventanaRedonda(Graphics g, int x, int y) {
		Graphics2D g2d = (Graphics2D)g;
		g2d.setColor(Color.decode("#6E4F3B"));
		g2d.setStroke(new BasicStroke(4));
		g2d.drawRoundRect(x, y, 30, 48, 30, 30);
		g2d.setColor(Color.decode("#E8ECEC"));
		g2d.fillRoundRect(x, y, 30, 48, 30, 30);
		g2d.setColor(Color.decode("#6E4F3B"));
		g2d.fillRect(x, y+45, 30, 3);
		g2d.drawLine(x, y+25, x+30, y+25);
	}
	
	public static void ventanaCuadrada(Graphics g, int x, int y) {
		ventana(g, x, y, true);
	}
	
	public static void ventanaRectangular(Graphics g, int x, int y) {
		ventana(g, x, y, false);
	}
	
	public static void ventana(Graphics g, int x, int y, boolean cuadrada) {
		Graphics2D g2d = (Graphics2D)g;
		g2d.setColor(Color.decode("#6E4F3B"));
		g2d.setStroke(new BasicStroke(4));
		g2d.drawRect(x, y, 30, 50);
		g2d.setColor(Color.decode("#E8ECEC"));
		g2d.fillRect(x, y, 30, 50);
		g2d.setColor(Color.decode("#6E4F3B"));
		if(cuadrada)
			g2d.drawLine(x, y+25, x+30, y+25);
	}
	
	public static void puertaRectangular(Graphics g, int x, int y) {
		Graphics2D g2d = (Graphics2D)g;
		g2d.setColor(Color.decode("#6E4F3B"));
		g2d.setStroke(new BasicStroke(4));
		g2d.drawRect(x, y, 50, 90);
		g2d.setColor(Color.decode("#E8ECEC"));
		g2d.fillRect(x+2, y+2, 46, 86);
		g2d.setColor(Color.decode("#6E4F3B"));
		g2d.drawLine(x, y+45, x+50, y+45);
		g2d.drawLine(x+25, y, x+25, y+90);
		g2d.setColor(Color.decode("#E8ECEC"));
		g2d.fillOval(x-2, y+42, 5, 5);
	}
	
	public static void techo(Graphics g, int x, int y) {
		Graphics2D g2d = (Graphics2D)g;
		g2d.setColor(Color.decode("#d2cda6")); 
		g.fillRect(x, y, 160, 20);
		g2d.setColor(Color.decode("#EAE4B9"));
		g.fillPolygon(new int[] { x, x+160, x+140, x+20 },  new int[] { y+20, y+20, y+27, y+27 }, 4);
		g2d.setColor(Color.decode("#000"));
		g2d.setStroke(new BasicStroke(1));
		g2d.drawLine(x+20, y+20, x+20, y+27);
		g2d.drawLine(x+40, y+20, x+40, y+27);
		g2d.drawLine(x+60, y+20, x+60, y+27);
		g2d.drawLine(x+80, y+20, x+80, y+27);
		g2d.drawLine(x+100, y+20, x+100, y+27);
		g2d.drawLine(x+120, y+20, x+120, y+27);
		g2d.drawLine(x+135, y+20, x+135, y+27);
		
		g2d.drawLine(x, y+7, x+160, y+7);
		g2d.drawLine(x, y+14, x+160, y+14);
	}
	
	public static void puertaCircular(Graphics g, int x, int y) {
		Graphics2D g2d = (Graphics2D)g;
		g2d.setColor(Color.decode("#6E4F3B"));
		g2d.setStroke(new BasicStroke(4));
		g2d.drawRoundRect(x, y, 50, 90, 30, 30);
		g2d.setColor(Color.decode("#7D5C73"));
		g2d.fillRoundRect(x+1, y+1, 48, 88, 30, 30);
		g2d.setColor(Color.decode("#6E4F3B"));
		g2d.setColor(Color.decode("#E8ECEC"));
		g2d.fillRect(x+8, y+15, 15, 15);
		g2d.fillRect(x+28, y+15, 15, 15);
		g2d.fillRect(x+8, y+35, 15, 15);
		g2d.fillRect(x+28, y+35, 15, 15);
	}
	
	public static void edificioRojo(Graphics g, int x, int y) {
		Graphics2D g2d = (Graphics2D)g;
		techo(g, x, y);
		g2d.setColor(Color.decode("#C76467"));
		g2d.fillRect(x+10, y+27, 140, 110);
		ventanaRedonda(g, x+20, y+35);
		ventanaRedonda(g, x+55, y+35);
		ventana(g, x+95, y+45, false);
		techo(g, x, y+135);
		g2d.setColor(Color.decode("#C76467"));
		g2d.fillRect(x+10, y+162, 140, 110);
		ventanaRedonda(g, x+20, y+170);
		ventanaRedonda(g, x+55, y+170);
		ventana(g, x+95, y+180, false);
		techo(g, x, y+270);
		g2d.setColor(Color.decode("#C76467"));
		g2d.fillRect(x+10, y+297, 140, 110);
		ventanaRedonda(g, x+20, y+305);
		ventanaRedonda(g, x+55, y+305);
		puertaRectangular(g, x+95, y+315);
	}
}
