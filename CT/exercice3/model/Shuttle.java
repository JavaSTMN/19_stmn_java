package exercice3.model;

public class Shuttle {
	private double x;
    private double y;
    private double orientation;
    private double speed;

    private final int MAX_SPEED = 120;

    public Shuttle() {
        this.orientation = 0;
        this.speed = 0;
    }
    
    public int getX(){
        return (int)x;
    }

    public int getY(){
        return (int)y;
    }

    public double getOrientation() {
        return orientation;
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
    	this.y = y;
    }

    public void setOrientation(double orientation) {
        this.orientation = orientation;
    }

    public void move(double time) {
    	// TODO Fill me
    	
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        if(speed < MAX_SPEED){
            this.speed = speed;
        }
    }
}
