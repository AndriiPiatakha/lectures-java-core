package patterns.basicpatterns.facade;

import java.util.Date;
import java.util.List;

public class Client {
	public static void main(String[] args) {
		TravelFacade facade = new TravelFacade();
		List<TravelRoute> flightsAndHotels = 
				facade.getFlightsAndHotels(new Date(), new Date());
	}
}