package tp.GenericEx;

public class MyObject implements IUpdatableObject{
	public int id;
	public int version;
	
	public MyObject(int id, int version) {
		this.id = id;
		this.version = version;
	}
	
	public int getUid() {
		return id;
	}
	
	public void update(IUpdatableObject update) {
		version = ((MyObject) update).version;
	}
	
	public String toString() {
		return String.valueOf(id) + " " + String.valueOf(version);
	}
}
