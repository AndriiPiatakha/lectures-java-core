package lessons;

import java.util.Arrays;

class Book {
		private String nameBook;
		private String authorBook;
		private String editionBook;
		private int yearBook;
		private int pagesBook;
		private int priceBook;
		private String typeBook;
		
		public String getName () {
			return nameBook;
		}
		
		public String getAuthor () {
			return authorBook;
		}
		
		public String getEdition () {
			return editionBook;
		}
		
		public int getYear () {
			return yearBook;
		}
		
		public int getPages () {
			return pagesBook;
		}
		
		public int getPrice () {
			return priceBook;
		}
		
		public String getType () {
			return typeBook;
		}
		Book (String nameBook, String authorBook, String editionBook,
			  int yearBook, int pagesBook, int priceBook, String typeBook) {
			
			this.nameBook = nameBook;
			this.authorBook = authorBook;
			this.editionBook = editionBook;
			this.yearBook = yearBook;
			this.pagesBook = pagesBook;
			this.priceBook = priceBook;
			this.typeBook = typeBook;
			
		}
}
public class HomeWork511 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book1 = new Book ("Name1", "Author1", "Izd2", 2018, 567, 1000, "Type1");
		Book book2 = new Book ("Name2", "Author2", "Izd1", 2010, 123, 900, "Type2");
		Book book3 = new Book ("Name3", "Author3", "Izd3", 2013, 456, 600, "Type3");
		Book book4 = new Book ("Name4", "Author1", "Izd1", 2011, 234, 100, "Type1");
		Book book5 = new Book ("Name5", "Author2", "Izd2", 2015, 890, 1050, "Type2");
		Book book6 = new Book ("Name6", "Author1", "Izd1", 2012, 789, 10, "Type3");
		Book book7 = new Book ("Name7", "Author2", "Izd3", 2017, 987, 1020, "Type1");
		Book book8 = new Book ("Name8", "Author1", "Izd1", 2011, 543, 160, "Type2");
		
		Book [] arr = {book1, book2, book3, book4, book5, book6, book7, book8};
		
		Book tempBook;
		
		Arrays.stream(arr).filter((abcd) -> abcd.getAuthor().equals("Author1")); 
		
		
	
		System.out.println("Sort by - Author1");
		for (int i=0; i < 8; i++) {
			if (arr[i].getAuthor() == "Author1") {
				tempBook = arr[i];
				System.out.println (tempBook.getName() + " " + tempBook.getAuthor() + " " 
								+ tempBook.getEdition() + " " + tempBook.getYear() + " "
								+ tempBook.getPages() + " " + tempBook.getPrice() + " "
								+ tempBook.getType());
			}
		}
		System.out.println("\nSort by - Izd3");
		for (int i=0; i < 8; i++) {
			if (arr[i].getEdition() == "Izd3") {
				tempBook = arr[i];
				System.out.println (tempBook.getName() + " " + tempBook.getAuthor() + " " 
								+ tempBook.getEdition() + " " + tempBook.getYear() + " "
								+ tempBook.getPages() + " " + tempBook.getPrice() + " "
								+ tempBook.getType());
			}
		}
		
		System.out.println("\nSort by - Year > 2011");
		for (int i=0; i < 8; i++) {
			if (arr[i].getYear() > 2011) {
				tempBook = arr[i];
				System.out.println (tempBook.getName() + " " + tempBook.getAuthor() + " " 
								+ tempBook.getEdition() + " " + tempBook.getYear() + " "
								+ tempBook.getPages() + " " + tempBook.getPrice() + " "
								+ tempBook.getType());
			}
		}
		
	}
}