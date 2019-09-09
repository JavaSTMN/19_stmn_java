package exercice2;

public class Fifo {

    public int queue = 0;
    public int[] array;

    public void init(int size){
        this.array = new int[size];
    }

    public int pop() throws Exception {
        if(queue == 0){
            throw new Exception("FIFO is empty.");
        }
        int element = array[0];
        for (int i = 0; i < array.length - 1; i++){
            array[i] = array[i + 1];
        }
        queue--;
        return element;
    }

    public void push(int element) throws Exception {
        if(queue + 1 > array.length){
            throw new Exception("FIFO is full.");
        }
        array[queue] = element;
        queue++;
    }
}
