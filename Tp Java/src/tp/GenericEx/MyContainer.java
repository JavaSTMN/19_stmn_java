package tp.GenericEx;

import java.util.ArrayList;
import java.util.List;

import javax.swing.plaf.IconUIResource;


public class MyContainer<T extends IUpdatableObject>{
	private List<Integer> containers = new ArrayList<Integer>();

	public void add(T o ) {
		for (T a: storage) {
			if(a.getUid() == o.getUid()) {
				a.update(o);
				return;
			}
		}
	}
	
	public int getSize() {
		return storage.size();
	}
	
	T getElement(int index) {
		return storage.get(index);
	}
}
