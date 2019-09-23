import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CalculatorSwing extends JFrame implements ActionListener {
	JButton btn1;
	JButton btn2;
	JButton btnC;
	JButton btnPlus;
	JButton btnEq;

	JTextField textField;

	public static void main(String[] args) {
		new CalculatorSwing();
	}
	
	public CalculatorSwing() {
		// Init frame
		JFrame frame = new JFrame("CalculatorSwing");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Input field
		textField = new JTextField();
		textField.setColumns(20); 
		
		// Panel avec les boutons
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(1,5));
		
		// Création des boutons
		btn1 = new JButton ("1");
		btn1.addActionListener(this);
		panel.add(btn1);
		
		btn2 = new JButton ("2");
		btn2.addActionListener(this);
		panel.add(btn2);
		
		btnC = new JButton ("C");
		btnC.addActionListener(this);
		panel.add(btnC);
		
		btnPlus = new JButton ("+");
		btnPlus.addActionListener(this);
		panel.add(btnPlus);
		
		btnEq = new JButton ("=");
		btnEq.addActionListener(this);
		panel.add(btnEq);

		// Ajouts au frame
		frame.getContentPane().setLayout(new GridLayout(2, 1));
		frame.getContentPane().add(textField);
		frame.getContentPane().add(panel);
		frame.pack();
		frame.setVisible(true);	
	}
	
	public void actionPerformed(ActionEvent e)
    {
		if (e.getSource() == btn1) {
			textField.setText(textField.getText() + "1");
		} 
		else if (e.getSource() == btn2) {
			textField.setText(textField.getText() + "2");			
		}
		else if (e.getSource() == btnC) {
			textField.setText("");	
		}
		else if (e.getSource() == btnPlus) {
			textField.setText(textField.getText() + "+");		 	
		}
		else if (e.getSource() == btnEq) {
			String[] splittedStr = textField.getText().split("\\+"); 
			if (splittedStr.length == 0)
				return;

			int sum = 0;
			for (int i = 0; i < splittedStr.length; i++) {
				sum += Integer.parseInt(splittedStr[i]);
			}
			
			textField.setText(Integer.toString(sum));	
		}
    }
}