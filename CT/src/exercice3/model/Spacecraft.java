package exercice3.model;

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
    
    public int getBearing() {
    	return (int)bearing;
    }
        
    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
    	this.y = y;
    }
    
    public void setBearing(double b) {
    	this.bearing = b;
    }
    
    public void move(double time) {
    	// TODO Fill me
    	
    }
}
