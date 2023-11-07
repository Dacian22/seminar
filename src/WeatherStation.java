import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Observable,PaperData{
    private List<Observer> observers;
    private int temperature;
    private int pressure;
    private int humidity;

    public WeatherStation() {
        this.observers = new ArrayList<>();
    }

    public void setMeasurements(int temperature, int pressure, int humidity){
        this.setTemperature(temperature);
        this.setPressure(pressure);
        this.setHumidity(humidity);

        this.notifyObserver();
    }
    public List<Observer> getObservers() {
        return observers;
    }

    public void setObservers(List<Observer> observers) {
        this.observers = observers;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public boolean removeObserver(Observer observer) {
        observers.remove(observer);
        return false;
    }

    @Override
    public void notifyObserver() {
        for(Observer observer: observers){
            observer.update2();
        }
    }

    @Override
    public void transmit() {
        System.out.println("Transmiting paper data");
    }
}

