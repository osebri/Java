public class BSTree{

	private Node root;
	
	public BSTree(){
		root = null;
	}
	
	private class Node{
		public Node left, right;
		public int data;
	
		public Node(int dataIn){
			data = dataIn;
			left = null;
			right = null;
		}
	}
	
	public boolean add(int valueIn){
		boolean added = false;
		
		if(root == null){
			root = new Node(valueIn);
			added = true;
		}
		else{
			//call recursive method
			added = add(valueIn, root);
		}
		return added;
	}
	
	private boolean add(int valueIn, Node root){
		boolean result = false;
		
		if(valueIn == root.data){
			//return false;
		}
		else if(valueIn < root.data){
			if(root.left == null){
				root.left = new Node(valueIn);
				//return true;
				result = true;
			}
			else{
				//return add(valueIn, root.left);
				result = add(valueIn, root.left);
			}
		}
		else{
			if(root.right == null){
				root.right = new Node(valueIn);
				//return true;
				result = true;
			}
			else{
				//return add(valueIn, root.right);
				result = add(valueIn, root.right);
			}
		}
		return result;
	}
	
	
	public void print(){
		print(root);		
	}
	
	public void print(Node root){
		if(root != null){
			print(root.left);
			System.out.println(root.data);
			print(root.right);
		}
	}
	
	//-----Alternative print-----
	public void printA(){
		if(root != null){
			print(root);
		}
	}
	
	public void printA(Node root){
		if(root.left != null){
			printA(root.left);
		}
		System.out.println(root.data);
		if(root.right != null){
			printA(root.right);
		}
	}
}