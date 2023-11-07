public class PaperCurrentConditionsDisplay implements Observer,Display{
    public WeatherStation weatherStation;

    public PaperCurrentConditionsDisplay(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
        this.weatherStation.registerObserver(this);
    }

    @Override
    public void display(int temperature, int humidity, int pressure) {
        System.out.println("Current Conditions Display");
    }

    @Override
    public void update2() {

    }

//    @Override
//    public void update(int temperature, int humidity, int pressure) {
//        this.display(temperature,humidity, pressure);
//        System.out.println("Temperature "+temperature);
//        System.out.println("Humidity "+humidity);
//        System.out.println("Pressure "+pressure);
//    }
}
