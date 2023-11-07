
public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        PaperToElectronicAdapter adapter = new PaperToElectronicAdapter(weatherStation);


        ElectronicDisplay display = new ElectronicDisplay(adapter);

        ElectronicDisplay2 display2 = new ElectronicDisplay2(adapter);

        weatherStation.setMeasurements(11,12,13);
    }
}