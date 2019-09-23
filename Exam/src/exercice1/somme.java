package exercice1;

public class somme {
	public static int SommeCubes(int elts) throws Exception{
		int res = 0;
		
		if(elts == 0) {
			throw new Exception("Impossible de calculer le cube de 0");
		}
		for(int i = 0; i < elts; i++) {
			res = (int) (res + Math.pow(i, 3));
		}
		return res;
	}
	
	public static int CubesSommes(int elts) throws Exception{
		int res = 0;
		
		if(elts < 0) {
			throw new Exception("elts doit être un entier positif");
		}
		for(int i = 0; i < elts; i++) {
			res++;
		}
		res = (int)(Math.pow(res, 3));
		return res;
	}
}
