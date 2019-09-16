
public class Fifo {
	
	int[] stockage = new int [1500] ;
	int size = 0;
	
	public static int pop(Fifo fifo) {
		int resultat=fifo.stockage[0];
		for(int i =0;i<fifo.stockage.length;i++)
		{
			fifo.stockage[i]=fifo.stockage[i+1];
		}
		return resultat;
	}
	
	public static void push(Fifo fifo, int add) throws Exception {
		fifo.stockage[fifo.size]=add;
		fifo.size++;
		if(fifo.size==fifo.stockage.length) {
			throw new Exception ("Fin de la file");
		}
	}
}
