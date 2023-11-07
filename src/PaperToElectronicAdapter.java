public class PaperToElectronicAdapter implements ElectronicData{
    private PaperData data;

    public PaperToElectronicAdapter(PaperData data) {
        this.data = data;
    }


    @Override
    public void exportdata() {
        data.transmit();
    }
}
