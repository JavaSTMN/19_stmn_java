package tp;

public class lifo implements IPilingInterface {

	private int size;
	private int tab[];
	


	lifo(int size){
		this.tab = new int[size];
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	public int[] getTab() {
		return tab;
	}
	
	public void pop() {
		size--;
		int newTab[] = new int[size];
		for(int i = 0;i<size-1;i++) {
			newTab[i] = tab[i];
		}
		this.tab = newTab;
	}
	
	
	public void push(int elementToAdd) {
		int newTab[] = new int[size];
		for(int i = 0;i<size-1;i++) {
			newTab[i] = tab[i];
		}
		newTab[size-1] = elementToAdd;
		this.tab = newTab;
		size++;
		newTab = null;
	}
}
