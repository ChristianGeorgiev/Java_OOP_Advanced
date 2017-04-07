package main.java.ex1.contracts;

import main.java.ex1.ReportLevel;

public interface Appender {
    void append(String timeAndDate, ReportLevel reportLevel, String errorMessage);
    void setReportLevel(ReportLevel reportLevel);
    ReportLevel getReportLevel();

}
