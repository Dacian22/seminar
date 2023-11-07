public class ElectronicDisplay2 implements Observer{
    private ElectronicData data;


    public ElectronicDisplay2(PaperToElectronicAdapter data) {
        this.data = data;
        data.registerObserver(this);

    }

    public void usedata(){
        System.out.println("Export2");
        data.exportdata();
    }

    @Override
    public void update2() {
        this.usedata();
    }
}
