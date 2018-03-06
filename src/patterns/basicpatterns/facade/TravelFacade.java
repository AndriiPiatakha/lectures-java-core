package patterns.basicpatterns.facade;

import java.util.Collections;
import java.util.Date;
import java.util.List;

public class TravelFacade {
	private HotelBooker hotelBooker;
	private FlightBooker flightBooker;

	public List<TravelRoute> getFlightsAndHotels(
			Date from, Date to) {
		List<Flight> flights = 
				flightBooker.getFlightsFor(from, to);
		List<Hotel> hotels = 
				hotelBooker.getHotelsFor(from, to);
		// process and return
		return Collections.emptyList();
	}
}