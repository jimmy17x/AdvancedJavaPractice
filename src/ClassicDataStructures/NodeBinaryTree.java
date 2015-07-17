package ClassicDataStructures;

public class NodeBinaryTree {
	int data;
	NodeBinaryTree left;
	NodeBinaryTree right;

	public NodeBinaryTree(int data) {
		this.data = data;
		left = null;
		right = null;
	}

	public NodeBinaryTree() {
		left = null;
		right = null;
	}
	
	public int getData()
	{
		return data;
	}

}
