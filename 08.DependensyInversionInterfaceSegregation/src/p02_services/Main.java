package p02_services;

public class Main {
    public static void main(String[] args) {
        Writer writer = new ConsoleWriter();

        Service email = new EmailNotificationService(true, writer);
        Service sms = new SmsNotificationService(true, writer);

        OnlineStoreOrder onlineStoreOrder = new OnlineStoreOrder(email, sms);
        onlineStoreOrder.process();
    }
}
