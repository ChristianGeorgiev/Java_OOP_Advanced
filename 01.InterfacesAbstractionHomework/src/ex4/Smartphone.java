package ex4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Smartphone implements Calling, Browsing {

    public Smartphone(){

    }

    @Override
    public String call(String number) {
        for (int i = 0; i < number.length(); i++) {
            if (!Character.isDigit(number.charAt(i))){
                return "Invalid number!";
            }
        }
        return "Calling... " + number;
    }

    @Override
    public String browse(String url) {
        for (int i = 0; i < url.length(); i++) {
            if (Character.isDigit(url.charAt(i))){
                return "Invalid URL!";
            }
        }
            return "Browsing: " + url + "!";
    }
}
