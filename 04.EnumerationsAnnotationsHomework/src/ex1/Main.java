package ex1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        String input = console.readLine();
        System.out.println("Card Suits:");
            for (Cards card : Cards.values()) {
                System.out.printf("Ordinal value: %d; Name value: %s%n", card.ordinal(), card.name());
            }
    }
}
