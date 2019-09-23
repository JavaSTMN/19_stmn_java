import java.util.ArrayList;

public class MyContainer<T extends IUpdatableObject> {

	protected ArrayList<T> storage = new ArrayList<>();
	
	public MyContainer() {
		// TODO Auto-generated constructor stub
	}
	
	MyContainer(T[] elements) {
		for (T item:elements) {
			storage.add(item);
		}
	}
	
	public void add(T o) {
		for (T a: storage) {
			if (a.getUid() == o.getUid()) {
				a.update(o);
				return;
			}
		}
		storage.add(o);
	}
	
	public int getSize() {
		return storage.size();
	}
	
	T getElement(int index) {
		return storage.get(index);
	}

}
