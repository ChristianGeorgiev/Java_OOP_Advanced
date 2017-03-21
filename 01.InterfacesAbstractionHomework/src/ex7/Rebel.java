package ex7;

public class Rebel extends Person implements Buyer {
    private String group;

    public Rebel(String name, int age, String group){
        super(name, age);
        this.setGroup(group);
    }

    private void setGroup(String group) {
        this.group = group;
    }

    @Override
    public void buyFood() {
        super.setFood(super.getFood() + 5);
    }
}
