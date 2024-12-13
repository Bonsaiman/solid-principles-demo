package idv.chy.solid.a_srp.good;


/**
 * SRP - Single Responsibility Principle
 *
 * A class should have one, and only one, reason to change.
 * This means that a class should have only one job or responsibility.
 */
public class Report {
    private String title;
    private String content;

    public Report(String title, String content) {
        this.title = title;
        this.content = content;
    }

    // Getters only
    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
}