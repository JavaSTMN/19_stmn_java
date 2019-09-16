
public class FifoObjet2 implements IStack{
	
	public int[] stockage = new int [1500] ;
	int size = 0;
	
	public int pop() {
		int resultat=stockage[0];
		for(int i =0;i<stockage.length;i++)
		{
			stockage[i]=stockage[i+1];
		}
		return resultat;
	}
	
	public void push(int add){
		stockage[size]=add;
		size++;
		if(size==stockage.length) {
		}
	}
}
