/**
 * Instructions pour compiler :
 *  - javac MyClass.java -> MyClass.class
 *  - java MyClass.class
 */
public class TP
{
    public static void main(String[] args) {
        float[] nombres = { 1, 6, 7, 8 };
        if (nombres.length == 0) {

        }
        System.out.println("Calcul de la moyenne : " + moyenne(nombres));
        int m = 5;
        int n = 6;
        int o = 7;
        int[][] A = new int[m][n];
        int[][] B = new int[n][o];
        System.out.println("Multiplication de matrices : " + matrixMultiplication(A, B));
    }

    public static float moyenne(float[] chiffres) {
        int total = 0;
        for (int chiffre : chiffres) {
            total += chiffre;
        }
        return total / chiffres.length;
    }

    public static int[][] matrixMultiplication(int[][] a, int[][] b) {
        for (int i = 0; i < a.length; i++) {

        }
    }
}