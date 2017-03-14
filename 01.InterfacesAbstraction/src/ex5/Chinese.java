package ex5;

public class Chinese extends BasePerson {
    private String name;

    public Chinese(String name){
        super(name);
    }

    @Override
    public String sayHello() {
        return "Djydjybydjy";
    }
    @Override
    public String getName() {
        return super.getName();
    }
}
