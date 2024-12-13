package idv.chy.solid.e_dip.bad;

/*
 * NotificationService depends directly on the EmailSender implementation, making it hard to extend or test
 */
public class NotificationService {
    private EmailSender emailSender = new EmailSender();

    public void notify(String message) {
        emailSender.sendEmail(message);
    }
}