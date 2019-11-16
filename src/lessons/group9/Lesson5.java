package lessons.group9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Lesson5 {
	
    public static List<Book> filterBookByPredicate(List<Book> bookList, Predicate<Book> predicate) {
    	return bookList.stream()
    			.filter(predicate)
    			.collect(Collectors.toList());
    }
    
    public static void main(String[] args) throws CloneNotSupportedException {
		int[] arr = {1, 2};
		Arrays.stream(arr).max().getAsInt();
		List<Book> bookList = null;
		List<Book> filterBookByYear = 
				filterBookByPredicate(bookList, (book) -> book.getPublishDate() >= 1990);
		List<Book> filterBookByName = 
				filterBookByPredicate(bookList, (book) -> book.getName().equals("Pushkin"));
		
		Book book = new Book();
		Book clone = (Book)book.clone();
    }

}

class Book {
	
	private String name;

	public int getPublishDate() {
		// TODO Auto-generated method stub
		return 0;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return "";
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return "Book [name=" + name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
	
	
}
