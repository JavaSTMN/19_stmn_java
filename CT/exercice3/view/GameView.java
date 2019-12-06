package exercice3.view;

import exercice3.model.GameArea;
import exercice3.model.Shuttle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Observable;
import java.util.Observer;

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
		shuttle.setOrientation(0);
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
				Shuttle shuttle = model.getShuttle();
				switch (e.getKeyChar()) {
				case 'q':
					shuttle.setOrientation(shuttle.getOrientation() - 8);
					exercice3.view.Shuttle.draw(getGraphics(), shuttle.getX(), shuttle.getY(), shuttle.getOrientation());
					break;

				case 's':
					shuttle.setOrientation(shuttle.getOrientation() + 8);
					exercice3.view.Shuttle.draw(getGraphics(), shuttle.getX(), shuttle.getY(), shuttle.getOrientation());
					break;

				case 'z':
					//Ne marche pas
					shuttle.setSpeed(shuttle.getSpeed() + 20);
					shuttle.setX((int) Math.cos((Math.toRadians(shuttle.getOrientation())) * shuttle.getSpeed()));
					shuttle.setX((int) Math.sin((Math.toRadians(shuttle.getOrientation())) * shuttle.getSpeed()));
					exercice3.view.Shuttle.draw(getGraphics(), shuttle.getX(), shuttle.getY(), shuttle.getOrientation());
					break;
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
		exercice3.view.Shuttle.draw(g, shuttle.getX(), shuttle.getY(), shuttle.getOrientation());
	}

	@Override
	public void update(Observable o, Object arg) {
		repaint();
	}  
}
