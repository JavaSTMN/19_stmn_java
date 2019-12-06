package exercice1;

import java.lang.Math;

public class Vector {
	
	private double vx;
	private double vy;
	
	public Vector(double vx, double vy) {
		this.vx = vx;
		this.vy = vy;
	}
	
	public double getVx() {
		return this.vx;
	}

	public double getVy() {
		return this.vy;
	}
	
	public double norm() {
		return Math.sqrt(Math.pow(this.vx, 2) + Math.pow(this.vy, 2));
	}
	
	public Vector scale(int k) {
		return new Vector(this.vx * k, this.vy * k);
	}
	
	public Vector normalize() {
		return new Vector(this.vx / this.norm(), this.vy / this.norm());
	}
	
	public Vector add(Vector w) {
		return new Vector(this.vx + w.vx, this.vy + w.vy);
	}
}