package exercice3.model;

import exercice1.Vector;

public class Spacecraft {
	private double x;
    private double y;

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
    
    public void move(double time) {
    	// TODO Fill me
       float floatTime = (float)time;
     Vector v = new Vector(0,(20*floatTime));



    }
}
