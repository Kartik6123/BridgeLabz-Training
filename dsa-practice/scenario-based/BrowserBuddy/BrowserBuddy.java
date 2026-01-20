import java.util.*;

public class BrowserBuddy {

    private Stack<BrowserTab> closedTabs = new Stack<>();

    public void closeTab(BrowserTab tab) {
        closedTabs.push(tab);
        System.out.println("Tab closed");
    }

    public BrowserTab reopenTab() {
        if (closedTabs.isEmpty()) {
            System.out.println("No closed tabs to restore");
            return null;
        }
        System.out.println("Tab restored");
        return closedTabs.pop();
    }
}
