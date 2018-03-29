package solid.o.reportexample;

public class BadReport {
	enum Type {
		ORDERS_PER_DAY, CONVERSION_RATES
	}

	Type type;

	String generate() {
		switch (type) {
		case ORDERS_PER_DAY:
			// do stuff
			break;
		case CONVERSION_RATES:
			// do stuff
			break;
		}
		return null;
	}
}
