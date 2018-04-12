package labs.practice6;

/**
 * Demo class of Part5.
 * 
 * Demonstrates how binary tree works. 
 * 
 * @author Andrey Pyatakha
 *
 */
public class Part5 {
	
	/**
	 * Enter point to the Part5.
	 * 
	 * Creates tree and fills it with the elements.
	 * Printing the tree to console.
	 * 
	 * Then, removes elements from the tree.
	 * And again prints tree to console.
	 * 
	 * @param args input parameters.
	 */
	public static void main(String[] args) {
		Tree<Integer> tree = new Tree<>();
		System.out.println(tree.add(3));
		System.out.println(tree.add(3));
		System.out.println("~~~~~~~");
		tree.add(new Integer[] { 1, 2, 5, 4, 6, 0 });
		tree.print();
		System.out.println("~~~~~~~");
		System.out.println(tree.remove(5));
		System.out.println(tree.remove(5));
		System.out.println("~~~~~~~");
		tree.print();
	}

}
