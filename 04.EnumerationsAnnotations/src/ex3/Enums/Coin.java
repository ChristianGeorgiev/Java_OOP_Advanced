package ex3.Enums;

public enum Coin {
    ONE(1), TWO(2), FIVE(5), TEN(10), TWENTY(20), FIFTY(50);

    private int price;

    Coin(int price){
        this.price = price;
    }

    public int getPrice(){
        return this.price;
    }
}
