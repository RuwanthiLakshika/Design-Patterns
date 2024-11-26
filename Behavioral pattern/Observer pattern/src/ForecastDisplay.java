public class ForecastDisplay implements WeatherObserver {
    @Override
    public void update(double temperature, double humidity) {
        System.out.println("Forecast: Conditions will likely " +
                (humidity > 60 ? "worsen" : "improve"));
    }
}
