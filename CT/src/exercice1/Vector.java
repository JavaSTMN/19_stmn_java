package exercice1;

public class Vector {
    private float x;
    private float y;

    float getX() {
        return x;
    }
    float getY() {
        return y;
    }

    public Vector(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float norm(Vector vector) {
        float vx = vector.getX();
        float vy = vector.getY();
        float normV = (float) Math.sqrt((vx*vx)+(vy*vy));
        return normV;
    }

    public Vector scale(Vector vector, int k) {
        float wx = vector.getX();
        float wy = vector.getY();
        Vector w = new Vector(wx*k, wy*k);
        return w;
    }

    public Vector normalize(Vector vector) {
        float wx = vector.getX();
        float wy = vector.getY();
        float norm = norm(vector);
        Vector w = new Vector(wx/norm, wy/norm);
        return w;
    }

    public Vector add(Vector v, Vector w) {
        float vx = v.getX();
        float vy = v.getY();
        float wx = w.getX();
        float wy = w.getY();
        Vector x = new Vector(vx+wx, vy+wy);
        return x;
    }

}