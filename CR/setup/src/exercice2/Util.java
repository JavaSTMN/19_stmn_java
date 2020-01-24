package exercice2;

import java.awt.Image;
import java.awt.image.PixelGrabber;
import java.io.File;
import java.util.Arrays;

import javax.imageio.ImageIO;

public class Util {

	enum Channel {RED, GREEN, BLUE};
	
	private static int[][] getLennaBuffer(Channel channel) throws Exception {
		Image img = ImageIO.read(Util.class.getClassLoader().getResource("exercice2/Lenna.png"));
		int w = 512;
		int h = 512;
		int[] pix0 = new int[w*h];
		PixelGrabber grabber = new PixelGrabber(img, 0, 0, w, h, pix0, 0, w);
		grabber.grabPixels();
		int[] pix1;
		switch (channel) {
		case RED:
			pix1 = Arrays.stream(pix0).map(x->(x&0xff0000)>>16).toArray();
			break;
		case GREEN:
			pix1 = Arrays.stream(pix0).map(x->(x&0xff00)>>8).toArray();
			break;
		case BLUE:
			pix1 = Arrays.stream(pix0).map(x->x&0xff).toArray();
			break;
		default:
			pix1 = new int[h*w];
			break;
		}
		int[][] pix2 = new int[h][w];
		for (int i=0;i<w;++i) {
			for (int j=0;j<h;++j) {
				pix2[j][i] = (short)pix1[j*w+i];
			}
		}
		return pix2;
	}
	
	public static int[][] getLennaRedBuffer() throws Exception {
		return getLennaBuffer(Channel.RED);
	}
	
	public static int[][] getLennaGreenBuffer() throws Exception {
		return getLennaBuffer(Channel.GREEN);
	}
	
	public static int[][] getLennaBlueBuffer() throws Exception {
		return getLennaBuffer(Channel.BLUE);
	}

}
