package exercice3;

public class Rectangle extends Forme
{
	double hauteur;
	double largeur;
	
	Rectangle(double _hauteur, double _largeur)
	{
		hauteur = _hauteur;
		largeur = _largeur;
	}
	
	double calculateArea()
	{
		return(hauteur*largeur);
	}
}
