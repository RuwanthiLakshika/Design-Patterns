public class WeatherStationApp {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        CurrentConditionsDisplay currentDisplay = new
                CurrentConditionsDisplay();
        ForecastDisplay forecastDisplay = new ForecastDisplay();
        weatherStation.addObserver(currentDisplay);
        weatherStation.addObserver(forecastDisplay);
        System.out.println("Weather update 1:");
        weatherStation.setMeasurements(28.5, 65.0);
        System.out.println("\nWeather update 2:");
        weatherStation.setMeasurements(30.0, 55.0);
    }
}