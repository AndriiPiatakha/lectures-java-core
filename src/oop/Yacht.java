package oop;

public class Yacht {

	protected int lenght;
	String name;
	private int i;
	int i2;

	public Yacht() {
	}

	private Yacht(int i) {
	}

	protected Yacht(int i, int b) {
	}

	Yacht(String s) {

	}

	{

	}

	static {

	}

	public void setName(String s) {
		if (s == null) {
			return;
		}
		try {
			Integer valueOf = Integer.valueOf(s);
			return;
		} catch (Exception e) {

		}
		this.name = s;
	}

	public void test() {

	}

	public static void test2() {

	}

	public static void main(String[] args) {
//		Yacht y = new Yacht();
//		y.test();
//		y.test2();
//
//		Yacht.test2();
//		Parus p = y.new Parus();
//
//		Parus2 p2 = new Parus2();
//
//		Yacht.Parus2 p3 = new Yacht.Parus2();
//
//		Class<Yacht> c = Yacht.class;
//
//		YachtDao d = YachtDao.getInstance();
//		YachtDao d2 = YachtDao.getInstance();
//
//		Bottle bot = new Bottle();
//		bot.swim();
//		bot.startEngine();
		
		
		
		
		
		Cart cart = new InMemoryCart();
		Cart cart2 = new InSessionCart();
		
		cart.putProductInCart(new MasterProduct());
		cart2.putProductInCart(new MasterProduct());
	}

	public void swim() {
		// smth yacht specific
		// startEngine();
	}

	public void startEngine() {

	}

	private class Parus {

	}

	private static class Parus2 {

	}

}

interface Swimable {
	public abstract void swim();

	default void swim2() {
		System.out.println("Swim2");
	}
}

interface Swimable2 {
	public abstract void swim();

	default void swim2() {
		System.out.println("Swim2");
	}
}

class SuperYacht extends Yacht {

	public void swim() {

	}

	public SuperYacht(int lenght) {
		this.lenght = lenght;

	}

}

class Bottle extends Yacht implements Swimable {

	private Yacht yacht;

	public Bottle() {
		this.yacht = new Yacht();
	}

	public void sale() {
		yacht.swim();
	}
}

class YachtDao {

	private static YachtDao instance;

	private YachtDao() {
	}

	public static YachtDao getInstance() {
		if (instance == null) {
			instance = new YachtDao();
		}
		return instance;
	}
}

abstract class Product {
	protected String name;
}

class MasterBaseProduct extends Product {

}

class MasterProduct extends Product {
	private int concreteSize;
}

interface Cart {
	void putProductInCart(Product p);

	void putProductsInCart(Product... products);
}


class InMemoryCart implements Cart {

	@Override
	public void putProductInCart(Product p) {
		System.out.println("Put product in cart IN MEMORY");
		
	}

	@Override
	public void putProductsInCart(Product... products) {
		// TODO Auto-generated method stub
		
	}
	
}

class InSessionCart implements Cart {

	@Override
	public void putProductInCart(Product p) {
		System.out.println("Put product in cart IN SESSION");
		
	}

	@Override
	public void putProductsInCart(Product... products) {
		// TODO Auto-generated method stub
		
	}
	
}


interface YachtDao2 {
	
}

class DefaultYachtDao2 implements YachtDao2 {
	
}

class DefaultSuperYachtDao2 implements YachtDao2 {
	
}


class Client {
	private YachtDao2 dao;
	
	{
		dao = new DefaultSuperYachtDao2();
	}
}