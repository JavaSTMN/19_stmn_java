package exercice3.model;

import java.awt.Dimension;

public class Asteroid extends SpaceObjectDefault {
    private static final double ANGLE_STEP = 8*Math.PI/180;
    private static final double SPEED = 40;
    
    public Asteroid(int x, int y, Dimension dimension) {
    	super(x, y, dimension);
    	speedVector = new Vector(1, 1);
    	speedVector.scale(SPEED);
     }
    
    public void turnLeft() {
    	setBearing(bearing-ANGLE_STEP);
    }
    
    public void turnRight() {
    	setBearing(bearing+ANGLE_STEP);
    }

}
