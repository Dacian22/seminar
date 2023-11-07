
public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        PaperCurrentConditionsDisplay currentConditionsDisplay = new PaperCurrentConditionsDisplay(weatherStation);
        weatherStation.setMeasurements(75, 60, 30);

        ElectronicDisplay display = new ElectronicDisplay(currentConditionsDisplay);
        display.usedata();
    }
}