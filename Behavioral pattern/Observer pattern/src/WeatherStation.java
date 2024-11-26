import java.util.ArrayList;
import java.util.List;
public class WeatherStation {
    private List<WeatherObserver> observers;
    private double temperature;
    private double humidity;
    public WeatherStation() {
        observers = new ArrayList<>();
    }
    public void addObserver(WeatherObserver observer) {
        observers.add(observer);
    }
    public void removeObserver(WeatherObserver observer) {
        observers.remove(observer);
    }
    public void notifyObservers() {
        for (WeatherObserver observer : observers) {
            observer.update(temperature, humidity);
        }
    }
    public void setMeasurements(double temperature, double
            humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        notifyObservers();
    }
}
