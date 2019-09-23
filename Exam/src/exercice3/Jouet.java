package exercice3;

public class Jouet
{
	Forme[] formes;
	
	Jouet(Forme[] _formes)
	{
		formes = _formes;
	}
	
	double calculateArea()
	{
		double aire = 0;
		
		for(int i=0; i<formes.length; i++)
		{
			aire += formes[i].calculateArea();
		}
		
		return aire;
	}
}
