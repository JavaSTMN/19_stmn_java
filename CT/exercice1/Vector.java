package exercice1;

public class Vector{

    public static double norm(double[] v){
        assert(v.length == 2) : new Exception("Le vecteur v doit etre a deux dimensions");
        return Math.sqrt((v[0]*v[0]) + (v[1]*v[1]));
    }

    public static double[] scale(double[] v, double k){
        assert(v.length == 2) : new Exception("Le vecteur v doit etre a deux dimensions");
        return new double[]{v[0]*k, v[1]*k};
    }

    public static double[] normalize(double[] v){
        assert(v.length == 2) : new Exception("Le vecteur v doit etre a deux dimensions");
        return new double[]{v[0]/norm(v), v[1]/norm(v)};
    }

    public static double[] add(double[] v, double[] w){
        assert(v.length == 2) : new Exception("Le vecteur v doit etre a deux dimensions");
        assert(w.length == 2) : new Exception("Le vecteur w doit etre a deux dimensions");
        return new double[]{v[0] + w[0], v[1] + w[1]};
    }

}