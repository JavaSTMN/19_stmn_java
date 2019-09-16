public interface Stockage {
	public void add(int receive) throws Exception;
	public int pull();
	public int getElement(int i);
}                                                                                                                 