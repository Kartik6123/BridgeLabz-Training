public class BrowserTab {

    private HistoryNode head;
    private HistoryNode curr;

    public void visit(String url) {
        HistoryNode n = new HistoryNode(url);

        if (head == null) {
            head = curr = n;
            return;
        }

        curr.next = null;
        n.prev = curr;
        curr.next = n;
        curr = n;
    }

    public void back() {
        if (curr != null && curr.prev != null) {
            curr = curr.prev;
            System.out.println("Back to: " + curr.url);
        } else {
            System.out.println("No back history");
        }
    }

    public void forward() {
        if (curr != null && curr.next != null) {
            curr = curr.next;
            System.out.println("Forward to: " + curr.url);
        } else {
            System.out.println("No forward history");
        }
    }

    public String getCurrentPage() {
        return curr != null ? curr.url : null;
    }
}
