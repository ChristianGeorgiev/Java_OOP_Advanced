package ex8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        Player playerOne = new Player(console.readLine());
        Player playerTwo = new Player(console.readLine());


        while (playerOne.getCards().size() < 5){
            String[] cardArgs = console.readLine().split(" of ");
            Card card = null;
            try{
                card = new Card(Ranks.valueOf(cardArgs[0]), Suits.valueOf(cardArgs[1]));
            } catch (Exception e){
                System.out.println("No such card exists.");
            }

            for (Card card1 : playerOne.getCards()) {
                if (card.compareTo(card1) == 0){
                    System.out.println("Card is not in the deck.");
                    break;
                }
            }

            cardArgs = console.readLine().split(" of ");
        }
    }
}
