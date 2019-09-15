
public abstract class AXiXo implements ICollection {
	protected int[] elements;
	protected int capacity;
	protected int size;

	public AXiXo(int capacity) {
		elements = new int[capacity];
		this.capacity = capacity;
		size = 0;
	}

	// Important notice: This method has default visibility for test purpose
	protected AXiXo(int capacity, int[] elements) {
		this(capacity);
		for (int i = 0; i < elements.length; ++i) {
			this.elements[i] = elements[i];
		}
		size = elements.length;
	}

	@Override
	public void add(int elt) throws Exception {
		push(elt);

	}

	@Override
	public int removeFirst() throws Exception {
		return pop();
	}

	public void push(int value) throws Exception {
		if (size >= capacity) {
			throw new Exception("Max size reached. Cannot add more elements");
		}
		elements[size] = value;
		size = size + 1;
	}

	public abstract int pop() throws Exception;

	// Important notice: This method has default visibility for test purpose
	int getSize() {
		return size;
	}

	// Important notice: This method has default visibility for test purpose
	int getElement(int i) {
		return elements[i];
	}
}
