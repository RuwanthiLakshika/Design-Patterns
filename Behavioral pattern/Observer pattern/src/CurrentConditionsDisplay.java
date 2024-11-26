public class CurrentConditionsDisplay implements WeatherObserver {
    @Override
    public void update(double temperature, double humidity) {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }
}
