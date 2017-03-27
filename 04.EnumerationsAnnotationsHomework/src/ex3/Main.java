package ex3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        String rank = console.readLine();
        String suit = console.readLine();

        Card card = new Card(Ranks.valueOf(rank), Suits.valueOf(suit));
        System.out.println(card);

    }
}
