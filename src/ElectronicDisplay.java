public class ElectronicDisplay {
    private ElectronicData data;
    private PaperCurrentConditionsDisplay display;

    public ElectronicDisplay(PaperCurrentConditionsDisplay display) {
        this.display = display;
    }

    public void usedata(){
        data=new PaperToElectronicAdapter(display.weatherStation);
        data.exportdata();
    }
}
