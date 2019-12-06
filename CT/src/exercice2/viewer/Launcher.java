package exercice2.viewer;

import javax.swing.*;
import java.awt.*;

public class Launcher {
    public static void main(String[] args) {
        Seed root =new Seed("Library");

        Seed uncommon = new Seed("Uncommon");
        uncommon.addElement( new Seed("Counter spell"));

        Seed rare = new Seed("Rare");
        rare.addElement(new Seed("Preparation"));
        rare.addElement(new Seed("Book of Specters"));

        Seed legendary = new Seed("Legendary");
        legendary.addElement(new Seed("Raid the Sky Temple"));

        root.addElement(uncommon);
        root.addElement(rare);
        root.addElement(legendary);

        SeedAdapter adapter = new SeedAdapter(root);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1,1));
        panel.add(new TreeViewer(adapter));

        JFrame frame = new JFrame();
        frame.add(panel);
        frame.setSize(new Dimension(800,600));
        frame.setVisible(true);
    }
}
