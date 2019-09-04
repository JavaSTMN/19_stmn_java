package toto;

public class PremierTest {
    public void test () {
        float[][] arguments = {{},{1},{1,2,3}};
        for (int i = 0; i <= 3; i++) {
            System.out.println(Premier.mean(arguments[0]));
        }
    }
}