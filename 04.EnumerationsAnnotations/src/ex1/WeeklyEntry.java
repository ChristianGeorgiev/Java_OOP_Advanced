package ex1;

import java.util.Comparator;

public class WeeklyEntry {
    public final static Comparator<WeeklyEntry> COMPARE_BY_WEEKDAY = getCompareByWeekday();

    private Weekday weekday;
    private String notes;


    public WeeklyEntry(String weekday, String notes){
        this.weekday = Weekday.valueOf(Weekday.class, weekday);
        this.notes = notes;
    }

    private static Comparator<WeeklyEntry> getCompareByWeekday(){
        return Comparator.comparingInt(e -> e.weekday.ordinal());
    }

    @Override
    public String toString(){
        return String.format("%s - %s", this.weekday, this.notes);
    }
}
