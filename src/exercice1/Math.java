package exercice1;

public class Math {

    public static int sommeCarre(int n){
        int result = 0;
        for (int i = 1; i <= n; i++){
            result += i*i;
        }
        return result;
    }

    public static int carreSomme(int n){
        int result = 0;
        for (int i = 1; i <= n; i++){
            result += i;
        }
        return result*result;
    }

}
