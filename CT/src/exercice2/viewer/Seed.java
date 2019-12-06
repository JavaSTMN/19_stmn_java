package exercice2.viewer;

import java.util.ArrayList;
import java.util.Collections;

public class Seed {
    private String label;
    private ArrayList<Seed> seeds;

    public Seed(String label) {
        this.label = label;
        seeds = new ArrayList<>();
    }

    public Seed(String label, Seed[] elements) {
        this(label);

        addElements(elements);
    }

    public void addElement(Seed element) {
        if(element == null) throw new IllegalArgumentException("element is null");

        seeds.add(element);
    }

    public void addElements(Seed[] elements) {
        Collections.addAll(seeds, elements);
    }

    public Seed getElement(int index) {
        return seeds.get(index);
    }

    public int getNbElements() {
        return seeds.size();
    }

    public String toString() {
        return label;
    }
}
