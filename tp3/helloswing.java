import javax.swing.JFrame;
import javax.swing.JLabel;
public class helloswing {
public static void main(String[] args) {
JFrame frame = new JFrame("HelloWorldSwing");
frame.setDefaultCloseOperation(
JFrame.EXIT_ON_CLOSE
);
JLabel label = new JLabel("Hello World");
frame.getContentPane().add(label);
frame.pack();
frame.setVisible(true);
}
}