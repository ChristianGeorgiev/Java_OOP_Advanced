package ex7;

public abstract class Person implements Buyer {
    private String name;
    private int age;
    private int food;

    protected Person (String name, int age){
        this.name = name;
        this.age = age;
        this.setFood(0);
    }

    protected int getAge(){
        return this.age;
    }

    protected String getName(){
        return this.name;
    }

    protected void setFood(int food){
        this.food = food;
    }

    protected int getFood() {
        return this.food;
    }
}
