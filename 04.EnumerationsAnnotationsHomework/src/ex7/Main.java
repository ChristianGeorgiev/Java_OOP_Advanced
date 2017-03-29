package ex7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        String input = console.readLine();

        for (int i = 0; i < Suits.values().length; i++) {
            for (int j = 0; j < Ranks.values().length; j++) {
                System.out.printf("%s of %s%n", Ranks.values()[j].name(), Suits.values()[i].name());
            }
        }
    }
}
