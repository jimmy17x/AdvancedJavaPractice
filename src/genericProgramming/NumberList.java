package genericProgramming;

public class NumberList<T> implements IList<T> {
	T[] dataStore;
	int size;
	int pos;

	public NumberList(int ttlElements) {
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
