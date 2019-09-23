package tp.fifolifo;

public interface IPilingInterface {
	public void pop() throws InterruptedException;
	public void push(int elementToAdd) throws InterruptedException;
}
