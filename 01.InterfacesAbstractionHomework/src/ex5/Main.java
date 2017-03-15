package ex5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        List<Identifiable> manqci = new ArrayList<>();


        String[] input = console.readLine().split("\\s+");
        while (!"End".equals(input[0])){
            if (input.length == 2){
                Identifiable robot = new Robot(input[0], input[1]);
                manqci.add(robot);
            }else if (input.length == 3) {
                Identifiable citizen = new Citizen(input[0], Integer.valueOf(input[1]), input[2]);
                manqci.add(citizen);
            }
            input = console.readLine().split("\\s+");
        }

        String invalidId = console.readLine();
        for (Identifiable identifiable : manqci) {
            if (!checkId(identifiable.getId(), invalidId)){
                System.out.println(identifiable.getId());
            }
        }
    }

    private static boolean checkId(String id, String invalidIdString){
        Pattern pattern = Pattern.compile("[0-9]*" + invalidIdString + "(?![0-9])");
        Matcher matcher = pattern.matcher(id);
        if(matcher.find()){
            return false;
        }

        return true;
    }
}
