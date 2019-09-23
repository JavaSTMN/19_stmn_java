package exercice1;

public class NaturalIntegers {

	public static int IntegersCubeSum(int nIntegers) {
		int cube = 0;
		for (int i = 1;i!=nIntegers+1;i++) {
			cube += i*i*i;
		}
		return cube;
	}
	
	public static int IntergersSumCube(int nIntegers) {
		int cube = 0;
		for (int i = 0;i!=nIntegers+1;i++) {
			cube += i;
		}
		return cube*cube*cube;
	}
	
	
}
