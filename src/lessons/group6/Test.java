package lessons.group6;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Test {
	
	public static void main(String[] args) {
//		float f = Math.round(float(1123 % 1000 ) * 100);
//		System.out.println(f);
		
//		System.out.println(900 % 1000);
//		System.out.println(   (float)123 / 1000);
		
//		A121 a = new B121();
//		a.doSmthChild();
		
		B121 b = new A121();
		
		dosmthWithList(new CopyOnWriteArrayList<>());
		b.doSmthParent();
	} 
	
	public static void dosmthWithList(List list) {
		
	}

}


class A121 extends B121 {
	
	public void doSmthChild() {
		
	}
	
	public void doSmthParent(){
		
	}
	
}

class B121 extends C121 {
	
	public void doSmthParent(){
		
	}
}

class C121 {
	
}
