package exercice3.model;

import java.awt.Dimension;

public class Spacecraft extends SpaceObjectDefault {
    private static final double ACCEL_FACTOR = 20;
    private static final double ANGLE_STEP = 8*Math.PI/180;
    private static final double MAX_SPEED = 120;

    public Spacecraft(Dimension d) {
    	super(d);
    	speedVector = new Vector(0, 0);
     }
    
    public void turnLeft() {
    	setBearing(bearing-ANGLE_STEP);
    }
    
    public void turnRight() {
    	setBearing(bearing+ANGLE_STEP);
    }
    
    public void boost() {
    	speedVector.add(new Vector(ACCEL_FACTOR*Math.sin(bearing), -ACCEL_FACTOR*Math.cos(bearing)));
    	if (speedVector.norm()>MAX_SPEED) {
    		speedVector.normalize();
    		speedVector.scale(MAX_SPEED);
    	}
    }
    
}
