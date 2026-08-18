package module_1.tasks.practice_interface;

public class PushSender implements NotificationSender {
    @Override
    public void send(String message) {
        System.out.println("Push: " + message);
    }
}
