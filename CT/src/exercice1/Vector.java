package exercice1;

public class Vector {
	double Vx;
	double Vy;
	
	public Vector(double x, double y) 
	{
		Vx = x;
		Vy = y;
	}
	
	public double norm()
	{
		return (Math.sqrt(Math.pow(Vx, 2) + Math.pow(Vy, 2)));
	}
	
	public Vector scale(double k)
	{
		Vector w = new Vector(k*Vx, k*Vy);
		return w;
	}
	
	public Vector normalize()
	{
		Vector w = new Vector(Vx/norm(), Vy/norm()); //this
		return w;
	}
	
	public Vector add(Vector w)
	{
		Vector x = new Vector(Vx + w.Vx, Vy + w.Vy);
		return x;
	}
}
