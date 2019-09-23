package ex3;

public class TriangleEq extends Forme {
	public void calcaire() {
		if (param2 != 0) {
			aire = param1*param2/2;
		}
		else {
			aire = param1*param1/2;
		}
		
	}
}