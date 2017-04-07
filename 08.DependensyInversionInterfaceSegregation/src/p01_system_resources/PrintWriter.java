package p01_system_resources;

public class PrintWriter implements Writer {
    @Override
    public void write(String message) {
        System.out.println(message);
    }
}
