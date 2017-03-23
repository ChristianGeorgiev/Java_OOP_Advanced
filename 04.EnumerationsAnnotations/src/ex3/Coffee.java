package ex3;

import ex3.Enums.CoffeeSize;
import ex3.Enums.CoffeeType;

public class Coffee {
    private CoffeeType coffeeType;
    private CoffeeSize coffeeSize;

    public Coffee(String coffeeSize, String coffeeType){
        this.coffeeSize = CoffeeSize.valueOf(coffeeSize.toUpperCase());
        this.coffeeType = CoffeeType.valueOf(coffeeType.toUpperCase());
    }

    public CoffeeType getCoffeeType() {
        return this.coffeeType;
    }

    public CoffeeSize getCoffeeSize() {
        return this.coffeeSize;
    }

}
