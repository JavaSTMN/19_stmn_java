
public class MyObject implements iUpdatableObject{
	private int id;
	private int version;
	public MyObject(int id, int version) {
		this.id =id;
		this.version = version;
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public int getUuid() {
		// TODO Auto-generated method stub
		return this.id;
	}
	@Override
	public void update(iUpdatableObject obj) {
		// TODO Auto-generated method stub
		this.version = ((MyObject) obj).version;
		
	}
}
