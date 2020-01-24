package exercice3.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Polygon;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import exercice3.model.ISpaceObject;
import exercice3.model.Scene;
import exercice3.model.Spacecraft;

public class SceneView extends JPanel implements Observer {
	
	private final Scene model;
	
	public SceneView(Scene model) {
        setBorder(BorderFactory.createLineBorder(Color.black));
        this.model = model;
        this.model.addObserver(this);
        Spacecraft spacecraft = model.getSpacecraft();
        Spacecraft spacecraft2 = model.getSpacecraft2();
        Dimension prefered = getPreferredSize();
		spacecraft.setX(prefered.width/2);
		spacecraft.setY(prefered.height/2);
		spacecraft2.setX(prefered.width/4);
		spacecraft2.setY(prefered.height/4);
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
					model.getSpacecraft().turnLeft();
					break;
				case 'd':
					model.getSpacecraft().turnRight();
					break;
				case 'z':
					model.getSpacecraft().boost();
					break;
				case 'j':
					model.getSpacecraft2().turnLeft();
					break;
				case 'l':
					model.getSpacecraft2().turnRight();
					break;
				case 'i':
					model.getSpacecraft2().boost();
					break;
				}				
			}
		});
    }

    public Dimension getPreferredSize() {
        return model.getDimension();
    }
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        for (ISpaceObject o:model.getObjects()) {
        	if (o instanceof Spacecraft) {
        		exercice3.view.Spacecraft.draw(g, o.getX(), o.getY(), o.getBearing());  
        	}
        	else {
        		
        		int[] x={o.getX(),
        				o.getX()+10,
        				o.getX()+20,
        				o.getX()+20,
        				o.getX()+10,
        				o.getX(),
        				o.getX()-10,
        				o.getX()-10};
        		int[] y={o.getY(),o.getY(),o.getY()+10,o.getY()+20,+o.getY()+30,o.getY()+30,o.getY()+20, o.getY()+10};
        		Polygon p = new Polygon(x, y,x.length );
        		g.drawPolygon(p);
        	}
        }
       for (ISpaceObject o:model.getObjects2()) {
    	   if (o instanceof Spacecraft) {
    		   exercice3.view.Spacecraft.draw2(g, o.getX(), o.getY(), o.getBearing()); 
    	   }
       }
    }

	@Override
	public void update(Observable o, Object arg) {
		repaint();
	}  
}
