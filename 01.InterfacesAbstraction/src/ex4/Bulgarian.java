package ex4;

public class Bulgarian implements Person {
    private String name;

    public Bulgarian(String name){
        this.setName(name);
    }

    private void setName(String name){
        this.name = name;
    }
    @Override
    public String getName() {
        return null;
    }

    @Override
    public String sayHello() {
        return "Здравей";
    }
}
