package exercice1;

public class Vector {

    private float x;
    private float y;

    public Vector(float _x, float _y) {
        this.x = _x;
        this.y = _y;
    }

    public float norm() {
        return (float) Math.sqrt(x*x + y*y);
    }

    public Vector scale(float k) {
        Vector v = new Vector(x,y);
        return new Vector(k*v.getX(),k*v.getY());
    }

    public Vector normalize(Vector v) {
        float vNorm = v.norm();

        return new Vector(x/vNorm,y/vNorm);
    }

    public Vector add(Vector v, Vector w) {

        return new Vector(v.getX() + w.getX(), v.getY() + w.getY());
    }

    public float getX() {
        return this.x;
    }

    public float getY() {
        return this.y;
    }
}
