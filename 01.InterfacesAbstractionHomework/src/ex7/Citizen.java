package ex7;

public class Citizen extends Person implements Identifiable, IBirthday {
    private String id;
    private String birthDay;


    public Citizen(String name, int age, String id, String birthDay){
        super(name, age);
        this.setId(id);
        this.setBirthDay(birthDay);
    }

    private void setId(String id) {
        this.id = id;
    }

    @Override
    public String getId() {
        return this.id;
    }

    private void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    @Override
    public String getBirthday() {
        return this.birthDay;
    }

    @Override
    public void buyFood() {
        super.setFood(super.getFood() + 10);
    }
}
