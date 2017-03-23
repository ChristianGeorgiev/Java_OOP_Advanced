package ex2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        String loggerImportance = console.readLine();
        Logger logger = new Logger(Importance.valueOf(loggerImportance.toUpperCase()));

        String command = console.readLine();
        while (!"END".equals(command)){
            int indexOfColon = command.indexOf(":");
            String importanceLevelMessage = command.substring(0, indexOfColon);
            String contentMessage = command.substring(indexOfColon + 2);

            Message message = new Message(Importance.valueOf(importanceLevelMessage), contentMessage);
            logger.recordMessage(message);
            command = console.readLine();
        }

        for (Message message : logger.getMessages()) {
            System.out.println(message);
        }
    }
}
