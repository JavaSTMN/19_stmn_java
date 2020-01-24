package exercice2;


public class Launcher  {
	public static void main(String[] args) throws Exception {
		int[][] buffer = Util.getLennaGreenBuffer();
		int height = buffer.length;
		int width = buffer[0].length;
		
		
		RasterBand test = new RasterBand(buffer);
		ImageViewer viewer = new ImageViewer(ImageFactory.getImage(test));
		viewer.pack();
		viewer.setVisible(true);
	}
}