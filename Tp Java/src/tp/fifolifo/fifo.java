package tp.fifolifo;

public class fifo implements IPilingInterface {

	private int size;
	private int tab[];


	fifo(int size){
		this.tab = new int[size];
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	public int[] getTab() {
		return tab;
	}
	
	public synchronized void pop() throws InterruptedException {		
		size--;
		int newTab[] = new int[size];
		for(int i = 0; i<size-1;i++) {
			newTab[i] = this.tab[i];
		}
		this.tab = newTab;
		newTab = null;
	}
	
	
	public synchronized void push (int elementToAdd)throws InterruptedException {
		size++;
		int newTab[] = new int[size];
		for(int i = 0;i<size-1;i++) {
			newTab[i+1] = tab[i];
		}
		newTab[0] = elementToAdd;
		this.tab = newTab;
		newTab = null;
	}
}
