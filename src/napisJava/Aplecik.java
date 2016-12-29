package napisJava;

import java.applet.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class Aplecik extends Applet {
	//Napis napis;
	private final static int N = 6;
	private ArrayList<Napis> napis = new ArrayList();
	
	@Override
	public void init() {
		setSize(500,500);
		setBackground(Color.white);
		Dimension d = getSize();
		for (int i=0; i<N; i++)
			napis.add(new Napis(d));
		
		class Animacja extends TimerTask{

			@Override
			public void run() {
				Dimension d = getSize();
				for(Napis n : napis)
					n.ruch(d);
				repaint();
			}
		}
		Timer go = new Timer();
		go.schedule(new Animacja(), 0, 20);
	}

	@Override
	public void paint(Graphics g) {
		for (Napis n : napis)
			n.rysuj(g);
	}

	
}
