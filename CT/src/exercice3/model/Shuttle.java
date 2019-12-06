package exercice3.model;

import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import exercice1.Vector;

public class Shuttle{
	private double x;
    private double y;
    private double bearing;
    private Vector vec_courant;
    public Shuttle() {
    	this.bearing=0;
    	this.vec_courant = new Vector(0.0,0.0);
     }
    
    public int getX(){
        return (int)x;
    }

    public int getY(){
        return (int)y;
    }
    
    public void setX(int x){
    	if(x > 400) x=1;
    	if(x < 0 ) x=400;
        this.x = x;
    }

    public void setY(int y){
    	if(y > 400) y=1;
    	if(y < 0 ) y=400;
    	this.y = y;
    }
    
    public void setBearing(double bearing){
        this.bearing = bearing;
    }

    public double getBearing(){
    	return this.bearing;
    }
    
    public void rotateAnti() {
    	this.bearing+=Math.cos(8.0);
    }
    
    public void rotateHoraire(){
    	this.bearing-=Math.cos(8.0);
    }
    public void move(double time) {
    	// TODO Fill me
    	this.vec_courant.setVal0(this.x);
    	this.vec_courant.setVal1(this.y);
    	// 20 PIXELS SECOND 
    	// SOIT  1 pixel par cycle
    	double norm = vec_courant.norm();
    	System.out.println(Math.cos(this.bearing));
    	this.setX((int) (((int)this.x +Math.cos(norm) )* Math.cos(this.bearing)));
    	this.setY((int) (((int)this.y +Math.sin(norm) )* Math.sin(this.bearing)));
    	
    }

}
