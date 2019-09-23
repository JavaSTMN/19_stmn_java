package exercice3;

public class Cercle extends ElemShapes implements IShape {
	int rayon;
	
	public Cercle(int rayon) {
		this.rayon=rayon;
	}
	
	public float getAire() {
		float aire;
		aire = 2*(float)Math.PI*rayon*rayon;
		
		return aire;
	}
	
	
	
	

}
