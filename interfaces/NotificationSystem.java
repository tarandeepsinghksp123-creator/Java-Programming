package interfaces;

public class NotificationSystem {
    public static void main(String[] args) {
        Notification E = new EmailNotification();
        E.showStatus();
        Notification.displayInfo();
        E.sendNotification();

        Notification S = new SMSNotification();
        S.showStatus();
        Notification.displayInfo();
        S.sendNotification();

        Notification P = new pushNotification();
        P.showStatus();
        Notification.displayInfo();
        P.sendNotification();

    }

}

interface Notification {
    void sendNotification();

    default void showStatus() {
        System.out.println("Status is showing");

    }

    static void displayInfo() {
        System.out.println("Info");
    }
}

class EmailNotification implements Notification {
    @Override
    public void sendNotification() {
        System.out.println("Sent by email");
    }

}

class SMSNotification implements Notification {
    @Override
    public void sendNotification() {
        System.out.println("Sent by SMS");
    }

}

class pushNotification implements Notification {
    @Override
    public void sendNotification() {
        System.out.println("Sent by push notificaiton");
    }

}
