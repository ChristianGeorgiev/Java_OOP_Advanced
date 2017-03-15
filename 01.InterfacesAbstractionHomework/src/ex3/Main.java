package ex3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.instrument.IllegalClassFormatException;

public class Main {
    public static void main(String[] args) throws IOException, IllegalClassFormatException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String driverName = console.readLine();
        Drivable car = new Ferrari(driverName);
        System.out.println(car.toString());

        String ferrariName = Ferrari.class.getSimpleName();
        String carInterface = Drivable.class.getSimpleName();
        boolean isCreated = Drivable.class.isInterface();
        if (!isCreated) {
            throw new IllegalClassFormatException("No interface created!");
        }
    }
}
