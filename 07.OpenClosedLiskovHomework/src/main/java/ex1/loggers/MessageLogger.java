package main.java.ex1.loggers;

import main.java.ex1.contracts.Appender;

public class MessageLogger extends Logger {

    public MessageLogger(Appender... appenders){
        super(appenders);
    }
}
