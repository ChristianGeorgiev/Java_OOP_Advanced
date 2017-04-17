package loggers;

public interface Handler {
    void handle (LogType type, String message);
    void setSuccessor(Handler successor);
}
