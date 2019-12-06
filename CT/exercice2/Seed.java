package exercice2;

import exercice2.viewer.ITree;

import java.util.ArrayList;
import java.util.List;

public class Seed implements ITree {

    private String label;
    private List<Seed> childs;

    public Seed(String label) {
        this.label = label;
        this.childs = new ArrayList<>();
    }

    public void addElement(Seed element){
        childs.add(element);
    }

    public void addElements(Seed[] elements){
        for (Seed element: elements) {
            addElement(element);
        }
    }

    public Seed getElement(int index) {
        return childs.get(index);
    }

    public int getNbElements(){
        return childs.size();
    }

    @Override
    public Object getChild(Object parent, int index) {
        return ((Seed) parent).getElement(index);
    }

    @Override
    public int getChildCount(Object parent) {
        return ((Seed) parent).getNbElements();
    }

    @Override
    public Object getRoot() {
        return this;
    }

    public String toString(){
        return this.label;
    }

    public String serialize(){
        StringBuilder json = new StringBuilder("{");
        json.append("\"label\":\"").append(this.label).append("\",");
        json.append("\"childs\": [");
        for(int i = 0; i < childs.size(); i++){
            json.append(childs.get(i).serialize());
            if(i != childs.size() - 1){
                json.append(", ");
            }
        }
        json.append("]}");
        return json.toString();
    }

    public static Seed createExample(){
        Seed root = new Seed("Library");
        root.addElements(new Seed[]{
                new Seed("Uncommon"),
                new Seed("Rare"),
                new Seed("Legendary")
        });
        root.getElement(0).addElements(new Seed[]{
                new Seed("CounterSpell")
        });

        root.getElement(1).addElements(new Seed[]{
                new Seed("Preparation"),
                new Seed("Book of Specters"),
        });

        root.getElement(2).addElements(new Seed[]{
                new Seed("Raid the Sky Temple")
        });
        return root;
    }
}
