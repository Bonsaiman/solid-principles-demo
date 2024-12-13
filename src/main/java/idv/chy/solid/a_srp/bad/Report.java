package idv.chy.solid.a_srp.bad;



/*
 * The Report class has multiple responsibilities:
 *      Storing report data
 *      Handling saving logic
 *      Handling printing logic
 * If any of these responsibilities change, the class must be modified, violating SRP
 */
public class Report {
    private String title;
    private String content;

    public Report(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public void saveToFile(String filePath)  {
        System.out.println("Saving report to file...");
    }

    public void print() {
        System.out.println("Printing report...");
    }
}