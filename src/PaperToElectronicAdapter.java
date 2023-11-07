import java.util.ArrayList;
import java.util.List;

public class PaperToElectronicAdapter implements ElectronicData,Observer,Observable{
    private PaperData data;
    private List<Observer> observers;

    public PaperToElectronicAdapter(WeatherStation data) {
        this.observers=new ArrayList<>();
        this.data = data;
        data.registerObserver(this);
    }


    @Override
    public void exportdata() {
        data.transmit();
    }

    public void diplaydata(){
        this.data.transmit();
    }
    @Override
    public void update2() {
        System.out.println("Adapter");
        this.diplaydata();
        this.notifyObserver();
    }

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
}
