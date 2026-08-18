package module_1.block_1.OOP.tasks.practice_interface;

public class EmailSender implements NotificationSender, Configurable {
    private boolean enabled = true;

    @Override
    public void send(String message) {
        if (enabled) {
            System.out.println("Email: " + message);
        } else System.out.println("Email notifications are disabled");
    }
    
    @Override
    public void enable() {
        enabled = true;
    }

    @Override
    public void disable() {
        enabled = false;
    }
}
