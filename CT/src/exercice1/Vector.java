package exercice1;

public class Vector {
    private float x;
    private float y;

    public float getX() {
        return this.x;
    }

    public float getY() {
        return this.y;
    }

    public Vector(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float norm() {
        return (float) Math.sqrt(x * x + y * y);
    }

    public Vector scale(float k) {
        return new Vector(k* x, k* y);
    }

    public Vector normalize() {
        float norm = norm();

        return new Vector(x / norm, y / norm);
    }

    public Vector add(Vector v) {
        return new Vector(v.x  +  this.x, v.y + this.y);
    }
}
