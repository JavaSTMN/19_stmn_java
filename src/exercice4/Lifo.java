package exercice4;

public class Lifo implements IQueue {

    private int[] array;
    private int queue;

    public Lifo(int size){
        this.array = new int[size];
        this.queue = 0;
    }

    @Override
    public int pop() throws Exception {
        if(queue == 0){
            throw new Exception("LIFO is empty.");
        }
        int element = array[queue - 1];
        queue--;
        return element;
    }

    @Override
    public void push(int element) throws Exception {
        if(queue + 1 > array.length){
            throw new Exception("LIFO is full.");
        }
        array[queue] = element;
        queue++;
    }

    public int[] getArray() {
        return array;
    }
}
