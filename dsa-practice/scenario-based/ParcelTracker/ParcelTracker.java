public class ParcelTracker {

    private ParcelNode head;

    public void addStage(String stage) {
        ParcelNode n = new ParcelNode(stage);
        if (head == null) {
            head = n;
            return;
        }
        ParcelNode t = head;
        while (t.next != null) {
            t = t.next;
        }
        t.next = n;
    }

    public void addCheckpoint(String afterStage, String newStage) {
        ParcelNode t = head;
        while (t != null) {
            if (t.stage.equals(afterStage)) {
                ParcelNode n = new ParcelNode(newStage);
                n.next = t.next;
                t.next = n;
                return;
            }
            t = t.next;
        }
        System.out.println("Checkpoint insertion failed: stage not found");
    }

    public void trackParcel() {
        ParcelNode t = head;
        if (t == null) {
            System.out.println("Parcel lost (no tracking data)");
            return;
        }
        while (t != null) {
            System.out.print(t.stage);
            if (t.next != null) System.out.print(" -> ");
            t = t.next;
        }
        System.out.println();
    }
}
