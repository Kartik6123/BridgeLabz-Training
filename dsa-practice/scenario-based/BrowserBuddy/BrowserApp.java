public class BrowserApp {
    public static void main(String[] args) {

        BrowserTab tab = new BrowserTab();

        tab.visit("google.com");
        tab.visit("github.com");
        tab.visit("stackoverflow.com");

        tab.back();
        tab.back();
        tab.forward();

        BrowserBuddy buddy = new BrowserBuddy();

        buddy.closeTab(tab);

        BrowserTab restored = buddy.reopenTab();
        System.out.println("Current page: " + restored.getCurrentPage());
    }
}

