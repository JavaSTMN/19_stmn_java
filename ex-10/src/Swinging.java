import javax.swing.*;

import java.awt.TextField;


public class Swinging {

	public static void main() {
		JFrame frame = new JFrame("Framasse");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel label1 = new JLabel("Name");
		JLabel label2 = new JLabel("Surname");
		TextField field_surname = new TextField();
		TextField field_name = new TextField();
		frame.getContentPane().add(label1);
		frame.getContentPane().add(field_surname);
		frame.getContentPane().add(label2);
		frame.getContentPane().add(field_name);
		frame.pack();
		frame.setVisible(true);
	}
}
