package solid.d.problem;

public class WeatherAggregator {
    private WeatherApi1 weatherApi1 = new WeatherApi1();
    private WeatherApi2 weatherApi2 = new WeatherApi2();
 
    public double getTemperature() {
        return (weatherApi1.getTemperatureCelcius() + toCelcius(weatherApi2.getTemperatureFahrenheit())) / 2;
    }
 
    private double toCelcius(double temperatureFahrenheit) {
        return (temperatureFahrenheit - 32) / 1.8f;
    }
}
