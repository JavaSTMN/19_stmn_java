package exercice3.model;

import exercice1.Vector;

public class Spacecraft {
	private double x;
    private double y;
    private double bearing;

    public Spacecraft() {
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
    	return this.bearing;
    }
    
    public void setBearing(double bearing) {
    	this.bearing = bearing;
    }
    
    public void move(double time) {
    	double[] v = new double[] { Math.cos(getBearing()), Math.sin(getBearing()) };   
    	double[] speed = Vector.scale(v, time);
    	this.x += speed[0];
    	this.y += speed[1];
    }
}
