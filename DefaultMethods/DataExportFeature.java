package java_interfaces.DefaultMethods;

interface DataExporter {
    void exportToCSV();
    void exportToPDF();
    
    default void exportToJSON() {
        System.out.println("Exporting data as JSON (Default implementation).");
    }
}

class ReportModule implements DataExporter {
    public void exportToCSV() {
        System.out.println("Exported strictly to CSV.");
    }
    
    public void exportToPDF() {
        System.out.println("Exported strictly to PDF.");
    }
}

public class DataExportFeature {
    public static void main(String[] args) {
        DataExporter report = new ReportModule();
        report.exportToCSV();
        report.exportToPDF();
        report.exportToJSON(); // Uses default method
    }
}
