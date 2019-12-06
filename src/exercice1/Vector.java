package exercice1;

public class Vector {
    private double v[]={0,0};
    private double w[]={0,0};

    public double[] getV() {
        return v;
    }

    public double[] getW() {
        return w;
    }

    public void setV(double[] v) {
        this.v = v;
    }

    public void setW(double[] w) {
        this.w = w;
    }

    public double norm(){
        double res=0;
        double vecV[] = getV();
        res=Math.sqrt(vecV[0]*vecV[0]+vecV[1]*vecV[1]);
        return res;
    }

    public double[] scale(int k){
        double w[]={0,0};
        double vecV[] = getV();
        w[0]=k*vecV[0];
        w[1]=k*vecV[1];
        return  w;
    }

    public double[] normalize(){
        double w[]={0,0};
        double vecV[]=getV();
        double norm = norm();
        w[0]=vecV[0]/norm;
        w[1]=vecV[1]/norm;
        return w;
    }

    public double[] add(){
        double x[]={0,0};
        double vecV[]=getV();
        double vecW[]=getW();
        x[0]=vecV[0]+vecW[0];
        x[1]=vecV[1]+vecW[1];
        return x;
    }
}
