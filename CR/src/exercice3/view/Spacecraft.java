package exercice3.view;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.RenderingHints;

public class Spacecraft {
	public static final Polygon shape = new Polygon(new int[] { 0, 10, 0, -10 }, new int[] { -5, 13, 5, 13 }, 4);
	public static final Polygon shape2 = new Polygon(new int[] { 0, 10, 0, -10 }, new int[] { -5, 13, 5, 13 }, 4);

	public static void draw(Graphics g, int x, int y, double bearing) {
		g.setColor(Color.BLACK);
		Graphics2D gCopy = (Graphics2D) g.create();
		gCopy.setColor(Color.RED);
		
		RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		gCopy.setRenderingHints(rh);
		gCopy.setStroke(new BasicStroke(1.5f));
		gCopy.translate(x, y);
		gCopy.rotate(bearing);
		gCopy.drawPolygon(shape);
	}
	
	public static void draw2(Graphics g, int x, int y, double bearing) {
		g.setColor(Color.BLACK);
		Graphics2D gCopy = (Graphics2D) g.create();
		gCopy.setColor(Color.BLACK);
		
		RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		gCopy.setRenderingHints(rh);
		gCopy.setStroke(new BasicStroke(1.5f));
		gCopy.translate(x, y);
		gCopy.rotate(bearing);
		gCopy.drawPolygon(shape2);
	}
	
	public static Dimension getDimension() {
		return shape.getBounds().getSize();
	}
	public static Dimension getDimension2() {
		return shape2.getBounds().getSize();
	}
}
