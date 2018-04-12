package solid.d.solution;

import java.util.List;

public class WeatherAggregator {
    private List<WeatherSource> weatherSources;
 
    public WeatherAggregator(List<WeatherSource> weatherSources) {
        this.weatherSources = weatherSources;
    }
 
    public double getTemperature() {
        return weatherSources
            .stream()
            .mapToDouble(WeatherSource::getTemperatureCelcius)
            .average()
            .getAsDouble();
    }
}
