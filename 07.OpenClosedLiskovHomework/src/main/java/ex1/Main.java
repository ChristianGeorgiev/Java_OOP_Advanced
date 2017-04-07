package main.java.ex1;

import main.java.ex1.appenders.ConsoleAppender;
import main.java.ex1.contracts.Appender;
import main.java.ex1.contracts.Layout;
import main.java.ex1.layouts.SimpleLayout;
import main.java.ex1.loggers.Logger;
import main.java.ex1.loggers.MessageLogger;

public class Main {
    public static void main(String[] args) {
        Layout simpleLayout = new SimpleLayout();
        Appender consoleAppender = new ConsoleAppender(simpleLayout);
        consoleAppender.setReportLevel(ReportLevel.ERROR);

        Logger logger = new MessageLogger(consoleAppender);

        logger.log("3/31/2015 5:33:07 PM", "Everything seems fine", ReportLevel.valueOf("CRITICAL"));

        //Implement LoggerController class
        //Implement Input Handling



    }
}
