package syntax;

public class Demo {

	public static void main(String[] args) {
		byte b = -12;
		int i = 10;
		double d = 12.0;
		float f = 12.0F;
		char c = 10;
		long l = 10L;
		b = (byte) 129;
		String s = "hello";

		double e = b + i + c + l + f + d;
		// System.out.println(d2);

		int i2 = i++ + i-- + ++i - i--;
		// System.out.println(i);

		i += 2;

		int i3 = 2;
		int i4 = 4;

		// System.out.println(i3 & i4);

		// +
		// -
		// ++
		// --
		// /
		// *
		// +=
		// -=
		// /=
		// *=
		// |
		// &
		// ^
		// %
		// ~
		// !
		// >>
		// <<
		// <<<
		// ||
		// &&
		
		System.out.println(7 % 8);

	}

}
