package p01_system_resources;

public class LocalTimeProvider implements TimeProvider {
    @Override
    public int getHour() {
        return 8;
    }
}
