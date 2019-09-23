package exercice3;

public class Cercle extends Forme
{
	double rayon;
	
	Cercle(double _rayon)
	{
		rayon = _rayon;
	}
	
	double calculateArea()
	{
		return(Math.PI*(Math.pow(rayon, 2)));	
	}
}
