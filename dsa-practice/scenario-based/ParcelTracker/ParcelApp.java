public class ParcelApp {
    public static void main(String[] args) {

        ParcelTracker pt = new ParcelTracker();

        pt.addStage("Packed");
        pt.addStage("Shipped");
        pt.addStage("In Transit");
        pt.addStage("Delivered");

        pt.addCheckpoint("Shipped", "Custom Checkpoint");

        pt.trackParcel();
    }
}
