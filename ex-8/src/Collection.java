import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Collection <T extends iUpdatableObject>{

	public ArrayList<T> mycollection = new ArrayList<T>();
	public void add(T new_object) {
		T element = null;
		for(int i =0; i< mycollection.size();++i) {
			if(mycollection.get(i).getUuid()==new_object.getUuid()) {
				element = mycollection.get(i);
			}
		}
		if(element==null) {mycollection.add(new_object);}
		else {
			element.update(new_object);
		}
	}
}
