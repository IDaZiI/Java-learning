package module_1.block_1.OOP.tasks.practice_interface;

public class SmsSender implements NotificationSender {
    @Override
    public void send(String message) {
        System.out.println("SMS: " + message);
    }
}
