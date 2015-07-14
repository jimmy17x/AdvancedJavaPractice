package genericProgramming;

public class StringList<T> implements IList<T> {
	T[] dataStore;
	int size;
	int pos;

	public StringList(int ttlElements) {
		size = ttlElements;
		pos = 0;
		dataStore = (T[]) new Object[size];
	}

	public void add(T element) {
		dataStore[pos] = element;
		++pos;
	}

	public T get(int n) {
		return dataStore[n];
	}

}
