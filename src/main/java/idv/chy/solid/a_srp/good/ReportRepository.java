package idv.chy.solid.a_srp.good;

// handles saving logic
public class ReportRepository {
    public void saveToFile(Report report, String filePath)  {
        System.out.println("Saving report" + report.getTitle() + " to file: " + filePath);
    }
}
