package p02_services;

public class BaseService implements Service{

    private boolean isActive;
    private Writer writer;

    public BaseService(boolean isActive, Writer writer){
        this.isActive = isActive;
        this.writer = writer;
    }

    protected Writer getWriter(){
        return this.writer;
    }

    @Override
    public void sendNotification() {
    }

    @Override
    public boolean isActive() {
        return this.isActive;
    }
}
