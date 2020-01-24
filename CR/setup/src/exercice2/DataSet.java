package exercice2;

import java.util.ArrayList;

public class DataSet{

	private ArrayList<IRaster> bands = new ArrayList<>();
	private ArrayList<IRGBImage> imgRGB = new ArrayList<>();
	
	public final int width;
	public final int height;
	
	public DataSet(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public IRaster getBand(int index) {
		return bands.get(index);
	}
	
	public void addBand(IRaster band) {
		bands.add(band);
	}
}
