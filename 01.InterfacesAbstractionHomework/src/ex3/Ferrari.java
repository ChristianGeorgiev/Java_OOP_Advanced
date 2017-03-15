package ex3;

public class Ferrari implements Drivable{
    String model;
    String driverName;

    public Ferrari(String driverName){
        this.setModel("488-Spider");
        this.setDriverName(driverName);
    }

    private void setModel(String model) {
        this.model = model;
    }

    private void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    @Override
    public String useBrakes() {
        return "Brakes!";
    }

    @Override
    public String pushGas() {
        return "Zadu6avam sA!";
    }

    @Override
    public String toString(){
        return String.format("%s/%s/%s/%s", this.model, this.useBrakes(), this.pushGas(), this.driverName);
    }

}
