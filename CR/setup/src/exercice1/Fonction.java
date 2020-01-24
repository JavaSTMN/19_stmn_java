package exercice1;

public class Fonction {
	private double a;
	private double b;
	
	public Fonction(double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	public double result() {
		if(Math.abs(this.a) < Math.abs(this.b)) {
			return a;
		}
		else if(Math.abs(this.b) < Math.abs(this.a)) {
			return b;
		}
		
		return Math.max(a, b);
		
	}

}
