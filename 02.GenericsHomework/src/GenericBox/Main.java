package GenericBox;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        List<Double> boxes = new ArrayList<>();

        int n = Integer.valueOf(console.readLine());
        for (int i = 0; i < n; i++) {
            Double input = Double.valueOf(console.readLine());
            boxes.add(input);
        }

        Double compareEle = Double.valueOf(console.readLine());
        System.out.println(Box.greaterThanCount(boxes, compareEle));
    }
}
