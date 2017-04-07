package main.java.ex1;

import main.java.ex1.contracts.Appender;
import main.java.ex1.contracts.Controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;


public class LogController implements Controller {

    private Appender[] appenders;

    public LogController(Appender... appenders){
        this.appenders = appenders;
    }

    @Override
    public void readInput() throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(console.readLine());
        for (int i = 0; i < n; i++) {
            String[] input = console.readLine().split("\\s+");

            if (input.length == 3){

            }
        }

        String[] input = console.readLine().split("|");
        while (!"END".equals(input[0])){


            input = console.readLine().split("|");
        }
    }

    @Override
    public Appender[] getAppenders() {
        return this.appenders;
    }
}
