package module_1.block_1.OOP.tasks.practice_interface;

public class Main {
    static void notifyUser(NotificationSender sender, String message) {
        sender.log(message);
        sender.send(message);
    }

    public static void main(String[] args) {
        notifyUser(new EmailSender(), "Привет!");
        notifyUser(new SmsSender(), "Привет!");
        notifyUser(new PushSender(), "Привет!");

        System.out.println("--------Тестирование Configurable--------");

        EmailSender email = new EmailSender();
        notifyUser(email, "Hello!");
        email.disable();
        notifyUser(email, "Hello after disable!");
        email.enable();
        notifyUser(email, "Hello after enable!");
    }
}
