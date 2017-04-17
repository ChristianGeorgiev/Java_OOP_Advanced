package loggers;

public class CombatLogger extends Logger {

    @Override
    public void handle(LogType type, String message) {
        if (type == LogType.ATTACK || type == LogType.MAGIC || type == LogType.TARGET){
            System.out.println(type.name() + ": " + message);
        }else {
            super.passToSuccessor(type, message);
        }
    }
}
