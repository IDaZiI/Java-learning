package module_1.tasks.practice_interface;

public interface NotificationSender {
    void send(String message);

    default void log(String message) {
        System.out.println("LOG: " + message);
    }
}
