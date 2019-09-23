package exercice3;

public class Triangle extends Forme
{
	double base;
	double hauteur;
	
	Triangle(double _base, double _hauteur)
	{
		base = _base;
		hauteur = _hauteur;
	}
	
	double calculateArea()
	{
		return((base*hauteur)/2);
	}
}
