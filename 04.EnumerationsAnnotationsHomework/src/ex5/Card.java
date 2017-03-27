package ex5;

public class Card implements Comparable<Card> {
    private Ranks rank;
    private Suits suit;

    public Card(Ranks rank, Suits suit){
        this.rank = rank;
        this.suit = suit;
    }

    private int calcPower() {
        return this.rank.getPower() + this.suit.getPower();
    }

    @Override
    public String toString() {
        return String.format("Card name: %s of %s; Card power: %d", this.rank.name(),
                this.suit.name(), calcPower());
    }
    @Override
    public int compareTo(Card card) {
        if (this.calcPower() > card.calcPower()) { return 1; }
        if (this.calcPower() < card.calcPower()) { return -1; }
        else { return 0; }
    }

}
