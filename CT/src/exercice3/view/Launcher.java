package exercice3.view;

import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import exercice3.model.Scene;

public class Launcher extends JFrame {
	
	/**
	 * Réponse à la question 2 exercice 3 :
	 * La zone de jeu est mise à jour grâce au design pattern Observer.
	 * Dès qu'il y a une modification, la classe modifiée notifie la vue qui va ensuite mettre à jour l'ensemble.
	 */

	static final int PERIOD = 50; // Update period in milliseconds
	
	SceneView view;
	Scene model;
	
	public Launcher() {
		setTitle("Asteroids");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		model = new Scene();
		view = new SceneView(model);
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

