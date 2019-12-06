package exercice2.viewer;

import java.util.ArrayList;
import java.util.List;

/*
  Question 3 : Dans l'état actuel, on ne peut pas utiliser le code car un noeud ne connait pas ses enfants
  Question 4 : Il faut rajouter une liste d'enfant aux noeuds et un constructeur.
  Question 8 : On pourrait donner un nom à chaque noeud en fonction de son parent et reconstruire l'arbre en fonction des noms des noeuds
*/
public class Node  {
    private String name;
    private List<Node> children;

    public Node(String name){
        this.name=name;
        this.children=new ArrayList<Node>();
    }

    public String toString(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addChild(Node child){
        child.setName(this.name+'_'+child.toString());
        children.add(child);
    }

    public void addChildren(Node[] children){
        for(Node child : children){
            addChild(child);
        }
    }

    public Node getChild(int index){
        return children.get(index);
    }

    public List<Node> getChildren(){
        return this.children;
    }

    public int getNbChildren(){
        return children.size();
    }

    public String serialize(){
        String json = "{name :"+this.name+"},";
        for (Node child : children){
            json = json+child.serialize();
        }
        return json;
    }

}
