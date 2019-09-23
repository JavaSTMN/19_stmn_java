package ex3;

public class Rectangle extends Forme {
	public void calcaire() {
		if (param2 == 0) {
			aire = param1*param1;
		}
		else {
			aire = param1*param2;
		}
	}
}