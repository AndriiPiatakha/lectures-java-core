package patterns.basicpatterns.adapter;

public class SortListAdapter implements Sorter {
	private NumberSorter numberSorter;
	
	public SortListAdapter() {
		numberSorter = new NumberSorter();
	}

	@Override
	public int[] sort(int[] numbers) {
		// convert the array to a List and call variable numberList
		// call the adapter
		// numberList = numberSorter.sort(numberList);
		// convert the list back to an array and return
		// return sortedNumberArray;
		return null;
	}

}
