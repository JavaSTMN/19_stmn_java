package exercice2.viewer;

import java.util.ArrayList;
import java.util.List;

public class Seed {
    private String label;
    private List<Seed> seeds;

    public Seed(String label){
        this.label = label;
        this.seeds = new ArrayList<Seed>();

    }

    public void addElements(List<Seed> Elements){
        for (Seed seed :
                Elements) {
            this.seeds.add(seed);

        }
    }

    public void addElement(Seed Element){
        this.seeds.add(Element);
    }

    public Seed getElement(int index){
        return (Seed) this.seeds.get(index);
    }

    public int getNbElements(){
        return this.seeds.size();
    }

    public String toString(){
        return this.label;
    }
}
