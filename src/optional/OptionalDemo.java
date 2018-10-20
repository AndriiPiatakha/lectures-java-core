package optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {

	// The purpose of the class is to provide a type-level
	// solution for representing optional values instead of using null
	// references.

	public static void main(String[] args) {
//		whenCreatesEmptyOptionalThenCorrect();
//		givenNonNullWhenCreatesNonNullableThenCorrect();
//		givenNonNullWhenCreatesNullableThenCorrect();
//		givenOptionalWhenIsPresentWorksThenCorrect();
//		givenOptionalWhenIfPresentWorksThenCorrect();
//		whenOrElseWorksThenCorrect();
//		whenOrElseGetWorksThenCorrect();
//		whenOrElseGetAndOrElseOverlapThenCorrect();
//		whenOrElseGetAndOrElseDifferThenCorrect();
//		whenOrElseThrowWorksThenCorrect();
//		givenOptionalWhenGetsValueThenCorrect();
//		givenOptionalWithNullWhenGetThrowsExceptionThenCorrect();
//		whenOptionalFilterWorksThenCorrect();
//		givenOptionalWhenMapWorksThenCorrect();
//		givenNonNullWhenCreatesNullableThenCorrect();
	}

	public static void whenCreatesEmptyOptionalThenCorrect() {
		Optional<String> empty = Optional.empty();
		System.out.println("Should be false: " + empty.isPresent());
		System.out.println(empty.get());
	}

	public static void givenNonNullWhenCreatesNonNullableThenCorrect() {
		String name = "some value";
		Optional<String> ofString = Optional.of(name);
		System.out.println(ofString.toString());
		System.out.println(ofString.get());
		
//		if (ofString != null) {
//			
//		}
		if (ofString.isPresent()) {
			System.out.println(ofString.get());
		}
	}

	// in case we expect some null values for
	// the passed in argument, we can use the ofNullable API:

	public static void givenNonNullWhenCreatesNullableThenCorrect() {
		String name = "some other value";
		Optional<String> opt = Optional.ofNullable(name);
		System.out.println("Optional[test] " + opt.toString());

		// NPE
		 name = null;
		 Optional.of(name);
	}

	public static void givenOptionalWhenIsPresentWorksThenCorrect() {
		Optional<String> opt = Optional.of("some");
		System.out.println(opt.isPresent());

		opt = Optional.ofNullable(null);
		System.out.println(opt.isPresent());
	}

	public static void givenOptionalWhenIfPresentWorksThenCorrect() {
		Optional<String> opt = Optional.of("some value");

		opt.ifPresent(name -> System.out.println(name.length()));
		
		// instead of
		String someValue = null;
		if (someValue != null) {
			System.out.println(someValue.length());
		}

	}

	public static void whenOrElseWorksThenCorrect() {
		String nullName = null;
		String name = Optional.ofNullable(nullName).orElse("john");
		System.out.println(name);
	}

	public static void whenOrElseGetWorksThenCorrect() {
		String nullName = null;
		String name = Optional.ofNullable(nullName).orElseGet(() -> "john");
		System.out.println(name);
	}

	// when the wrapped value is not present, then both orElse
	// and orElseGet APIs work exactly the same way.
	public static void whenOrElseGetAndOrElseOverlapThenCorrect() {
		String text = null;

		System.out.println("Using orElseGet:");
		String defaultText = Optional.ofNullable(text).orElseGet(OptionalDemo::getMyDefault);
		System.out.println("Default Value: " + defaultText);

		System.out.println("Using orElse:");
		defaultText = Optional.ofNullable(text).orElse(getMyDefault());
		System.out.println("Default Value: " + defaultText);
	}

	public static void whenOrElseGetAndOrElseDifferThenCorrect() {
		String text = "Text present";

		System.out.println("Using orElseGet:");
		String defaultText = Optional.ofNullable(text).orElseGet(OptionalDemo::getMyDefault);
		System.out.println("Text present " + defaultText);

		System.out.println("Using orElse:");
		defaultText = Optional.ofNullable(text).orElse(getMyDefault());
		System.out.println("Text present" + defaultText);
	}

	public static void whenOrElseThrowWorksThenCorrect() {
		String nullName = null;
		String name = Optional.ofNullable(nullName).orElseThrow(IllegalArgumentException::new);
	}

	public static void givenOptionalWhenGetsValueThenCorrect() {
		Optional<String> opt = Optional.of("some");
		String name = opt.get();

		System.out.println("some " + name);
	}

	public static void givenOptionalWithNullWhenGetThrowsExceptionThenCorrect() {
		Optional<String> opt = Optional.ofNullable(null);
		String name = opt.get();
		System.out.println(name);
		// reminder ALWAYS use isPresent()
	}

	public static void whenOptionalFilterWorksThenCorrect() {
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

	public static void givenOptionalWhenMapWorksThenCorrect() {
		List<String> companyNames = 
				Arrays.asList("paypal", "oracle", "", "microsoft", "", "apple");
		Optional<List<String>> listOptional = Optional.of(companyNames);

		int size = listOptional.map(List::size).orElse(0);
		System.out.println("Size should be 6 = " + size);
	}

	public static String getMyDefault() {
		System.out.println("Getting Default Value");
		return "Default Value";
	}
	
	public void test() {
		String myDefault = getMyDefault();
		if (myDefault != null) {
			
		}
		
	}

}
