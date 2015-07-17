package ClassicDataStructures;

public class BinarySearchTree {
	public NodeBinaryTree root;

	public BinarySearchTree() {
		root = null;
	}

	public void insert(int data) {
		NodeBinaryTree newNode = new NodeBinaryTree();
		newNode.data = data;
		if (root == null) {
			root = newNode;
		} else {
			NodeBinaryTree current = root;
			NodeBinaryTree parent;
			while (true) {
				parent = current;
				if (data < current.data) {
					current = current.left;
					if (current == null) {
						parent.left = newNode;
						break;
					}
				} else {
					current = current.right;
					if (current == null){
						parent.right = newNode;
					break;
					}
				}
			}
		}

	}

	public int min()
	{
		NodeBinaryTree current = root;
		while( current.left!= null )
			current = current.left;
		return current.getData();
	}
	public int max()
	{
		NodeBinaryTree current = root;
		while( current.right!= null )
			current = current.right;
		return current.getData();
	}
	
	public void inOrder() {
		inOrder(root);
	}

	public void inOrder(NodeBinaryTree root) {
		if (root != null) {
			inOrder(root.left);
			System.out.println(root.getData());
			inOrder(root.right);
		}
	}

	public void preOrder() {
		preOrder(root);
	}

	public void preOrder(NodeBinaryTree root) {
		if (root != null) {
			System.out.println(root.getData());
			preOrder(root.left);
			preOrder(root.right);
		}
	}
}
