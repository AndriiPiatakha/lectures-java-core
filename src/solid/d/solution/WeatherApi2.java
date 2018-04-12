package solid.d.solution;

public class WeatherApi2 implements WeatherSource {
    @Override
    public double getTemperatureCelcius() {
        return toCelcius(getTemperatureFahrenheit());
    }
 
    private double getTemperatureFahrenheit() {
		return 0;
        // some logic
    }
 
    private double toCelcius(double temperatureFahrenheit) {
        return (temperatureFahrenheit - 32) / 1.8f;
    }
}
