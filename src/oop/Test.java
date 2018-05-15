package oop;

import java.util.Objects;

public class Test {
	
	public static void main(String[] args) {
		
	}

}

class Book2 {
	
	private String name;
	private int publishYear;
	
	@Override
	public String toString() {
		return "Book [name=" + name + ", publishYear=" + publishYear + "]";
	}
	
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		result = prime * result + publishYear;
//		return result;
//	}
	
//	@Override
//	public int hashCode() {
//		return Objects.hash(name, publishYear);
//	}
	
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (!(obj instanceof Book))
//			return false;
//		Book anyName = (Book) obj;
//		if (name == null) {
//			if (anyName.name != null)
//				return false;
//		} else if (!   name.equals(anyName.name)    )
//			return false;
//		if (publishYear != anyName.publishYear)
//			return false;
//		
//	
//		return true;
//	}
	
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Book2 that = (Book2) o;
		return Objects.equals(name, that.name) &&
				Objects.equals(publishYear, that.publishYear);
	}
	
	
	
}
