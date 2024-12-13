package idv.chy.solid.e_dip.good;

public class SmsSender implements MessageSender {

    @Override
    public void sendMessage(String message) {
        System.out.println("Sending SMS: " + message);
    }
}