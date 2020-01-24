package exercice2;

public class RasterBand implements IRaster{
	private int [][] values;
	
	public RasterBand(int[][] values) {
		this.values = values;
	}

	@Override
	public int[][] getValues() {
		return this.values;
	}
	
	public int getWidth() {
		return this.values[0].length;
	}
	
	public int getHeight() {
		return this.values.length;
	}
	
	public void invert() {
		for(int i = 0; i < this.values.length; i++) {
			for (int j = 0; j < this.values[i].length; j++) {
				this.values[i][j] = 255 - this.values[i][j]; 
			}
		}
	}
	
}
