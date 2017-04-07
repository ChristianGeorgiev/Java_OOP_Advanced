package main.java.ex1.contracts;

import main.java.ex1.ReportLevel;

public interface ILogger {
    void log(String timeAndDate, String errorMessage, ReportLevel level);
}
