//import java.util.HashSet;
//import java.util.Set;
//
//class Copier<T extends Cloneable> {
//	public T copy(T param) throws CloneNotSupportedException {
//		return (T) param.clone(); // 1
//	}
//}
//
//class A implements Cloneable {
//	public int i = 10;
//
//	@Override
//	public A clone() throws CloneNotSupportedException {
//		return (A) super.clone(); // 2
//	}
//}
//
//class B extends A {
//	public int i = 20;
//}
//
//public class MyClass {
//	public static void main(String[] args) throws CloneNotSupportedException {
//		B b = new B();
//		Copier<B> copier = new Copier<>(); // 3
//		A a = copier.copy(b); // 4
//		System.out.println(a.i);
//	}
//}
