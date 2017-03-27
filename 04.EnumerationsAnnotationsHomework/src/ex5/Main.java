package ex5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        String rank1 = console.readLine();
        String suit1 = console.readLine();

        String rank2 = console.readLine();
        String suit2 = console.readLine();

        Card card1 = new Card(Ranks.valueOf(rank1), Suits.valueOf(suit1));
        Card card2 = new Card(Ranks.valueOf(rank2), Suits.valueOf(suit2));

        if (card1.compareTo(card2) == 1){
            System.out.println(card1);
        }else {
            System.out.println(card2);
        }

    }
}
