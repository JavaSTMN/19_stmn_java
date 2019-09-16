public abstract class Lifo implements IStack {

	public int[] stockage = new int [1500] ;
	int size = 0;
	
	public int pop() {
		int resultat=stockage[size];
		if(size>0)
		{
			size--;
		}
		return resultat;
	}
	
	public void push(int add) {
		stockage[size]=add;
		size++;
		if(size==stockage.length) {
		}
	}
}
