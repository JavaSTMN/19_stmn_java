package exercice3.model;

import java.awt.Dimension;

public abstract class SpaceObjectDefault implements ISpaceObject {
	protected double x;
	protected double y;
	protected double bearing;
	protected Vector speedVector;
	protected int wBound;
	protected int hBound;
	
	protected SpaceObjectDefault(Dimension dimension) {
		x = 0;
		y = 0;
		wBound = dimension.width;
		hBound = dimension.height;		
	}
	
	protected SpaceObjectDefault(int x, int y, Dimension dimension) {
		this(dimension);
		this.x = x;
		this.y = y;
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
    
    protected void setBearing(double bearing) {
    	this.bearing = bearing;
    }
    
    public void setWBound(int w) {
    	wBound = w;
    }
    
    public void setHBound(int h) {
    	hBound = h;
    }
    
    public abstract void turnLeft();
    
    public abstract void turnRight();
    
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

}
