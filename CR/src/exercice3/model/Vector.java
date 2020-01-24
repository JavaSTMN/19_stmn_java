package exercice3.model;

public class Vector {
	private double x;
	private double y;
	
	public Vector(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public double norm() {
		return Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
	}
	
	public void scale(double k) {
		this.x *= k;
		this.y *= k;
	}
	
	public Vector scaleCopy(double k) {
		return new Vector(k*x, k*y);
	}
	
	public void normalize() {
		double norm = this.norm();
		if (norm == 0) {
			// Either do nothing
			return;
			// Or throw
			// throw new Exception("Cannot normalize null vector");
		}
		scale(1/norm);
	}
	
	public Vector normalizeCopy() {
		double norm = this.norm();
		if (norm == 0) {
			// Either return null vector
			return new Vector(0,0);
			// Or throw
			// throw new Exception("Cannot normalize null vector");
		}
		return scaleCopy(1/norm);
	}
	
	public void add(Vector v) {
		x += v.x;
		y += v.y;
	}
	
	public Vector addCopy(Vector v) {
		return new Vector(x + v.x, y + v.y);
	}
	
	/**
	 * Overriding base functions so they can be used in unit tests
	 */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Vector)) return  false;
		Vector v = (Vector) o;
		double tolerance = 1.e-6;
		return Math.abs(x - v.x) < tolerance && Math.abs(y - v.y) < tolerance;
	}
	
	@Override
	public String toString() {
		return "(" + x + " ; " + y + ")";
	}
}
