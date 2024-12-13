package idv.chy.solid.e_dip.good;

/*
 * DIP - Dependency Inversion Principle
 *
 * NotificationService depends on the abstraction MessageSender,
 * making it easy to replace EmailSender with another implementation (e.g., SmsSender).
 */
public class NotificationService {

    private MessageSender messageSender;

    public NotificationService(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void notify(String message) {
        messageSender.sendMessage(message);
    }
}