package ex6;

public class Citizen implements Identifiable, IBirthday {

    private String name;
    private int age;
    private String id;
    private String birthDay;

    public Citizen(String name, int age, String id, String birthDay){
        this.setName(name);
        this.setAge(age);
        this.setId(id);
        this.setBirthDay(birthDay);
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setAge(int age) {
        this.age = age;
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
}
