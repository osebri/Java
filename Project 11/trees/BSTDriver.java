public class BSTDriver{

	public static void main(String[] args){
	
		BSTree tree = new BSTree();
		
		System.out.println(tree.add(10));
		System.out.println(tree.add(8));
		System.out.println(tree.add(14));
		System.out.println(tree.add(1));
		System.out.println(tree.add(10));
	
		tree.printA();
	}
}