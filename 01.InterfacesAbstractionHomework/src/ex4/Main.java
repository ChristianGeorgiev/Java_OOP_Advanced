package ex4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        String[] numbers = console.readLine().split("\\s+");
        String[] urls = console.readLine().split("\\s+");
        Smartphone smartphone = new Smartphone();

        for (String number : numbers) {
            System.out.println(smartphone.call(number));
        }
        for (String url : urls) {
            System.out.println(smartphone.browse(url));
        }

    }
}
