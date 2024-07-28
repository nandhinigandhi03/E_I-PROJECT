// Observer Pattern

import java.util.ArrayList;
import java.util.List;

// Subject
class WeatherForecast {
    private List<Observer> observers;
    private double temperature;
    private double humidity;
    private double windSpeed;

    public WeatherForecast() {
        this.observers = new ArrayList<>();
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature, humidity, windSpeed);
        }
    }

    public void updateData(double temperature, double humidity, double windSpeed) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.windSpeed = windSpeed;
        notifyObservers();
    }
}

// Observer
interface Observer {
    void update(double temperature, double humidity, double windSpeed);
}

// Concrete Observers
class TemperatureDisplay implements Observer {
    @Override
    public void update(double temperature, double humidity, double windSpeed) {
        System.out.println("Temperature: " + temperature + "°C");
    }
}

class HumidityDisplay implements Observer {
    @Override
    public void update(double temperature, double humidity, double windSpeed) {
        System.out.println("Humidity: " + humidity + "%");
    }
}

class WindSpeedDisplay implements Observer {
    @Override
    public void update(double temperature, double humidity, double windSpeed) {
        System.out.println("Wind Speed: " + windSpeed + " km/h");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create weather forecast system
        WeatherForecast weatherForecast = new WeatherForecast();

        // Create display devices
        TemperatureDisplay temperatureDisplay = new TemperatureDisplay();
        HumidityDisplay humidityDisplay = new HumidityDisplay();
        WindSpeedDisplay windSpeedDisplay = new WindSpeedDisplay();

        // Register display devices as observers
        weatherForecast.registerObserver(temperatureDisplay);
        weatherForecast.registerObserver(humidityDisplay);
        weatherForecast.registerObserver(windSpeedDisplay);

        // Update weather forecast data
        weatherForecast.updateData(25, 60, 10);
    }
}
