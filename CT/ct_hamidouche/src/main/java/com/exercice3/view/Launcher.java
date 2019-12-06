package com.exercice3.view;

import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import com.exercice3.model.GameArea;

public class Launcher extends JFrame {

	static final int PERIOD = 50; // Update period in milliseconds
	
	GameView view;
	GameArea model;
	
	public Launcher() {
		setTitle("Asteroids");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		model = new GameArea();
		view = new GameView(model);
		add(view);
	}
	
	
	public static void main(String[] args) {
		Launcher p = new Launcher();
	    
		p.pack();
		p.setVisible(true);
		
		Timer timer = new Timer("Updater");
		TimerTask task = new TimerTask() {
			@Override
			public void run() {
				SwingUtilities.invokeLater(()->{p.model.update(PERIOD/1000.);});
			}
		};
		timer.scheduleAtFixedRate(task, 0, PERIOD);
	}
	
}

