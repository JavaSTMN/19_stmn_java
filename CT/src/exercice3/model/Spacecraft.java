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
    
    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
    	this.y = y;
    }
    
    public int getBearing()
    {
    	return(int)bearing;
    }
    
    public void setBearing(int bearing)
    {
    	this.bearing = bearing;
    }
    
    public void move(double time) {
    	// TODO Fill me
    	
    }
}
