public class fifo {
	int[] pile = new int[100];
	int length = 0;
	boolean lifomode = false;
	
	public static void main (String[] argv) {
		fifo myfifo = new fifo();
		System.out.println(myfifo.getlength());
		myfifo.push (3);
		myfifo.push (5);
		System.out.println(myfifo.pop());
		}
	public int pop () {
		int num = pile[0];
		int newlen = pile.length-1;
		int[] newpile = new int[100];
		for (int i = 0; i < newlen; i++) {
			newpile[i] = pile[i+1];
		}
		pile = newpile;
		return num;
	}
	public void push (int num) {
		int newlen = pile.length+1;
		int[] newpile = new int[100];
		for (int i = 0; i < pile.length; i++) {
			newpile[i] = pile[i];
		}
		newpile[newlen] = num;
		pile = newpile;
		System.out.println(pile[0]);
	}
	public int getlength () {
		return length;
	}
	public void setmode (boolean mode) {
		lifomode = mode;
	}
}
