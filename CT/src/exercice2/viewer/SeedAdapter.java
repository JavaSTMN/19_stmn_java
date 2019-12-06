package exercice2.viewer;

public class SeedAdapter implements ITree {
    private Seed seed;

    public SeedAdapter(Seed seed) {
        this.seed = seed;
    }

    @Override
    public Object getChild(Object parent, int index) {
        return seed.getElement(index);
    }

    @Override
    public int getChildCount(Object parent) {
        return seed.getNbElements();
    }

    @Override
    public Object getRoot() {
        return seed;
    }

    public String toString() {
        return seed.toString();
    }
}
