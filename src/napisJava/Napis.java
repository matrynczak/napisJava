package napisJava;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Random;

public class Napis {
	String napis;
	private int x;
	private int y;
	Random rnd;
	private Color kolor;
	int dy = 5;
	
	public Napis(Dimension d){
		rnd = new Random();
		kolor = new Color (rnd.nextFloat(), rnd.nextFloat(), rnd.nextFloat());
		x = rnd.nextInt(d.width-40);
		y = rnd.nextInt(d.height-40);
		napis = "JAVA";
	}
	
	public void rysuj(Graphics g){
		g.setColor(kolor);
		g.drawString(napis, x, y);
	}

	public void ruch(Dimension d) {
		y = y + dy;
		
		if(y >= d.height || y<= 0) dy *= -1;
	}
}
