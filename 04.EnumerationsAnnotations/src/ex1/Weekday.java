package ex1;

public enum Weekday {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    @Override
    public String toString(){
        String lower = super.name().toLowerCase();
        return super.name().charAt(0) + lower.substring(1);
    }
}
