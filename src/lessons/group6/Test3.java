package lessons.group6;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Test3 {
	
	public static void main(String[] args) {
		double d = 1;
		NumberFormat formatter = new DecimalFormat("##.00");
		System.out.print(formatter.format(d));
	}

}
