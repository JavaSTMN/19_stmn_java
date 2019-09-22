import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class HelloSwing {
	public static void main(String[] args) {
		JFrame frame = new JFrame("HelloWorldSwing");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		
		JLabel label = new JLabel("Hello World");
		
		JTextField textField = new JTextField();
		textField.setColumns(10); 

		panel.add(label);
		panel.add(textField);
		
		frame.getContentPane().add(panel);
		frame.pack();
		frame.setVisible(true);	
	}
}