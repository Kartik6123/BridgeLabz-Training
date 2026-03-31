public class DataExport {
    interface Exporter {
        void export();

        // New default feature
        default void exportToJSON() {
            System.out.println("Exporting data to JSON format");
        }
    }
    static class CSVExporter implements Exporter {
        public void export() {
            System.out.println("Exporting data to CSV");
        }
    }
    static class PDFExporter implements Exporter {
        public void export() {
            System.out.println("Exporting data to PDF");
        }
    }

    public static void main(String[] args) {
        Exporter csv = new CSVExporter();
        csv.export();
        csv.exportToJSON(); // new default method
    }
}
