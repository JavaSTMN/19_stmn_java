


public class Premier { 
    public static void main (String[] argv) {
        float[] numbers = {4, 13, 30};
        System.out.println(mean(numbers));
    }
    
    public static float mean (float[] numbers) {
        float total = 0;
        for (float number : numbers) {
            total += number;
        } 
        return total = total / numbers.length;
    }
}