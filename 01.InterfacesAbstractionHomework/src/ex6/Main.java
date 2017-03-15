package ex6;

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
        List<IBirthday> birthdayList = new ArrayList<>();

        String[] input = console.readLine().split("\\s+");
        while (!"End".equals(input[0])){
            switch (input[0]){
                case "Citizen":
                    IBirthday citizen = new Citizen(input[1], Integer.valueOf(input[2]), input[3], input[4]);
                    birthdayList.add(citizen);
                    break;
                case "Pet":
                    IBirthday pet = new Pet(input[1], input[2]);
                    birthdayList.add(pet);
                    break;
                default:
                    break;
            }
            input = console.readLine().split("\\s+");
        }

        String year = console.readLine();
        for (IBirthday identifiable : birthdayList) {
            if (!checkBirthDay(identifiable.getBirthday(), year)){
                System.out.println(identifiable.getBirthday());
            }
        }
    }

    private static boolean checkBirthDay(String birthday, String year){
        Pattern pattern = Pattern.compile("[0-9]+\\/[0-9]+\\/" + year);
        Matcher matcher = pattern.matcher(birthday);
        if(matcher.find()){
            return false;
        }

        return true;
    }
}
