package exercice3.model;

import exercice1.Vector;

public class Shuttle {
	private double x;
    private double y;
    private int angle =0;
    private double[] speed = {0,0};

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
    

    
    public void move(double time) throws Exception {
    	
    	if(Vector.norm(this.speed) >= 120) {
    		//TODO: something
    	}else {
    		this.speed[0] = Math.cos(Math.toRadians(angle));
    		this.speed[0] = Math.sin(Math.toRadians(angle));
    	}
    	// Something like this
    	this.x = this.x + (Math.cos(Math.toRadians(angle)) * time);
    	this.y = this.y + (Math.sin(Math.toRadians(angle)) * time);
    	
 
    }
    
    // AJOUT PERSO
    public void setAngle(int value) {
    	this.angle = value;
    }
    
    public int getAngle() {
    	return this.angle;
    }
    
    
}
