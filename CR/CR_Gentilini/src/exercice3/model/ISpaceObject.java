package exercice3.model;

public interface ISpaceObject {
	int getX();
	int getY();
	double getBearing();
	void move(double period);
	
}