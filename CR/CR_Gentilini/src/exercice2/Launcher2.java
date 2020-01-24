package exercice2;

public class Launcher2  {
	public static void main(String[] args) throws Exception {
		int[][] buffer = Util.getLennaGreenBuffer();
		int height = buffer.length;
		int width = buffer[0].length;
		
		RasterBand test = new RasterBand(buffer);
		test.invert();

		ImageViewer viewer = new ImageViewer(ImageFactory.getImage(test));
		viewer.pack();
		viewer.setVisible(true);
	}
}