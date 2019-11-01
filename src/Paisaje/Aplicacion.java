package Paisaje;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;

import javax.swing.JFrame;
import Paisaje.Figuras;

public class Aplicacion extends JFrame {
	public static final int ANCHURA = 800;
	public static final int ALTURA = 600;
	
	public Aplicacion() {
		setTitle("Proyecto 1");
		setSize(ANCHURA, ALTURA+10);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setBackground(Color.decode("#14AFC3"));
		setVisible(true);
	}
	
	public void paint(Graphics g) {
		
		Graphics2D g2d = (Graphics2D)g;
		g2d.setPaint(new GradientPaint(0, 0, Color.decode("#04ADC5"), ANCHURA, ALTURA, Color.decode("#C7EDA1")));
		g2d.fillRect(0, 0, ANCHURA, ALTURA);
		
        g.setColor(Color.decode("#CDE9DD"));
        g.fillRect(0, ALTURA-20, ANCHURA, 20);
        g.fillRect(0, ALTURA-80, ANCHURA, 20);
        
        g.setColor(Color.decode("#434142"));
        g.fillRect(0, ALTURA-60, ANCHURA, 40);
        
        g.setColor(Color.decode("#E5E38F"));
        lineasCalle(g, 30, ALTURA-45, 50, 8);
        
        Figuras.edificioRojo(g, 20, 115);
        
        
    }
	
	public void lineasCalle(Graphics g, int x, int y, int anchura, int altura) {
		if(x < ANCHURA) {
			g.fillRect(x, y, anchura, altura);
			lineasCalle(g, x+70, y, anchura, altura);
		}
	}
	
	public static void main(String[] args) {
		new Aplicacion();
	}

}
