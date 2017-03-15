package ex6;

public class Pet implements IBirthday {
    private String name;
    private String birthDay;

    public Pet(String name, String birthDay){
        this.setName(name);
        this.setBirthDay(birthDay);
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    @Override
    public String getBirthday() {
        return this.birthDay;
    }
}
