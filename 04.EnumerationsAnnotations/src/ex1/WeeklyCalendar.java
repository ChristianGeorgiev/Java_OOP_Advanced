package ex1;

import java.util.ArrayList;
import java.util.List;

public class WeeklyCalendar {

    private List<WeeklyEntry> entries;

    public WeeklyCalendar(){
        this.entries = new ArrayList<>();
    }

    public void addEntry(String weekday, String notes){
        WeeklyEntry we = new WeeklyEntry(weekday.toUpperCase(), notes);
        this.entries.add(we);
    }

    public Iterable<WeeklyEntry> getWeeklySchedule(){
        this.entries.sort(WeeklyEntry.COMPARE_BY_WEEKDAY);
        return this.entries;
    }
}
