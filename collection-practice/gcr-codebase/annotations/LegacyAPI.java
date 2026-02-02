public class LegacyAPI {

    @Deprecated
    void oldFeature() {
        System.out.println("Old feature");
    }

    void newFeature() {
        System.out.println("New feature");
    }
}

 class Test2 {
    public static void main(String[] args) {
        LegacyAPI api = new LegacyAPI();

        api.oldFeature();   // ⚠️ warning
        api.newFeature();
    }
}
