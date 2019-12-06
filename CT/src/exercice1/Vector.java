package exercice1;

public class Vector {
	public double x;
	public double y;
	
	public double norm () {
		return (Math.sqrt(x*x + y*y));
	}
	
	public Vector scale (float k) {
		Vector w = new Vector();
		w.x = x*k;
		w.y = y*k;
		return w;
	}
	
	public Vector normalize () {
		Vector w = new Vector();
		if (x > 0) {
			w.x = 1;
		}
		else if (x < 0) {
			w.x = -1;
		}
		else {
			w.x = 0;
		}
		if (y > 0) {
			w.y = 1;
		}
		else if (y < 0) {
			w.y = -1;
		}
		else {
			w.y = 0;
		}
		return w;
	}
	
	public Vector add (Vector w) {
		Vector z = new Vector();
		z.x = x + w.x;
		z.y = y + w.y;
		return z;
	}
	
}
