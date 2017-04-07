package p01_system_resources;

import java.time.LocalTime;

public class Time implements TimeProvider {

    private LocalTime localTime;

    public Time(){
        this.localTime = LocalTime.now();
    }

    @Override
    public int getHour() {
        return localTime.getHour();
    }
}
