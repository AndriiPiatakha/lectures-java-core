package optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {
	
//	The purpose of the class is to provide a type-level 
//	solution for representing optional values instead of using null references.

	public static void main(String[] args) {
		givenNonNullWhenCreatesNullableThenCorrect();
	}
	
	public void whenCreatesEmptyOptional_thenCorrect() {
	    Optional<String> empty = Optional.empty();
	    System.out.println("Should be false: " + empty.isPresent());
	}
	
	public void givenNonNullWhenCreatesNonNullableThenCorrect() {
	    String name = "baeldung";
	    Optional<String> ofString = Optional.of(name);
	    System.out.println(ofString.toString());
	}
	
//	in case we expect some null values for 
//	the passed in argument, we can use the ofNullable API:
	
	public static void givenNonNullWhenCreatesNullableThenCorrect() {
	    String name = "baeldung";
	    Optional<String> opt = Optional.ofNullable(name);
	    System.out.println("Optional[baeldung] " + opt.toString());
	    
	    // NPE
//	    name = null;
//	    Optional.of(name);
	}
	
	public void givenOptionalWhenIsPresentWorksThenCorrect() {
	    Optional<String> opt = Optional.of("Baeldung");
	    System.out.println(opt.isPresent());
	 
	    opt = Optional.ofNullable(null);
	    System.out.println(opt.isPresent());
	}
	
	public void givenOptionalWhenIfPresentWorksThenCorrect() {
	    Optional<String> opt = Optional.of("baeldung");
	 
	    opt.ifPresent(name -> System.out.println(name.length()));
	}
	
	public void whenOrElseWorksThenCorrect() {
	    String nullName = null;
	    String name = Optional.ofNullable(nullName).orElse("john");
	    System.out.println(name);
	}
	
	public void whenOrElseGetWorks_thenCorrect() {
	    String nullName = null;
	    String name = Optional.ofNullable(nullName).orElseGet(() -> "john");
	    System.out.println(name);
	}
	
	
//	when the wrapped value is not present, then both orElse 
//	and orElseGet APIs work exactly the same way.
	public void whenOrElseGetAndOrElseOverlap_thenCorrect() {
	    String text = null;
	 
	    System.out.println("Using orElseGet:");
	    String defaultText = 
	    Optional.ofNullable(text).orElseGet(this::getMyDefault);
	    System.out.println("Default Value " + defaultText);
	 
	    System.out.println("Using orElse:");
	    defaultText = Optional.ofNullable(text).orElse(getMyDefault());
	    System.out.println("Default Value " + defaultText);
	}
	
	public void whenOrElseGetAndOrElseDiffer_thenCorrect() {
	    String text = "Text present";
	 
	    System.out.println("Using orElseGet:");
	    String defaultText 
	      = Optional.ofNullable(text).orElseGet(this::getMyDefault);
	    System.out.println("Text present " + defaultText);
	 
	    System.out.println("Using orElse:");
	    defaultText = Optional.ofNullable(text).orElse(getMyDefault());
	    System.out.println("Text present" + defaultText);
	}
	
	public void whenOrElseThrowWorksThenCorrect() {
	    String nullName = null;
	    String name = Optional.ofNullable(nullName).orElseThrow(
	      IllegalArgumentException::new);
	}
	
	public void givenOptional_whenGetsValue_thenCorrect() {
	    Optional<String> opt = Optional.of("baeldung");
	    String name = opt.get();
	 
	    System.out.println("baeldung " +  name);
	}
	
	public void givenOptionalWithNull_whenGetThrowsException_thenCorrect() {
	    Optional<String> opt = Optional.ofNullable(null);
	    String name = opt.get();
	}
	
	public void whenOptionalFilterWorks_thenCorrect() {
	    Integer year = 2016;
	    Optional<Integer> yearOptional = Optional.of(year);
	    boolean is2016 = yearOptional.filter(y -> y == 2016).isPresent();
	    System.out.println(is2016);
	    boolean is2017 = yearOptional.filter(y -> y == 2017).isPresent();
	    System.out.println(is2017);
	}
	
	public boolean priceIsInRange2(Integer modem2) {
	     return Optional.ofNullable(modem2)
	       .map(Integer::valueOf)
	       .filter(p -> p >= 10)
	       .filter(p -> p <= 15)
	       .isPresent();
	 }
	
	public void givenOptionalWhenMapWorksThenCorrect() {
	    List<String> companyNames = Arrays.asList(
	      "paypal", "oracle", "", "microsoft", "", "apple");
	    Optional<List<String>> listOptional = Optional.of(companyNames);
	 
	    int size = listOptional
	      .map(List::size)
	      .orElse(0);
	    System.out.println("Size should be 6 = " + size);
	}
	
	public String getMyDefault() {
	    System.out.println("Getting Default Value");
	    return "Default Value";
	}
	
	
	
	
	
}
