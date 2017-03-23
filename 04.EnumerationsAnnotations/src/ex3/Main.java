package ex3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        CoffeeMachine coffeeMachine = new CoffeeMachine();

        String command = console.readLine();
        while (!"END".equals(command)){
            String[] commandArgs = command.split("\\s+");

            if (commandArgs.length == 1){
                coffeeMachine.insertCoin(commandArgs[0]);
            }else {
                coffeeMachine.buyCoffee(commandArgs[0], commandArgs[1]);
            }

            command = console.readLine();
        }
    }
}
