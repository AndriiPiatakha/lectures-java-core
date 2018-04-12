package labs.practice6;

import java.util.*;


/**
 * Measures rate of changing ArrayList and LinkedList.
 * 
 * Emulate game in which there are N amoun of elements and
 * each K element should be removed. Game is finished when only
 * one element is left.
 * 
 * @author Andrey Pyatakha
 *
 */
public class Part2 {
	
	/**
	 * LinkedList object for measuring speed.
	 */
	private static List<Integer> linkList = new LinkedList<>();
	
	/**
	 * ArrayList object for measuring speed.
	 */
	private static List<Integer> arrList = new ArrayList<>();
	
	/**
	 * Amount of elements.
	 */
	public static final int ELEMENTS_AMOUNT = 100_000;
	
	/**
	 * Each element after this interval should be removed.
	 */
	public static final int INTERVAL = 10;
	
	/**
	 * Fills list with in int values.
	 * 
	 * @param list to fill with values.
	 * @param amount of values to fill.
	 */
	public static void fillList(List<Integer> list, int amount) {
		for (int i = 0; i < amount; i++) {
			list.add(i+1);
		}
	}
	
	/**
	 * Algorithm that removes each N element from the list.
	 * 
	 * Removing will last while one element is left.
	 * Takes an iterator of list. When iterator got no next
	 * element method creates new iterator.
	 * 
	 * This loop will last while there is more than one element in
	 * the list.
	 * 
	 * @param list to remove elements.
	 * @param n int value, interval to remove.
	 */
	public static void removeEachN(List<Integer> list, int n) {
		Iterator<Integer> iter = list.iterator();
		int count = 0;
		while(list.size() > 1) {
			 if(iter.hasNext()) {
				 iter.next();
	                count++;
	                if(count == 2) {
	                	iter.remove();
	                    count = 0;
	                    //System.out.println(list);
	                }
	            }
	            else {
	            	iter = list.iterator();
	            }
		}

	}
	

	/**
	 * Enter point to the Part2.
	 * 
	 * At first fills LinkedList with values.
	 * After measures the time of emulating game specified int
	 * the task.
	 * 
	 * Prints time to console.
	 * 
	 * Then doing the same with ArrayList. 
	 * 
	 * @param args input parameters.
	 */
	public static void main(String[] args) {
		fillList(linkList, ELEMENTS_AMOUNT);
		long start = System.nanoTime();
		removeEachN(linkList, INTERVAL);
		long delta = (System.nanoTime() - start) / 1_000_000;
		System.out.println("Time linked list: " + delta);
		
		fillList(arrList, ELEMENTS_AMOUNT);
		start = System.nanoTime();
		removeEachN(arrList, INTERVAL);
		delta = (System.nanoTime() - start) / 1_000_000;
		System.out.println("Time array list: " + delta);

	}

}
