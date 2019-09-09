package exercice3;

public class Fifo {

    private int[] array;
    private int queue;

    public Fifo(int size){
        this.array = new int[size];
        this.queue = 0;
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

    public int[] getArray() {
        return array;
    }
}
