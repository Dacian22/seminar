public class ElectronicDisplay implements Observer{
    private ElectronicData data;


    public ElectronicDisplay(ElectronicData data) {
        this.data = data;

    }

    public void usedata(){
        System.out.println("Export");
        data.exportdata();
    }

    @Override
    public void update2() {
        this.usedata();
    }
}
