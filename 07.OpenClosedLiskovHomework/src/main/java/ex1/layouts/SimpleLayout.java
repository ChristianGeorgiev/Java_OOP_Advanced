package main.java.ex1.layouts;

import main.java.ex1.contracts.Layout;

public class SimpleLayout implements Layout {

    private final String FORMAT = "%s - %s - %s";

    @Override
    public String getFormattedMessage(String timeAndDate, String errorLevel, String errorMessage) {
        return String.format(FORMAT, timeAndDate, errorLevel, errorMessage);
    }
}
