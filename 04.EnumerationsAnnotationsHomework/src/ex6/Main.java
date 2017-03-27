package ex6;

import ex6.Annotations.Rank;
import ex6.Annotations.Suit;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        String input = console.readLine();


        if ("Rank".equals(input)){
            System.out.printf("Type = %s, Description = %s%n", Rank.type, Rank.description);
        }else {
            System.out.printf("Type = %s, Description = %s%n", Suit.type, Suit.description);
        }

    }
}
