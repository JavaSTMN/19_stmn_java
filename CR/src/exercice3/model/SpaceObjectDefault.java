package exercice3.model;

import java.awt.Dimension;

public abstract class SpaceObjectDefault implements ISpaceObject {
	protected double x;
	protected double y;
	protected double a;
	protected double b;
	protected double c;
	protected double d;
	protected double e;
	protected double f;
	
	protected double bearing;
	protected Vector speedVector;
	protected int wBound;
	protected int hBound;
	
	protected SpaceObjectDefault(Dimension dimension) {
		x = 0;
		y = 0;
		a = 0;
		b = 0;
		c = 0;
		d = 0;
		e = 0;
		f = 0;
		
		wBound = dimension.width;
		hBound = dimension.height;		
	}
	
	protected SpaceObjectDefault(int x, int y, int a, int b, int c, int d, int e, int f, Dimension dimension) {
		this(dimension);
		this.x = x;
		this.y = y;
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
	}
	
    public int getX(){
        return (int)x;
    }
    public int getY(){
        return (int)y;
    }
    public int getA(){
        return (int)a;
    }
    public int getB(){
        return (int)b;
    }
    public int getC(){
        return (int)c;
    }
    public int getD(){
        return (int)d;
    }
    public int getE(){
        return (int)e;
    }
    public int getF(){
        return (int)f;
    }
    
    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
    	this.y = y;
    }
    public void setA(int a){
    	this.a = a;
    }
    public void setB(int b){
    	this.b = b;
    }
    public void setC(int c){
    	this.c = c;
    }
    public void setD(int d){
    	this.d = d;
    }
    public void setE(int e){
    	this.e = e;
    }
    public void setF(int f){
    	this.f = f;
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
