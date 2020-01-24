package exercice2;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class Launcher3 {
	public static void main(String[] args) throws Exception {
		/**
		 * 
		 */
		
		int[][] red = Util.getLennaRedBuffer();
		int[][] blue = Util.getLennaBlueBuffer();
		int[][] green = Util.getLennaGreenBuffer();
		
		DataSet data = new DataSet(8, 8);
		
		RasterBand bandr = new RasterBand(red);
		RasterBand bandg = new RasterBand(green);
		RasterBand bandb = new RasterBand(blue);
		
		data.addBand(bandr);
		data.addBand(bandg);
		data.addBand(bandb);
		
		IRGBImage ic;
		
		BufferedImage image =  ImageFactory.getRGBImage(ic);
		
		ImageViewer viewer = new ImageViewer(image);
		viewer.pack();
		viewer.setVisible(true);
	}
}
