package exercice2;

import exercice2.viewer.TreeViewer;

import javax.swing.*;

public class Launcher extends JFrame {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Launcher());
    }

    public Launcher() {
        Seed seed = Seed.createExample();
        TreeViewer treeViewer = new TreeViewer(seed);
        add(treeViewer);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("JTree Example");
        this.pack();
        this.setVisible(true);
    }
}
