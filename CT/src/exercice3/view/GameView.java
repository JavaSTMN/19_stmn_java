package exercice3.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.AffineTransform;
import java.util.Observable;
import java.util.Observer;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import exercice3.model.GameArea;
import exercice3.model.Shuttle;

public class GameView extends JPanel implements Observer {
	
	private final GameArea model;
	
	public GameView(GameArea model) {
        setBorder(BorderFactory.createLineBorder(Color.black));
        this.model = model;
        this.model.addObserver(this);
        Shuttle shuttle = model.getShuttle();
        Dimension prefered = getPreferredSize();
		shuttle.setX(prefered.width/2);
		shuttle.setY(prefered.height/2);
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
					// TODO Fill me
					int x = model.getShuttle().getX();
					model.getShuttle().setX((int) (x - 2 ));
					model.getShuttle().setAngle(8);
					model.update(Launcher.PERIOD);

					AffineTransform rotation = new AffineTransform();
					rotation.rotate(8, model.getShuttle().getX(), model.getShuttle().getY());
					 //exercice3.view.Shuttle.drawImage(gCopy, rotation, null);
					System.out.println("q pressed");
				case 'z' :
					int xPos = model.getShuttle().getX();
					int yPos = model.getShuttle().getY();

					
					model.getShuttle().setY((int) ((yPos -  1  )));
					break;
				// TODO Fill me
				}				
			}
		});
    }

    public Dimension getPreferredSize() {
        return new Dimension(400,400);
    }
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        Shuttle shuttle = model.getShuttle();
        exercice3.view.Shuttle.draw(g, shuttle.getX(), shuttle.getY(), 0);  
        
    }

	@Override
	public void update(Observable o, Object arg) {
		repaint();
	}  
}
