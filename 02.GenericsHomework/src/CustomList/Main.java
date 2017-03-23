package CustomList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        CustomList<String> customList = new CustomList<String>();

        String[] input = console.readLine().split("\\s+");
        while (!"END".equals(input[0])){
            switch (input[0]){
                case "Add":
                    String element = input[1];
                    customList.add(element);
                    break;
                case "Remove":
                    int index = Integer.valueOf(input[1]);
                    customList.remove(index);
                    break;
                case "Contains":
                    element = input[1];
                    System.out.println(customList.contains(element));
                    break;
                case "Swap":
                    int index1 = Integer.valueOf(input[1]);
                    int index2 = Integer.valueOf(input[2]);
                    customList.swap(index1, index2);
                    break;
                case "Greater":
                    element = input[1];
                    System.out.println(customList.countGreaterThan(element));
                    break;
                case "Max":
                    System.out.println(customList.getMax());
                    break;
                case "Min":
                    System.out.println(customList.getMin());
                    break;
                case "Print":
                    System.out.println(customList.toString());
                    break;
                default:break;
            }
        }
    }
}
