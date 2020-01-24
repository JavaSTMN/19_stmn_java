package exercice1;

public class Fonction {
	
	private double a;
	private double b;
	
	public Fonction(double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	public double geta() {
		return a;
	}
	
	public double getb() {
		return b;
		
	}
	
	public double reduction() {
		
		double x = 0;
		
		if (Math.abs(a)<Math.abs(b)) {
			
			x = a;
		}
		else if (Math.abs(b)<Math.abs(a)) {
			
			x = b;
		}
		
		else {
			
		 if (a<b) {
			 x = b;
		 }
		 else {
			 x = a;
		 }
		
		
		}
		return x;
	}
	
}

