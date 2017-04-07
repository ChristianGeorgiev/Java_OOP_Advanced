package p01_system_resources;


public class GreetingClock {

    private TimeProvider time;
    private Writer writer;

    public GreetingClock(TimeProvider time, Writer writer) {
        this.time = time;
        this.writer = writer;
    }

    public void greeting() {
        if (time.getHour() < 12) {
            this.writer.write("Good morning...");
        } else if (time.getHour() < 18) {
            this.writer.write("Good afternoon...");
        } else {
            this.writer.write("Good evening...");
        }
    }

    public static void main(String[] args) {
        TimeProvider time = new Time();
        TimeProvider provider = new LocalTimeProvider();

        Writer writer = new PrintWriter();

        GreetingClock gc = new GreetingClock(time, writer);
        gc.greeting();
    }
}
