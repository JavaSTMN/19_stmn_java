package exercice3;

import java.util.ArrayList;
import java.util.List;

public class Toy {

    private List<IToyElement> toyElements = new ArrayList<>();

    public void addElement(IToyElement toyElement){
        toyElements.add(toyElement);
    }

    public double getArea(){
        double result = 0;
        for (IToyElement toyElement: toyElements) {
            result += toyElement.getArea();
        }
        return result;
    }
}
