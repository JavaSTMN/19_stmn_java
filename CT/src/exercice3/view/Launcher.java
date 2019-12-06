package exercice3.view;

import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import exercice3.model.Scene;

public class Launcher extends JFrame {
	
	/**
	 * R�ponse � la question 2 exercice 3 :
	 * La zone de jeu est mise � jour gr�ce au design pattern Observer.
	 * D�s qu'il y a une modification, la classe modifi�e notifie la vue qui va ensuite mettre � jour l'ensemble.
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

