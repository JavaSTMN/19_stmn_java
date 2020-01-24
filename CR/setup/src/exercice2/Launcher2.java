package exercice2;

import java.awt.image.BufferedImage;

public class Launcher2 {
	public static void main(String[] args) throws Exception {
		/**
		 * Toujours en gris mais c'est plus saturé (je ne sais pas si c'est le bon terme) mais le blanc ressort beaucoup plus
		 */
		
		int[][] valeur = Util.getLennaGreenBuffer();
		
		RasterBand band = new RasterBand(valeur);
		band.invert();
		
		BufferedImage image =  ImageFactory.getImage(band);
		
		ImageViewer viewer = new ImageViewer(image);
		viewer.pack();
		viewer.setVisible(true);
	}
}
