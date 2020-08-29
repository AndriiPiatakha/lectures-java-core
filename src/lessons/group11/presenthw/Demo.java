package lessons.group11.presenthw;

import java.util.Arrays;

public class Demo {

	
	public static void main(String[] args) {
		Sweet candy = new ChocolateCandy();
		candy.setName("Krasnyi Mak");
		candy.setSugarWeight(0.53);
		
		Sweet cookie = new Ovsyanoe();
		cookie.setName("Ovsyonaoy");
		cookie.setSugarWeight(0.1);
		
		Sweet lollipop = new Lollipop();
		lollipop.setName("Lollipop");
		lollipop.setSugarWeight(0.2);
		
		Gift gift = new Gift();
		gift.addSweet(candy);
		gift.addSweet(cookie);
		gift.addSweet(lollipop);
		
		Sweet[] filteredSweets = gift.filterSweetsBySugar(0, 0.20);
		System.out.println(Arrays.toString(filteredSweets));
	}
}
