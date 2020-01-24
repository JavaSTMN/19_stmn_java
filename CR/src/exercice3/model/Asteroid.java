package exercice3.model;

import java.awt.Dimension;

public class Asteroid extends SpaceObjectDefault {
    private static final double ANGLE_STEP = 8*Math.PI/180;
    private static final double SPEED = 40;
    
    public Asteroid(int x, int y, int a, int b, int c, int d, int e, int f, Dimension dimension) {
    	super(x, y, a,b,c,d,e,f, dimension);
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
