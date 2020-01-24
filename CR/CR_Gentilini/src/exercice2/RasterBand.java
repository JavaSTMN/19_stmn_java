package exercice2;


public class RasterBand implements IRaster {

	private int[][] values;
	
	public RasterBand(int[][] values) {
		
		this.setValues(values); 
		
	}
	

	public int getWidth(int[][] values) {
		
		int widht; 
		
		widht = values.length;
		return widht;
	}


	public int getHeight(int[][] values) {
		
		
		int height;
		
		height=values[0].length;
		
		return height;
		
		
	}
	
public void invert() {
		
		int i;
		int j;
		
		for(i=0;i=<getWidth(values);i++) {
			
			for(j = 0; j=<getHeight(values);j++) {
				
				values[i][j]  = 255-values[i][j];
			}
			
		}
	}




	public void setValues(int[][] values) {
		this.values = values;
	}


	@Override
	public int[][] getValues() {
		// TODO Auto-generated method stub
		return null;
	}
}