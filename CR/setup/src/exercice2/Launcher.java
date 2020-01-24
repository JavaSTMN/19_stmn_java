package exercice2;

import java.awt.image.BufferedImage;

public class Launcher {
	public static void main(String[] args) throws Exception {
		/**
		 * Permet de visualiser Lena en gris
		 */
		
		int[][] valeur = Util.getLennaGreenBuffer();
		
		RasterBand band = new RasterBand(valeur);
		BufferedImage image =  ImageFactory.getImage(band);
		
		ImageViewer viewer = new ImageViewer(image);
		viewer.pack();
		viewer.setVisible(true);
	}
}
