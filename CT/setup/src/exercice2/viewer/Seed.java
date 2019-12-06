package exercice2.viewer;

public class Seed {

    public Seed seed;
    private String name;

    public Seed(String _name) {
        this.name = _name;
    }


    public void addChild(Seed child) {
        this.seed.addChild(child);
    }

    public void addChildren(Seed[] children) {
        this.seed.addChildren(children);
    }

    public Seed getChild(int index) {
        return this.seed.getChild(index);
    }

    public int getNbChildren() {
        return this.seed.getNbChildren();
    }


}
