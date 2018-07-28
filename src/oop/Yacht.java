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
		Yacht y = new Yacht();
		y.test();
		y.test2();

		Yacht.test2();
		Parus p = y.new Parus();

		Parus2 p2 = new Parus2();

		Yacht.Parus2 p3 = new Yacht.Parus2();

		Class<Yacht> c = Yacht.class;
		
		YachtDao d = YachtDao.getInstance();
		YachtDao d2 = YachtDao.getInstance();
	}

	private class Parus {

	}

	private static class Parus2 {

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
