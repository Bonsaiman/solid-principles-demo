package idv.chy.solid.a_srp.good;

// handles printing logic
public class ReportPrinterService {
    public void print(Report report) {
        System.out.println("Printing report: " + report.getTitle());
    }
}