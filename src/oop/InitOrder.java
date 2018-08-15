package oop;

public class InitOrder {
	private Parent p;
	
	public InitOrder() {
		p = new Parent();
	}
	// ||
	public InitOrder(Parent p) {
		this.p = p;
	}
	
	public static void main(String[] args) {
		Parent p = new Child();
		System.out.println("=====================");
		Parent p2 = new Child();
//		System.out.println(Parent.class);
	}

}


class Parent {
	static {
		System.out.println("Static init block parent");
	}
	
	{
		System.out.println("Init block parent");
	}
	
	public Parent() {
		System.out.println("Parent constructor");
	}
	
}

class Child extends Parent {
	static {
		System.out.println("Static init block child");
	}
	
	{
		System.out.println("Init block child");
	}
	
	public Child() {
		System.out.println("child constructor");
	}
}
