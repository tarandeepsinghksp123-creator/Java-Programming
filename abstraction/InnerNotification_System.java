class Notification_System {
    public static void main(String[] args) {
        Notification N1 = new EmailNotification();
        N1.sendnotification("Hello ");

        Notification N2 = new SMSnotification();
        N2.sendnotification("hello world");
        
    }
}
interface Notification {
    void sendnotification (String message);

}
class EmailNotification implements Notification {
    @Override 
    public void sendnotification (String message) {
        System.out.println("Email sent :" +message);
    }
}
class SMSnotification implements Notification {
    @Override 
    public void sendnotification (String message){
        System.out.println("SMS sent " +message);
    }
}