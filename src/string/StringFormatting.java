package string;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Formatter;
import java.util.Locale;

public class StringFormatting {
	
	public static final String INVALID_UOM_ERROR_MESSAGE = 
			"uom %d is invalid for product %s asdas %d asdas %d";

	public static void main(String[] args) {
		
		String format = String.format(INVALID_UOM_ERROR_MESSAGE, 5, "Boots Size 7", 10, 90);
		System.out.println(format);
		
//		System.out.printf(INVALID_UOM_ERROR_MESSAGE, "Boots Size 7");

		Formatter fr = new Formatter();
		fr.format("%.4f", Math.PI);
		String string = fr.toString();
		String s = String.format("%.4f", Math.PI);
		System.out.println(s);
		
		long n = 461012;
		System.out.format("%d%n", n); // --> "461012"
		System.out.format("%08d%n", n); // --> "00461012"
		System.out.format("%+8d%n", n); // --> " +461012"
		System.out.format("%,8d%n", n); // --> " 461,012"
		System.out.format("%+,8d%n%n", n); // --> "+461,012"

		double pi = Math.PI;

		System.out.format("%f%n", pi); // --> "3.141593"
		System.out.format("%.3f%n", pi); // --> "3.142"
		System.out.format("%10.3f%n", pi); // --> " 3.142"
		System.out.format("%-10.3f%n", pi); // --> "3.142"
		System.out.format(Locale.FRANCE, "%-10.4f%n%n", pi); // --> "3,1416"

		Calendar c = Calendar.getInstance();
		System.out.format("%tB %te, %tY%n", c, c, c); // --> "May 29, 2006"

		System.out.format("%tl:%tM %tp%n", c, c, c); // --> "2:34 am"

		System.out.format("%tD%n", c); // --> "05/29/06"

		customFormat("###,###.###", 123456.789);
		customFormat("###.##", 123456.789);
		customFormat("000000.000", 123.78);
		customFormat("$###,###.###", 12345.67);

//			applies to 							output
//		%a 	floating point (except BigDecimal) 	Hex output of floating point number
//		%b 	Any type 	�true� if non-null, �false� if null
//		%c 	character 	Unicode character
//		%d 	integer (incl. byte, short, int, long, bigint) 	Decimal Integer
//		%e 	floating point 	decimal number in scientific notation
//		%f 	floating point 	decimal number
//		%g 	floating point 	decimal number, possibly in scientific notation depending on the precision and value.
//		%h 	any type 	Hex String of value from hashCode() method.
//		%n 	none 	Platform-specific line separator.
//		%o 	integer (incl. byte, short, int, long, bigint) 	Octal number
//		%s 	any type 	String value
//		%t 	Date/Time (incl. long, Calendar, Date and TemporalAccessor) 	%t is the prefix for Date/Time conversions. More formatting flags are needed after this. See Date/Time conversion below.
//		%x 	integer (incl. byte, short, int, long, bigint) 	Hex string.

	}

	static public void customFormat(String pattern, double value) {
		DecimalFormat myFormatter = new DecimalFormat(pattern);
		String output = myFormatter.format(value);
		System.out.println(value + "  " + pattern + "  " + output);
	}

}
