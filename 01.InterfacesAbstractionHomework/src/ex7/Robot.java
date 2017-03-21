package ex7;

public class Robot implements Identifiable {
    private String model;
    private String id;

    public Robot(String model, String id){
        this.setModel(model);
        this.setId(id);
    }

    private void setModel(String model) {
        this.model = model;
    }

    private void setId(String id) {
        this.id = id;
    }

    public String getModel() {
        return null;
    }

    @Override
    public String getId() {
        return this.id;
    }
}
