package genericProgramming;

public class Node<T> {
	private T data;
	public Node next;

	public Node(T n) {
		data = n;
		next = null;
	}

	T getData()
	{
		return data;
	}
}
