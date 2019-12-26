package exercice3.model;

import exercice1.Vector;

public class Spacecraft {
	private double x;
    private double y;
    private double bearing;
    private Vector speedVector;
    private static final double ACCEL_FACTOR = 20;
    private static final double ANGLE_STEP = 8*Math.PI/180;
    private static final double MAX_SPEED = 120;
    private int wBound;
    private int hBound;

    public Spacecraft() {
    	speedVector = new Vector(0, 0);
     }
    
    public int getX(){
        return (int)x;
    }

    public int getY(){
        return (int)y;
    }
    
    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
    	this.y = y;
    }
    
    public double getBearing() {
    	return bearing;
    }
    
    private void setBearing(double bearing) {
    	this.bearing = bearing;
    }
    
    public void setWBound(int w) {
    	wBound = w;
    }
    
    public void setHBound(int h) {
    	hBound = h;
    }
    
    public void turnLeft() {
    	setBearing(bearing-ANGLE_STEP);
    }
    
    public void turnRight() {
    	setBearing(bearing+ANGLE_STEP);
    }
    
    public void move(double time) {
    	x += speedVector.getX()*time;
    	y += speedVector.getY()*time;
    	if (x<0) {
    		x = wBound-x;
    	}
    	else if (x>wBound) {
    		x = x % wBound;
    	}
    	if (y<0) {
    		y = hBound-y;
    	}
    	else if (y>hBound) {
    		y = y % hBound;
    	}
    	
    }
    
    public void boost() {
    	speedVector.add(new Vector(ACCEL_FACTOR*Math.sin(bearing), -ACCEL_FACTOR*Math.cos(bearing)));
    	if (speedVector.norm()>MAX_SPEED) {
    		speedVector.normalize();
    		speedVector.scale(MAX_SPEED);
    	}
    }
    
}
