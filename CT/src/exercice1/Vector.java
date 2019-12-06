package exercice1;

public class Vector {
	private double val0;
	private double val1;

	/**
	 * Constructeur
	 */
	public Vector(Double v0,Double v1) {
		this.setVal0(v0);
		this.setVal1(v1);
	}
	
	/**
	 * Methods
	 */
	public double norm() {
		double norm=Math.sqrt(Math.pow(this.val0, 2)+Math.pow(this.val1, 2));
		return norm;
	}
	
	public Vector scale(Double k) {
		return new Vector(this.val0 * k,this.val1 *k);
	}
	
	public Vector normalize() {
		double vNorm = this.norm();
		return new Vector(this.val0 / vNorm,this.val1 /vNorm);
	}
	
	static Vector add(Vector v,Vector w) {
		return new Vector(v.getVal0() + w.getVal0(),v.getVal1() + w.getVal1());
	}
	
	/**
	 * Getters & Setters
	 */
	public double getVal0() {
		return val0;
	}
	public void setVal0(double val0) {
		this.val0 = val0;
	}
	public double getVal1() {
		return val1;
	}
	public void setVal1(double val1) {
		this.val1 = val1;
	}
}
