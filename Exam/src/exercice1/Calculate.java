package exercice1;

public class Calculate
{
	//somme des carrés
	public static int squSum(int nbInt)
	{
		int res = 0;
		for(int i=1; i<=nbInt; i++)
		{
			res += Math.pow(i, 2);
		}
		return res;
	}
	
	
	//carré de la somme
	public static int sumSqu(int nbInt)
	{
		int res = 0;
		for(int i=1; i<=nbInt; i++)
		{
			res += i;
		}
		res = (int) Math.pow(res, 2);
		return res;
	}
	
	
	
}
