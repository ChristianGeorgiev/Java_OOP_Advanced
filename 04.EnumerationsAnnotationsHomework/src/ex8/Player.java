package ex8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Player {
    private String name;
    private List<Card> cards;

    public Player(String name){
        this.setName(name);
        this.cards = new ArrayList<>();
    }

    public Card getHighestCard(){
        Card best = this.cards.get(0);

        for (Card card : this.cards) {
            if (card.compareTo(best) == 1){
                best = card;
            }
        }

        return best;
    }

    public void addCard(Card card){
        this.cards.add(card);
    }

    public List<Card> getCards() {
        return Collections.unmodifiableList(this.cards);
    }

    private void setName(String name) {
        this.name = name;
    }
}
