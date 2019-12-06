package exercice3.model;

import exercice1.Vector;

public class Shuttle {
	private double x;
    private double y;

    public Shuttle() {
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
        float fTime = (float) time;
        Vector vector = new Vector(0, (20*fTime));

        if(vector.norm() <= 120)
            y += vector.getY();
    }
}
