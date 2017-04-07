package main.java.ex1.loggers;

import main.java.ex1.ReportLevel;
import main.java.ex1.contracts.Appender;
import main.java.ex1.contracts.ILogger;

public abstract class Logger implements ILogger {
    private Appender[] appenders;

    protected Logger(Appender... appenders){
        this.appenders = appenders;
    }

    public void log(String timeAndDate, String errorMessage, ReportLevel level){
        for (Appender appender : appenders) {
                appender.append(timeAndDate, level, errorMessage);
        }
    }
//
//    public void logWarning(String timeAndDate, String errorMessage){
//        for (Appender appender : appenders) {
//                appender.append(timeAndDate, ReportLevel.WARNING, errorMessage);
//        }
//    }
//
//    public void logError(String timeAndDate, String errorMessage){
//        for (Appender appender : appenders) {
//                appender.append(timeAndDate, ReportLevel.ERROR, errorMessage);
//        }
//    }
//    public void logCritical(String timeAndDate, String errorMessage){
//        for (Appender appender : appenders) {
//                appender.append(timeAndDate, ReportLevel.CRITICAL, errorMessage);
//        }
//    }
//    public void logFatal(String timeAndDate, String errorMessage){
//        for (Appender appender : appenders) {
//                appender.append(timeAndDate, ReportLevel.FATAL, errorMessage);
//        }
//    }
}
