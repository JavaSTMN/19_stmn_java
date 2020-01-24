package exercice2;

import java.awt.Transparency;
import java.awt.color.ColorSpace;
import java.awt.image.BandedSampleModel;
import java.awt.image.BufferedImage;
import java.awt.image.ComponentColorModel;
import java.awt.image.DataBuffer;
import java.awt.image.DataBufferInt;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Arrays;
import java.util.stream.IntStream;

public class ImageFactory {
	
	public static BufferedImage getImage(IRaster band) throws Exception {
		int[][] raster = band.getValues();
		if (raster.length==0) {
			throw new Exception("Invalid raster");
		}
		int h = raster.length;
		int w = raster[0].length;
		
		int[] ints = Arrays.stream(raster).flatMapToInt(x->IntStream.range(0, x.length).map(y->x[y])).toArray();
		
		DataBuffer buff = new DataBufferInt(ints, w*h);
		BandedSampleModel m = new BandedSampleModel(DataBuffer.TYPE_BYTE, w, h, 1);
		WritableRaster r = Raster.createWritableRaster(m, buff, null);
		
		return new BufferedImage(new ComponentColorModel(ColorSpace.getInstance(ColorSpace.CS_GRAY), false, false, Transparency.OPAQUE, DataBuffer.TYPE_BYTE), r, false, null);
	}
	
	public static BufferedImage getRGBImage(IRGBImage ic) throws Exception {
		int[][] redBand = ic.getRedBand();
		int[][] greenBand = ic.getGreenBand();
		int[][] blueBand = ic.getBlueBand();
		
		int h = ic.width();
		int w = ic.height();
		
		int[] redInts = Arrays.stream(redBand).flatMapToInt(x->IntStream.range(0, x.length).map(y->x[y])).toArray();
		int[] greenInts = Arrays.stream(greenBand).flatMapToInt(x->IntStream.range(0, x.length).map(y->x[y])).toArray();
		int[] blueInts = Arrays.stream(blueBand).flatMapToInt(x->IntStream.range(0, x.length).map(y->x[y])).toArray();
		
		DataBuffer buff = new DataBufferInt(new int[][] {redInts, greenInts, blueInts}, w*h);
		BandedSampleModel m = new BandedSampleModel(DataBuffer.TYPE_BYTE, w, h, 3);
		WritableRaster r = Raster.createWritableRaster(m, buff, null);
		
		return new BufferedImage(new ComponentColorModel(ColorSpace.getInstance(ColorSpace.CS_sRGB), false, false, Transparency.OPAQUE, DataBuffer.TYPE_BYTE), r, false, null);
	}

}
