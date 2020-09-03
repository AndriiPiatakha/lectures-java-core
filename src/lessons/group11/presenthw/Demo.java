package lessons.group11.presenthw;

import java.util.Arrays;

public class Demo {

	
	public static void main(String[] args) {
		Sweet candy = new ChocolateCandy();
		candy.setName("Krasnyi Mak");
		candy.setSugarWeight(0.53);
		candy.setWeight(0.05);
		
		Cookie cookie = new Ovsyanoe();
		cookie.setName("Ovsyonaoy");
		cookie.setSugarWeight(0.1);
		cookie.setDoughWeight(0.3);
		cookie.setWeight(0.2);
		
		Sweet lollipop = new Lollipop();
		lollipop.setWeight(0.5);
		lollipop.setName("Lollipop");
		lollipop.setSugarWeight(0.2);
		
		Gift gift = new Gift();
		gift.addSweet(candy);
		gift.addSweet(cookie);
		gift.addSweet(lollipop);
		
		Sweet[] filteredSweets = gift.filterSweetsBySugar(0, 0.20);
		System.out.println(Arrays.toString(filteredSweets));
	
		System.out.println("Total gift weight: " + gift.calculateWeight());
		System.out.println("Dough weight: " + gift.calculateDoughWeight());
		
		
	}
}
