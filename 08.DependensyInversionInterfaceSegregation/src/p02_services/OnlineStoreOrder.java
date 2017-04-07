package p02_services;

public class OnlineStoreOrder {

    private Service[] services;

    public OnlineStoreOrder(Service... services) {
        this.services = services;
    }

    public void process() {
        for (Service service : this.services) {
            if (service.isActive()){
                service.sendNotification();
            }
        }
    }
}
