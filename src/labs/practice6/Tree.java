package labs.practice6;

import java.util.Comparator;

/**
 * Binary tree implementation.
 * 
 * The elements are ordered using their Comparable natural ordering.
 * 
 * This implementation provides guaranteed log(n) time cost for the basic
 * operations, remove and contains.
 * 
 * @author Andrey Pyatakha
 *
 * @param <E>
 *            the type of elements maintained by this set
 */
public class Tree<E extends Comparable<E>> {
	/**
	 * Size store information about amount of the elements.
	 */
	private int size;

	/**
	 * Root node of the tree.
	 */
	private Node<E> root;

	/**
	 * Adds the specified element to this set if it is not already present. More
	 * formally, adds the specified element to this set if the set contains no
	 * element such that.
	 * 
	 * If this set already contains the element, the call leaves the set
	 * unchanged and returns false.
	 * 
	 * @param element
	 *            to be added to this set.
	 * @return true if this set did not already contain the specified element
	 */
	public boolean add(E element) {
		int oldSize = size;
		root = put(root, element);
		return oldSize < size;
	}

	/**
	 * Associated specified element with the specified node in this tree.
	 * 
	 * Set the highest elements on the right
	 * and the lowest elements on the left.
	 * 
	 * @param node to associate element
	 * @param element object
	 * @return Node with the element
	 */
	private Node<E> put(Node<E> node, E element) {
		if (node == null) {
			size++;
			return new Node<>(element);
		}
		int cmp = element.compareTo(node.element);
		if (cmp < 0) {
			node.left = put(node.left, element);
		} else if (cmp > 0) {
			node.right = put(node.right, element);
		}
		return node;
	}
	
	
	/**
	 * Adds all of the elements in the specified array to this set.
	 * @param elements containing elements to be added to this set.
	 */
	public void add(E[] elements) {
		for (E el : elements) {
			add(el);
		}
	}

	/**
	 * Finds min element in this tree.
	 * @return element.
	 */
	private E min() {
		return min(root).element;
	}

	/**
	 * Finds min element in this tree.
	 * @return element.
	 */
	private Node<E> min(Node<E> node) {
		if (node.left == null)
			return node;
		return min(node.left);
	}

	/**
	 * Removes min element.
	 */
	private void deleteMin() {
		root = deleteMin(root);
	}

	/**
	 * Removes min element.
	 *
	 * @param node to be deleted.
	 * @return Node that had been removed.
	 */
	private Node<E> deleteMin(Node<E> node) {
		if (node.left == null)
			return node.right;
		node.left = deleteMin(node.left);
		return node;
	}

	/**
     * Removes the specified element from this set if it is present.
     * More formally, removes an element such that,
     * if this set contains such an element.  Returns true if
     * this set contained the element (or equivalently, if this set
     * changed as a result of the call).  (This set will not contain the
     * element once the call returns.)
     * 
	 * @param element to be removed.
	 * @return true if this set contained the specified element
	 */
	public boolean remove(E element) {
		int oldSize = size;
		root = remove(root, element);
		return oldSize > size;
	}

	/**
     * Removes the specified element from this set if it is present.
     * More formally, removes an element such that,
     * if this set contains such an element.  Returns true if
     * this set contained the element (or equivalently, if this set
     * changed as a result of the call).  (This set will not contain the
     * element once the call returns.)
     * 
	 * @param node to be removed.
	 * @param element to be removed.
	 * @return Node that had been removed.
	 */
	public Node<E> remove(Node<E> node, E element) {
		if (node == null)
			return null;
		int cmp = element.compareTo(node.element);
		if (cmp < 0) {
			node.left = remove(node.left, element);
		} else if (cmp > 0) {
			node.right = remove(node.right, element);
		} else {
			size--;
			if (node.right == null)
				return node.left;
			if (node.left == null)
				return node.right;
			Node<E> t = node;
			node = min(t.right);
			node.right = deleteMin(t.right);
			node.left = t.left;
		}
		return node;
	}

	/**
	 * Prints this tree to console.
	 */
	public void print() {
		root = print(root, 0);
	}

	/**
	 * Prints this tree to console.
	 * 
	 * @param node Node to be printed.
	 * @param depth of the tree
	 * @return Node
	 */
	private Node<E> print(Node<E> node, int depth) {
		if (node == null)
			return null;
		node.right = print(node.right, depth + 1);
		printTabs(depth);
		System.out.println(node.element);
		node.left = print(node.left, depth + 1);
		return node;
	}

	/**
	 * Prints tabs.
	 * 
	 * @param count of tabs.
	 */
	private void printTabs(int count) {
		for (int i = 0; i < count; i++) {
			System.out.print("\t");
		}
	}

	/**
	 * Elements of the tree which are associated with the elements.
	 * 
	 * @author Andrey Pyatakha
	 *
	 * @param <E> the type of elements maintained by this class.
	 */
	private static class Node<E> {
		Node left, right;
		E element;

		public Node(E el) {
			element = el;
		}
	}

}
