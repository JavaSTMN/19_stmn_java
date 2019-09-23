package exercice3;

public class Jouet implements IJouet{
	IJouet[] jouet;
	
	public Jouet(IJouet[] jouet) {
		this.jouet = jouet;
	}
	
	@Override
	public int aire() {
		int result = 0;
		for(int i = 0; i < jouet.length; i++) {
			result += jouet[i].aire();
		}
		return result;
	}
}
