package exercice1;

public class Somme {
	
	public static int SommeDesCarres(int nombre) {
		int result = 0;
		for (int i = 1;i <= nombre;i++) {
			result += i*i;
		}
		return result;
	}
	
	public static int CarreDeLaSomme(int nombre) {
		int result = 0;
		for (int i = 1;i <= nombre;i++) {
			result += i;
		}
		result = result*result;
		return result;
	}
	
	public static int Difference(int nombre) {
		int result = 0;
		int SommeCarres = SommeDesCarres(nombre);
		int CarreSomme = CarreDeLaSomme(10);
		result = CarreSomme - SommeCarres;
		return result;
	}
}
