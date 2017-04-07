package p02_services;

public class SmsNotificationService extends BaseService {


    public SmsNotificationService(boolean isActive, Writer writer) {
        super(isActive, writer);
    }

    @Override
    public void sendNotification() {
        super.getWriter().write("SMS");
    }

    @Override
    public boolean isActive() {
        return super.isActive();
    }
}
