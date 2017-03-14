package ex5;

public class Bulgarian extends BasePerson {
    public Bulgarian(String name){
        super(name);
    }

    @Override
    public String sayHello() {
        return "Здравей";
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
