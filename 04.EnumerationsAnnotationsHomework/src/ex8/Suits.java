package ex8;

import ex6.Annotations.Suit;

@Suit
public enum Suits {
    CLUBS(0), DIAMONDS(13), HEARTS(26), SPADES(39);

    private int power;
    Suits(int power){
        this.power = power;
    }

    int getPower(){
        return this.power;
    }
}
