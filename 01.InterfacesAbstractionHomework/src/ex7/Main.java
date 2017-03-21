package ex7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Person> persons = new HashMap<>();
        int n = Integer.valueOf(console.readLine());
        for (int i = 0; i < n; i++) {
            String[] input = console.readLine().split("\\s+");
            Person person = null;
            if (input.length == 3){
                person = new Rebel(input[0], Integer.valueOf(input[1]), input[2]);
            }else {
                person = new Citizen(input[0], Integer.valueOf(input[1]), input[2], input[3]);
            }
            persons.put(person.getName(), person);
        }


        String buyerName = console.readLine();
        while (!"End".equals(buyerName)){
            if (persons.containsKey(buyerName)){
                persons.get(buyerName).buyFood();
            }
            buyerName = console.readLine();
        }

        System.out.println(calcFood(persons));

    }

    private static long calcFood(Map<String, Person> persons){
        long totalFood = 0;
        for (String s : persons.keySet()) {
            totalFood += persons.get(s).getFood();
        }
        return totalFood;
    }
}
