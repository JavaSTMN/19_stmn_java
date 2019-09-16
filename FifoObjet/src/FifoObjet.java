
public class FifoObjet{
	
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
	
	public void push(int add) throws Exception {
		stockage[size]=add;
		size++;
		if(size==stockage.length) {
			throw new Exception ("Fin de la file");
		}
	}
}
