package ex3;

import ex3.Enums.Coin;
import java.util.ArrayList;
import java.util.List;

public class CoffeeMachine {
    private List<Coffee> coffeeSold;
    private int coins;

    public CoffeeMachine(){
        this.coffeeSold = new ArrayList<>();
        this.coins = 0;
    }

    public void buyCoffee(String size, String type){
        Coffee coffee = new Coffee(size, type);
        if (coffee.getCoffeeSize().getPrice() <= this.coins){
            this.coffeeSold.add(coffee);
            this.coins = 0;
        }
    }

    public void insertCoin(String coin){
        Coin c = Coin.valueOf(coin);
        this.coins += c.getPrice();
    }

    public Iterable<Coffee> coffeesSold(){
        return this.coffeeSold;
    }



}
