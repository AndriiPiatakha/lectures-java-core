package labs.practice6;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Class stores range start on int end another.
 * 
 * This class is iterable. Contains boolean value in constructor end specify
 * order of iterator.
 * 
 * By default there is natural order.
 * 
 * @author Andrey Pyatakha
 *
 */
public class Range implements Iterable<Integer> {
	/**
	 * Flag that indicates reverse order of iterator.
	 */
	private boolean reverse;

	/**
	 * Range begins with this value.
	 */
	private int start;

	/**
	 * Range ends with this value.
	 */
	private int end;

	/**
	 * Constructor of Range.
	 * 
	 * In case if star value more than end value the IllegalArgumentException is
	 * thrown.
	 * 
	 * @param start
	 *            int value where this range starts.
	 * @param end
	 *            int value where this range ends.
	 * @param reverse
	 *            set flag of reverse order.
	 */
	public Range(int start, int end, boolean reverse) {
		if (start > end) {
			throw new IllegalArgumentException
			("From value " + start + " bigger than end value " + end);
		}
		this.reverse = reverse;
		this.start = start;
		this.end = end;
	}

	/**
	 * Constructor of Range.
	 * 
	 * In case if star value more than end value the IllegalArgumentException is
	 * thrown.
	 * 
	 * By default there is false flag of reverse order.
	 * 
	 * @param start
	 *            int value where this range starts.
	 * @param end
	 *            int value where this range ends.
	 */
	public Range(int from, int to) {
		this(from, to, false);
	}

	/**
	 * Returns iterator object.
	 * 
	 * Depends on the flag of reverse order returns different iterators.
	 */
	@Override
	public Iterator<Integer> iterator() {
		return (reverse) ? new ReverseRangeIterator() : new RangeIterator();
	}

	/**
	 * Iterator of Range.
	 * 
	 * Iterates from the beginning of the range in natural order.
	 * 
	 * @author Andrey Pyatakha
	 *
	 */
	private class RangeIterator implements Iterator<Integer> {

		/**
		 * Cursor indicates position of iterator at the moment.
		 */
		private int cursor = start;

		/**
		 * Returns {@code true} if the iteration has more elements. (In other
		 * words, returns {@code true} if {@link #next} would return an element
		 * rather than throwing an exception.)
		 *
		 * @return {@code true} if the iteration has more elements
		 */
		@Override
		public boolean hasNext() {
			return cursor <= end;
		}

		
		/**
	     * Returns the next element in the iteration.
	     *
	     * @return the next element in the iteration
	     * @throws NoSuchElementException if the iteration has no more elements
	     */
		@Override
		public Integer next() {
			int current = cursor;
			if (current > end) {
				throw new NoSuchElementException();
			}
			cursor++;
			return current;
		}
	}

	
	/**
	 * Iterator of Range.
	 * 
	 * Iterates from the end of the range reverse order.
	 * 
	 * @author Andrey Pyatakha
	 *
	 */
	private class ReverseRangeIterator implements Iterator<Integer> {
		
		/**
		 * Cursor indicates position of iterator at the moment.
		 */
		private int cursor = end;

		/**
		 * Returns {@code true} if the iteration has more elements. (In other
		 * words, returns {@code true} if {@link #next} would return an element
		 * rather than throwing an exception.)
		 *
		 * @return {@code true} if the iteration has more elements
		 */
		@Override
		public boolean hasNext() {
			return cursor >= start;
		}

		/**
	     * Returns the next element in the iteration.
	     *
	     * @return the next element in the iteration
	     * @throws NoSuchElementException if the iteration has no more elements
	     */
		@Override
		public Integer next() {
			int current = cursor;
			if (current < start) {
				throw new NoSuchElementException();
			}
			cursor--;
			return current;
		}
	}
}
