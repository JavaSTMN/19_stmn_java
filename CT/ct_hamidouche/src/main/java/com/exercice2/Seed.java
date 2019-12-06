
import com.exercice2.viewer.ITree;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mehdi
 */
public class Seed implements ITree{

    private String label;

    private List<Seed> elements = new ArrayList();

    private Seed parent;

    public Seed(String label) {
        this.label = label;
    }

    public void addElement(Seed element) {
        this.elements.add(element);
        element.setParent(this);

    }

    public void addElements(List<Seed> elements) {
        this.elements.addAll(elements);
    }

    public Seed getElement(int index) {

        return elements.get(index);
    }

    public int getNbElements() {

        return elements.size();
    }

    public String toString() {
        return this.label;
    }

    /* Question 3- en l'etat il n'est pas possible d'utiliser seed avec le code fourni car 
    il n'est pas possible pour un enfant de connaitre son parent. Il faudrait un attribut parent 
    ainsi qu'une methode renvoyant celui ci. pour implementer linterfqce itree dans seed, il faudra aussi renommer la methode 
    getElement pour qu'elle corresponde au getChild de l'interface
     */
    private void setParent(Seed parent) {
        this.parent = parent;
    }
    
    public Seed getParent(){
        return this.parent;
    }
    
    @Override
    public Seed getRoot(){
       if(this.getParent()==null){
           return this;
       } 
       
       else{
           this.getParent().getRoot();
       }
        return null;
    }

    @Override
    public Object getChild(Object parent, int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getChildCount(Object parent) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    
