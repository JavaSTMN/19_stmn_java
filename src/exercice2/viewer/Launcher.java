package exercice2.viewer;

public class Launcher {
    public static void main(String[] args) {
        Node root = new Node("Bestiary");
        Node uncommon = new Node("Uncommon");
        Node brazen = new Node("Brazen zealot");
        Node murloc = new Node("Murloc Tidecaller");
        Node rare = new Node("Rare");
        Node toxy = new Node("Toxymonger");
        Node legendary = new Node("Legendary");
        Node deathwing = new Node("Deathwing");

        legendary.addChild(deathwing);
        rare.addChild(toxy);
        Node[] uncommonChild = {brazen, murloc};
        Node[] rootchild = {uncommon, rare, legendary};

        uncommon.addChildren(uncommonChild);
        root.addChildren(rootchild);

        System.out.println(root.toString());
        for (Node childroot : root.getChildren()) {
            System.out.println(" ->" + childroot.toString());
            for (Node childChild : childroot.getChildren()) {
                System.out.println("   -" + childChild.toString());
            }
        }
        System.out.println(root.serialize());
    }
}
