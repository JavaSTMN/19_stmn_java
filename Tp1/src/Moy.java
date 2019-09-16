
public class Moy {
	public static void main(String[] args) throws Exception {
		 try {
			 System.out.println(moy(new double[] {1,2}));
		    } catch (Exception e) {
		      System.out.println("Something went wrong.");
		    }	
	}
	
	public static double moy(double[] valeurs) throws Exception 
	{
		double res=0;
		for(double nombre : valeurs )
		{
			res=res+nombre;
		}
		if(valeurs.length == 0)
		{
			new Exception ("Liste Vide");
			return 0;
		}
		else
		{
			return(res/valeurs.length);
		}
	}
}
