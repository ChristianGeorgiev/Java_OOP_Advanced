package p02_services;

public class EmailNotificationService extends BaseService{

    private boolean isActive;

    public EmailNotificationService(boolean isActive, Writer writer) {
        super(isActive, writer);
    }

    @Override
    public void sendNotification() {
        super.getWriter().write("EMAIL");
    }

    @Override
    public boolean isActive() {
        return super.isActive();
    }
}
