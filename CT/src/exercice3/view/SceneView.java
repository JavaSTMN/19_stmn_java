package exercice3.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import exercice1.Vector;
import exercice3.model.Scene;
import exercice3.model.Spacecraft;

public class SceneView extends JPanel implements Observer {
	
	private final Scene model;
	
	public SceneView(Scene model) {
        setBorder(BorderFactory.createLineBorder(Color.black));
        this.model = model;
        this.model.addObserver(this);
        Spacecraft spacecraft = model.getSpacecraft();
        Dimension prefered = getPreferredSize();
		spacecraft.setX(prefered.width/2);
		spacecraft.setY(prefered.height/2);
        setFocusable(true);
        addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// Not needed				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// Not needed				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				switch (e.getKeyChar()) {
				case 'q':
					spacecraft.setBearing(spacecraft.getBearing() - Math.toRadians(8f));
					break;
				case 's':
					spacecraft.setBearing(spacecraft.getBearing() + Math.toRadians(8f));
					break;
				case 'z':
					spacecraft.move(1f); // TODO: replace with real time
					break;

				}				
			}
		});
    }

    public Dimension getPreferredSize() {
        return new Dimension(500,500);
    }
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        Spacecraft spacecraft = model.getSpacecraft();
        exercice3.view.Spacecraft.draw(g, spacecraft.getX(), spacecraft.getY(), spacecraft.getBearing());  
    }

	@Override
	public void update(Observable o, Object arg) {
		repaint();
	}  
}
