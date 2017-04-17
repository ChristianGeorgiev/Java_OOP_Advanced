package loggers;

public class EventLogger extends Logger {

    @Override
    public void handle(LogType type, String message) {
        if (type == LogType.ERROR || type == LogType.EVENT){
            System.out.println(type.name() + ": " + message);
        }else {
            super.passToSuccessor(type, message);
        }
    }
}
