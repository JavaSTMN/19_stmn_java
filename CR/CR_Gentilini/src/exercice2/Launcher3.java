package exercice2;

public class Launcher3  {
	public static void main(String[] args) throws Exception {
		int[][] buffer = Util.getLennaGreenBuffer();
		int height = buffer.length;
		int width = buffer[0].length;
		
		int[][] buffer2 = Util.getLennaRedBuffer();
		int height2 = buffer2.length;
		int width2 = buffer2[0].length;
		
		int[][] buffer3 = Util.getLennaBlueBuffer();
		int height3 = buffer3.length;
		int width3 = buffer3[0].length;
		
		
		RasterBand test = new RasterBand(buffer);
		RasterBand test2 = new RasterBand(buffer2);
		RasterBand test3 = new RasterBand(buffer3);

		ImageViewer viewer = new ImageViewer(ImageFactory.getImage(test));
		viewer.pack();
		viewer.setVisible(true);
	}
}