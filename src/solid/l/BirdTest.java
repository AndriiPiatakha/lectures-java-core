package solid.l;

import java.util.ArrayList;
import java.util.List;

public class BirdTest{

	public static void main(String[] args) {
		List<Bird> birdList = new ArrayList<Bird>();
		birdList.add(new Bird());
		birdList.add(new Crow());
		birdList.add(new Ostrich());
		letTheBirdsFly(birdList);
	}

	static void letTheBirdsFly(List<Bird> birdList) {
		for (Bird b : birdList) {
			b.fly();
		}
	}
}

class Bird {

	public void fly() {
	}

	public void eat() {
	}

}

class Crow extends Bird {
}

class Ostrich extends Bird {
	@Override
	public void fly() {
		throw new UnsupportedOperationException();
	}
}
