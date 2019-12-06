package exercice1;

public class Vector {

    public static double norm(double[] v){
        return Math.sqrt((v[0]*v[0]) + (v[1]*v[1]));
    }

    public static double[] scale(double[] v,double k){
        double[] w = new double[2];
        w[0] = v[0]*k;
        w[1] = v[1]*k;
        return w;
    }

    public static double[] normalize(double[] v){
        double normV = norm(v);
        double[] w = new double[2];
        w[0] = v[0]/normV;
        w[1] = v[1]/normV;
        return w;
    }

    public static double[] add(double[] v, double[] w){
        double[] sum = new double[2];
        sum[0] = v[0] + w[0];
        sum[1] = v[1] + w[1];
        return sum;
    }
}
