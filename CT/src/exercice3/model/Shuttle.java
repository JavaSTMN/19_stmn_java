package exercice3.model;

public class Shuttle {
	private double x;
    private double y;
    private double angle;

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
    
    public void setAngle(double a)
    
    {
    	this.angle = a;
    }
    
    
    public void move(double time) {
    	// TODO Fill me
    	
    }
}
